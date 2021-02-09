/**
 */
package magicSHACL.util;

import magicSHACL.DataGraph;
import magicSHACL.Graph;
import magicSHACL.MagicSHACLPackage;
import magicSHACL.Namespace;
import magicSHACL.Node;
import magicSHACL.Predicate;
import magicSHACL.PredicateObject;
import magicSHACL.Property;
import magicSHACL.PropertyValues;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapeExpression;
import magicSHACL.ShapeName;
import magicSHACL.ShapesGraph;
import magicSHACL.Subject;
import magicSHACL.Triples;
import magicSHACL.Value;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see magicSHACL.MagicSHACLPackage
 * @generated
 */
public class MagicSHACLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MagicSHACLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagicSHACLSwitch() {
		if (modelPackage == null) {
			modelPackage = MagicSHACLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MagicSHACLPackage.DATA_GRAPH: {
			DataGraph dataGraph = (DataGraph) theEObject;
			T result = caseDataGraph(dataGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.TRIPLES: {
			Triples triples = (Triples) theEObject;
			T result = caseTriples(triples);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.GRAPH: {
			Graph graph = (Graph) theEObject;
			T result = caseGraph(graph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.NAMESPACE: {
			Namespace namespace = (Namespace) theEObject;
			T result = caseNamespace(namespace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.SUBJECT: {
			Subject subject = (Subject) theEObject;
			T result = caseSubject(subject);
			if (result == null)
				result = caseNode(subject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.PREDICATE: {
			Predicate predicate = (Predicate) theEObject;
			T result = casePredicate(predicate);
			if (result == null)
				result = caseNode(predicate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.OBJECT: {
			magicSHACL.Object object = (magicSHACL.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = caseNode(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.PREDICATE_OBJECT: {
			PredicateObject predicateObject = (PredicateObject) theEObject;
			T result = casePredicateObject(predicateObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.SHAPE_CONSTRAINT: {
			ShapeConstraint shapeConstraint = (ShapeConstraint) theEObject;
			T result = caseShapeConstraint(shapeConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.SHAPES_GRAPH: {
			ShapesGraph shapesGraph = (ShapesGraph) theEObject;
			T result = caseShapesGraph(shapesGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.SHAPE_EXPRESSION: {
			ShapeExpression shapeExpression = (ShapeExpression) theEObject;
			T result = caseShapeExpression(shapeExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.SHAPE_NAME: {
			ShapeName shapeName = (ShapeName) theEObject;
			T result = caseShapeName(shapeName);
			if (result == null)
				result = caseNode(shapeName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = caseNode(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = caseNode(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MagicSHACLPackage.PROPERTY_VALUES: {
			PropertyValues propertyValues = (PropertyValues) theEObject;
			T result = casePropertyValues(propertyValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataGraph(DataGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triples</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triples</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriples(Triples object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubject(Subject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(magicSHACL.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateObject(PredicateObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeConstraint(ShapeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shapes Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shapes Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapesGraph(ShapesGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeName(ShapeName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyValues(PropertyValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeExpression(ShapeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MagicSHACLSwitch
