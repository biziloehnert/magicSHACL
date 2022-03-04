/*
 * generated by Xtext 2.24.0
 */
package xtext.magicSHACL.generator

import java.util.ArrayList
import java.util.List
import java.util.Stack
import magicSHACL.PropertyType
import magicSHACL.ShapeConstraint
import magicSHACL.ShapeExpression
import magicSHACL.Target
import magicSHACL.Value
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import magicSHACL.ShapeName
import magicSHACL.impl.ShapeConstraintImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import magicSHACL.impl.ShapeExpressionImpl
import magicSHACL.impl.ValueImpl
import magicSHACL.ShapesGraph

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SimpleGenerator extends AbstractGenerator {
	List<ShapeConstraint> magicShapes
	List<String> modifiedShapes
	Stack<ShapeName> adornedShapes
		 
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if(!resource.URI.lastSegment.contains("_magic") && !resource.URI.path.contains("src-gen")){
			adornedShapes = new Stack	
			magicShapes= new ArrayList
			modifiedShapes= new ArrayList
			
			buildQuerySeeds(resource.allContents.filter(Target).toList)
			while(!adornedShapes.empty()){
				val s_a = adornedShapes.pop;
				for (r : resource.allContents.filter(ShapeConstraint).filter[c | c.shapeName.name == s_a.name && !c.shapeName.adorned].toIterable){
					adorn(r)
					generate(r)
					modify(r)
				} 
				
				for(d : resource.allContents.filter(ShapeConstraint).filter[c | c.dangerous && !c.shapeName.adorned && c.contains(s_a)].toIterable){
					val d_s = swap(d,s_a)
					adorn(d_s)
					generate(d_s)
				}
			}
			
			fsa.generateFile(resource.URI.lastSegment.replace(".", "_magic."), '''
				«FOR ms : magicShapes»«
					ms.shapeName.name» :- «ms.shapeExpressions.get(0).expToString» ;
				«ENDFOR»
				
				«FOR ms : modifiedShapes»«
					ms»;
				«ENDFOR»
 			''');
		}
	}
	
	private def expToString(ShapeExpression exp){
		val values = exp.values
		val valueMagicShape = values.get(values.size-1).name
		
		if(exp.type == PropertyType.PREDICATE_PATH || 
			exp.type == PropertyType.INVERSE_PATH) {
			val valuePath = values.get(0).name
			
			return exp.type.propertyToString + valuePath + ' ' + valueMagicShape
		}
		
		if(exp.type == PropertyType.MAX_COUNT_CONSTRAINT_COMPONENT || 
			exp.type == PropertyType.MIN_COUNT_CONSTRAINT_COMPONENT) {
			val valuePath = values.get(1).name
			val count = values.get(0).name
			return exp.type.propertyToString + count + ' ' + valuePath + ' ' + valueMagicShape
		}
		
		return valueMagicShape
	}
	
	private def buildQuerySeeds(List<Target> targets){
		for(Target t : targets){
			adornedShapes.push(t.shapeName)
			magicShapes.add(t.getMagicQuerySeed)				
		}
	}
	
	private def adorn(ShapeConstraint r){
		r.shapeName.adorned = true;
		for(shapes : r.eAllContents.filter(Value).filter[v | v.isIdb].toList){
			shapes.adorned = true;
			adornedShapes.add(shapes.toShapeName)
		}
	}
	
	
	private def generate(ShapeConstraint r){
		for(s_b : r.eAllContents.filter(Value).filter[v | v.isAdorned].toIterable){
			var magicConstraint = new ShapeConstraintImpl
			var magicExpression = new ShapeExpressionImpl
			var magicValue = new ValueImpl
			
			val expression = (s_b.eContainer as ShapeExpression) 
			if(expression.type == PropertyType.MAX_COUNT_CONSTRAINT_COMPONENT || 
				expression.type == PropertyType.MIN_COUNT_CONSTRAINT_COMPONENT|| 
				expression.type == PropertyType.PREDICATE_PATH
			){
				magicExpression.type = PropertyType.INVERSE_PATH
				magicExpression.values.add(EcoreUtil.copy(expression.values.get(expression.values.size-2))) //path
			} else if (expression.type == PropertyType.INVERSE_PATH){
				magicExpression.type = PropertyType.PREDICATE_PATH
				magicExpression.values.add(EcoreUtil.copy(expression.values.get(expression.values.size-2))) //path
			} else	
				magicExpression.type = PropertyType.PROPERTY
			
			magicConstraint.shapeName = s_b.toShapeName.magicShapeName
			magicValue.name = r.shapeName.magicShapeName.name
				
			magicExpression.values.add(magicValue)
			magicConstraint.shapeExpressions.add(magicExpression)
				
			if(!magicShapes.contains(magicConstraint))
				magicShapes.add(magicConstraint)
				
		}
	}
	
	private def modify(ShapeConstraint r){
		if (r.shapeExpressions.size == 0)
			return;
			
		val shapeName = r.shapeName.name
		val originalShape = shapeName + "_original :- " + r.shapeExpressions.get(0)
		val modifiedShape = shapeName + " :- " + shapeName + "_magic AND " + shapeName + "_original"
		
		if(!modifiedShapes.contains(originalShape))
			modifiedShapes.add(originalShape)	
		if(!modifiedShapes.contains(modifiedShape))
			modifiedShapes.add(modifiedShape)
	}
	
	private def swap(ShapeConstraint d, ShapeName s){
		var constraint = new ShapeConstraintImpl
		var expression = EcoreUtil.copy(d.shapeExpressions.findFirst[e | e.contains(s.name)])
		var swaped_exp = new ShapeExpressionImpl
		var value = new ValueImpl
		
		if(expression.type == PropertyType.MAX_COUNT_CONSTRAINT_COMPONENT || 
				expression.type == PropertyType.MIN_COUNT_CONSTRAINT_COMPONENT|| 
				expression.type == PropertyType.PREDICATE_PATH
			){
				swaped_exp.type = PropertyType.INVERSE_PATH
				swaped_exp.values.add(expression.values.get(expression.values.size-2)) //path
				value.name = expression.values.get(expression.values.size-1).name	
			} else if (expression.type == PropertyType.INVERSE_PATH){
				swaped_exp.type = PropertyType.PREDICATE_PATH
				swaped_exp.values.add(expression.values.get(expression.values.size-2)) //path
				value.name = expression.values.get(expression.values.size-1).name
			} else
				swaped_exp.type = PropertyType.PROPERTY
		
		constraint.shapeName = EcoreUtil.copy(s)
		value.name = d.shapeName.name
		
		swaped_exp.values.add(value)
		constraint.shapeExpressions.add(swaped_exp)
		
		(d.eContainer as ShapesGraph).getShapeConstraints().add(constraint);
	
		return constraint;
	}
	
	private def propertyToString(PropertyType type){
		switch(type){
			case PREDICATE_PATH: 'SOME '
			case INVERSE_PATH: 'SOME ^'
			case MAX_COUNT_CONSTRAINT_COMPONENT: 'MAX '
			case MIN_COUNT_CONSTRAINT_COMPONENT: 'MIN '
			case NOT_CONSTRAINT_COMPONENT: 'NOT '
			case AND_CONSTRAINT_COMPONENT: 'AND '
			case OR_CONSTRAINT_COMPONENT: 'OR '
			case PROPERTY: 'AND '
			default: {
			} 
		}
	}
}
