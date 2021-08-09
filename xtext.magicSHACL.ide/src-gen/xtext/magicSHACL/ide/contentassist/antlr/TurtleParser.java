/*
 * generated by Xtext 2.24.0
 */
package xtext.magicSHACL.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import xtext.magicSHACL.ide.contentassist.antlr.internal.InternalTurtleParser;
import xtext.magicSHACL.services.TurtleGrammarAccess;

public class TurtleParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TurtleGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TurtleGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSubjectAccess().getNameAlternatives_1_0(), "rule__Subject__NameAlternatives_1_0");
			builder.put(grammarAccess.getShapeConstraintAccess().getAlternatives_2(), "rule__ShapeConstraint__Alternatives_2");
			builder.put(grammarAccess.getTargetAccess().getTypeAlternatives_1_0(), "rule__Target__TypeAlternatives_1_0");
			builder.put(grammarAccess.getTargetAccess().getTermAlternatives_2_0(), "rule__Target__TermAlternatives_2_0");
			builder.put(grammarAccess.getShapeNameAccess().getNameAlternatives_1_0(), "rule__ShapeName__NameAlternatives_1_0");
			builder.put(grammarAccess.getShapeExpressionAccess().getAlternatives_1(), "rule__ShapeExpression__Alternatives_1");
			builder.put(grammarAccess.getShapeExpressionAccess().getAlternatives_1_1_2(), "rule__ShapeExpression__Alternatives_1_1_2");
			builder.put(grammarAccess.getValueAccess().getNameAlternatives_1_0(), "rule__Value__NameAlternatives_1_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getPropertyTypeAccess().getAlternatives(), "rule__PropertyType__Alternatives");
			builder.put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
			builder.put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
			builder.put(grammarAccess.getDataGraphAccess().getGroup(), "rule__DataGraph__Group__0");
			builder.put(grammarAccess.getTriplesAccess().getGroup(), "rule__Triples__Group__0");
			builder.put(grammarAccess.getPredicateObjectAccess().getGroup(), "rule__PredicateObject__Group__0");
			builder.put(grammarAccess.getPredicateObjectAccess().getGroup_0(), "rule__PredicateObject__Group_0__0");
			builder.put(grammarAccess.getSubjectAccess().getGroup(), "rule__Subject__Group__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
			builder.put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
			builder.put(grammarAccess.getObjectAccess().getGroup_2(), "rule__Object__Group_2__0");
			builder.put(grammarAccess.getShapesGraphAccess().getGroup(), "rule__ShapesGraph__Group__0");
			builder.put(grammarAccess.getShapeConstraintAccess().getGroup(), "rule__ShapeConstraint__Group__0");
			builder.put(grammarAccess.getTargetAccess().getGroup(), "rule__Target__Group__0");
			builder.put(grammarAccess.getShapeNameAccess().getGroup(), "rule__ShapeName__Group__0");
			builder.put(grammarAccess.getShapeExpressionAccess().getGroup(), "rule__ShapeExpression__Group__0");
			builder.put(grammarAccess.getShapeExpressionAccess().getGroup_1_0(), "rule__ShapeExpression__Group_1_0__0");
			builder.put(grammarAccess.getShapeExpressionAccess().getGroup_1_0_2(), "rule__ShapeExpression__Group_1_0_2__0");
			builder.put(grammarAccess.getShapeExpressionAccess().getGroup_1_1(), "rule__ShapeExpression__Group_1_1__0");
			builder.put(grammarAccess.getShapeExpressionAccess().getGroup_1_2(), "rule__ShapeExpression__Group_1_2__0");
			builder.put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
			builder.put(grammarAccess.getValueAccess().getGroup_3(), "rule__Value__Group_3__0");
			builder.put(grammarAccess.getGraphAccess().getNamespacesAssignment_1(), "rule__Graph__NamespacesAssignment_1");
			builder.put(grammarAccess.getGraphAccess().getDataGraphAssignment_2(), "rule__Graph__DataGraphAssignment_2");
			builder.put(grammarAccess.getGraphAccess().getShapesGraphAssignment_3(), "rule__Graph__ShapesGraphAssignment_3");
			builder.put(grammarAccess.getNamespaceAccess().getPrefixAssignment_1(), "rule__Namespace__PrefixAssignment_1");
			builder.put(grammarAccess.getNamespaceAccess().getNamespaceAssignment_2(), "rule__Namespace__NamespaceAssignment_2");
			builder.put(grammarAccess.getDataGraphAccess().getTriplesAssignment_1(), "rule__DataGraph__TriplesAssignment_1");
			builder.put(grammarAccess.getTriplesAccess().getSubjectAssignment_0(), "rule__Triples__SubjectAssignment_0");
			builder.put(grammarAccess.getTriplesAccess().getPredicateobjectAssignment_1(), "rule__Triples__PredicateobjectAssignment_1");
			builder.put(grammarAccess.getPredicateObjectAccess().getPredicateAssignment_0_0(), "rule__PredicateObject__PredicateAssignment_0_0");
			builder.put(grammarAccess.getPredicateObjectAccess().getObjectAssignment_0_1(), "rule__PredicateObject__ObjectAssignment_0_1");
			builder.put(grammarAccess.getSubjectAccess().getNameAssignment_1(), "rule__Subject__NameAssignment_1");
			builder.put(grammarAccess.getPredicateAccess().getNameAssignment_1(), "rule__Predicate__NameAssignment_1");
			builder.put(grammarAccess.getObjectAccess().getNameAssignment_1(), "rule__Object__NameAssignment_1");
			builder.put(grammarAccess.getObjectAccess().getXsdTypeAssignment_2_1(), "rule__Object__XsdTypeAssignment_2_1");
			builder.put(grammarAccess.getShapesGraphAccess().getShapeConstraintsAssignment_1(), "rule__ShapesGraph__ShapeConstraintsAssignment_1");
			builder.put(grammarAccess.getShapeConstraintAccess().getShapeNameAssignment_1(), "rule__ShapeConstraint__ShapeNameAssignment_1");
			builder.put(grammarAccess.getShapeConstraintAccess().getTargetsAssignment_2_0(), "rule__ShapeConstraint__TargetsAssignment_2_0");
			builder.put(grammarAccess.getShapeConstraintAccess().getShapeExpressionsAssignment_2_1(), "rule__ShapeConstraint__ShapeExpressionsAssignment_2_1");
			builder.put(grammarAccess.getTargetAccess().getTypeAssignment_1(), "rule__Target__TypeAssignment_1");
			builder.put(grammarAccess.getTargetAccess().getTermAssignment_2(), "rule__Target__TermAssignment_2");
			builder.put(grammarAccess.getShapeNameAccess().getNameAssignment_1(), "rule__ShapeName__NameAssignment_1");
			builder.put(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_0_0(), "rule__ShapeExpression__TypeAssignment_1_0_0");
			builder.put(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0_1(), "rule__ShapeExpression__ValuesAssignment_1_0_1");
			builder.put(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_0_2_1(), "rule__ShapeExpression__ValuesAssignment_1_0_2_1");
			builder.put(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_1_0(), "rule__ShapeExpression__TypeAssignment_1_1_0");
			builder.put(grammarAccess.getShapeExpressionAccess().getValuesAssignment_1_1_2_0(), "rule__ShapeExpression__ValuesAssignment_1_1_2_0");
			builder.put(grammarAccess.getShapeExpressionAccess().getShapeExpressionsAssignment_1_1_2_1(), "rule__ShapeExpression__ShapeExpressionsAssignment_1_1_2_1");
			builder.put(grammarAccess.getShapeExpressionAccess().getTypeAssignment_1_2_0(), "rule__ShapeExpression__TypeAssignment_1_2_0");
			builder.put(grammarAccess.getShapeExpressionAccess().getShapeExpressionsAssignment_1_2_2(), "rule__ShapeExpression__ShapeExpressionsAssignment_1_2_2");
			builder.put(grammarAccess.getValueAccess().getNameAssignment_1(), "rule__Value__NameAssignment_1");
			builder.put(grammarAccess.getValueAccess().getXsdTypeAssignment_3_1(), "rule__Value__XsdTypeAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TurtleGrammarAccess grammarAccess;

	@Override
	protected InternalTurtleParser createParser() {
		InternalTurtleParser result = new InternalTurtleParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TurtleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TurtleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
