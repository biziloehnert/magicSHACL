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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see magicSHACL.MagicSHACLPackage
 * @generated
 */
public class MagicSHACLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MagicSHACLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagicSHACLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MagicSHACLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MagicSHACLSwitch<Adapter> modelSwitch = new MagicSHACLSwitch<Adapter>() {
		@Override
		public Adapter caseDataGraph(DataGraph object) {
			return createDataGraphAdapter();
		}

		@Override
		public Adapter caseTriples(Triples object) {
			return createTriplesAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseGraph(Graph object) {
			return createGraphAdapter();
		}

		@Override
		public Adapter caseNamespace(Namespace object) {
			return createNamespaceAdapter();
		}

		@Override
		public Adapter caseSubject(Subject object) {
			return createSubjectAdapter();
		}

		@Override
		public Adapter casePredicate(Predicate object) {
			return createPredicateAdapter();
		}

		@Override
		public Adapter caseObject(magicSHACL.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter casePredicateObject(PredicateObject object) {
			return createPredicateObjectAdapter();
		}

		@Override
		public Adapter caseShapeConstraint(ShapeConstraint object) {
			return createShapeConstraintAdapter();
		}

		@Override
		public Adapter caseShapesGraph(ShapesGraph object) {
			return createShapesGraphAdapter();
		}

		@Override
		public Adapter caseShapeExpression(ShapeExpression object) {
			return createShapeExpressionAdapter();
		}

		@Override
		public Adapter caseShapeName(ShapeName object) {
			return createShapeNameAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter casePropertyValues(PropertyValues object) {
			return createPropertyValuesAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.DataGraph <em>Data Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.DataGraph
	 * @generated
	 */
	public Adapter createDataGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.Triples <em>Triples</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.Triples
	 * @generated
	 */
	public Adapter createTriplesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.Subject
	 * @generated
	 */
	public Adapter createSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.PredicateObject <em>Predicate Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.PredicateObject
	 * @generated
	 */
	public Adapter createPredicateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.ShapeConstraint <em>Shape Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.ShapeConstraint
	 * @generated
	 */
	public Adapter createShapeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.ShapesGraph <em>Shapes Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.ShapesGraph
	 * @generated
	 */
	public Adapter createShapesGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.ShapeName <em>Shape Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.ShapeName
	 * @generated
	 */
	public Adapter createShapeNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.PropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.PropertyValues
	 * @generated
	 */
	public Adapter createPropertyValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link magicSHACL.ShapeExpression <em>Shape Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see magicSHACL.ShapeExpression
	 * @generated
	 */
	public Adapter createShapeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MagicSHACLAdapterFactory
