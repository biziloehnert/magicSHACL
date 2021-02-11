/**
 */
package magicSHACL.impl;

import magicSHACL.DataGraph;
import magicSHACL.Graph;
import magicSHACL.MagicSHACLFactory;
import magicSHACL.MagicSHACLPackage;
import magicSHACL.Namespace;
import magicSHACL.Predicate;
import magicSHACL.PredicateObject;
import magicSHACL.Property;
import magicSHACL.PropertyType;
import magicSHACL.PropertyValues;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapeExpression;
import magicSHACL.ShapeName;
import magicSHACL.ShapesGraph;
import magicSHACL.Subject;
import magicSHACL.Target;
import magicSHACL.Triples;
import magicSHACL.Value;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MagicSHACLFactoryImpl extends EFactoryImpl implements MagicSHACLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MagicSHACLFactory init() {
		try {
			MagicSHACLFactory theMagicSHACLFactory = (MagicSHACLFactory) EPackage.Registry.INSTANCE
					.getEFactory(MagicSHACLPackage.eNS_URI);
			if (theMagicSHACLFactory != null) {
				return theMagicSHACLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MagicSHACLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagicSHACLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MagicSHACLPackage.DATA_GRAPH:
			return createDataGraph();
		case MagicSHACLPackage.TRIPLES:
			return createTriples();
		case MagicSHACLPackage.GRAPH:
			return createGraph();
		case MagicSHACLPackage.NAMESPACE:
			return createNamespace();
		case MagicSHACLPackage.SUBJECT:
			return createSubject();
		case MagicSHACLPackage.PREDICATE:
			return createPredicate();
		case MagicSHACLPackage.OBJECT:
			return createObject();
		case MagicSHACLPackage.PREDICATE_OBJECT:
			return createPredicateObject();
		case MagicSHACLPackage.SHAPE_CONSTRAINT:
			return createShapeConstraint();
		case MagicSHACLPackage.SHAPES_GRAPH:
			return createShapesGraph();
		case MagicSHACLPackage.SHAPE_EXPRESSION:
			return createShapeExpression();
		case MagicSHACLPackage.SHAPE_NAME:
			return createShapeName();
		case MagicSHACLPackage.PROPERTY:
			return createProperty();
		case MagicSHACLPackage.VALUE:
			return createValue();
		case MagicSHACLPackage.PROPERTY_VALUES:
			return createPropertyValues();
		case MagicSHACLPackage.TARGET:
			return createTarget();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MagicSHACLPackage.PROPERTY_TYPE:
			return createPropertyTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MagicSHACLPackage.PROPERTY_TYPE:
			return convertPropertyTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataGraph createDataGraph() {
		DataGraphImpl dataGraph = new DataGraphImpl();
		return dataGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triples createTriples() {
		TriplesImpl triples = new TriplesImpl();
		return triples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subject createSubject() {
		SubjectImpl subject = new SubjectImpl();
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public magicSHACL.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateObject createPredicateObject() {
		PredicateObjectImpl predicateObject = new PredicateObjectImpl();
		return predicateObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeConstraint createShapeConstraint() {
		ShapeConstraintImpl shapeConstraint = new ShapeConstraintImpl();
		return shapeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesGraph createShapesGraph() {
		ShapesGraphImpl shapesGraph = new ShapesGraphImpl();
		return shapesGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeName createShapeName() {
		ShapeNameImpl shapeName = new ShapeNameImpl();
		return shapeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValues createPropertyValues() {
		PropertyValuesImpl propertyValues = new PropertyValuesImpl();
		return propertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeExpression createShapeExpression() {
		ShapeExpressionImpl shapeExpression = new ShapeExpressionImpl();
		return shapeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeFromString(EDataType eDataType, String initialValue) {
		PropertyType result = PropertyType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagicSHACLPackage getMagicSHACLPackage() {
		return (MagicSHACLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MagicSHACLPackage getPackage() {
		return MagicSHACLPackage.eINSTANCE;
	}

} //MagicSHACLFactoryImpl
