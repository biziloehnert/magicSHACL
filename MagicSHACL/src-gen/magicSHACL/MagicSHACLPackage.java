/**
 */
package magicSHACL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see magicSHACL.MagicSHACLFactory
 * @model kind="package"
 * @generated
 */
public interface MagicSHACLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "magicSHACL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/magicSHACL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "magicSHACL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MagicSHACLPackage eINSTANCE = magicSHACL.impl.MagicSHACLPackageImpl.init();

	/**
	 * The meta object id for the '{@link magicSHACL.impl.DataGraphImpl <em>Data Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.DataGraphImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getDataGraph()
	 * @generated
	 */
	int DATA_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Triples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GRAPH__TRIPLES = 0;

	/**
	 * The number of structural features of the '<em>Data Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GRAPH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.TriplesImpl <em>Triples</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.TriplesImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getTriples()
	 * @generated
	 */
	int TRIPLES = 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLES__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Predicateobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLES__PREDICATEOBJECT = 1;

	/**
	 * The number of structural features of the '<em>Triples</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Triples</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.NodeImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PREFIX = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.GraphImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Data Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__DATA_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAMESPACES = 1;

	/**
	 * The feature id for the '<em><b>Shapes Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__SHAPES_GRAPH = 2;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.NamespaceImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 4;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.SubjectImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__PREFIX = NODE__PREFIX;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.PredicateImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__PREFIX = NODE__PREFIX;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.ObjectImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PREFIX = NODE__PREFIX;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.PredicateObjectImpl <em>Predicate Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.PredicateObjectImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getPredicateObject()
	 * @generated
	 */
	int PREDICATE_OBJECT = 8;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OBJECT__PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OBJECT__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Predicate Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Predicate Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.ShapeConstraintImpl <em>Shape Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.ShapeConstraintImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getShapeConstraint()
	 * @generated
	 */
	int SHAPE_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Shape Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT__SHAPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Shape Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS = 1;

	/**
	 * The number of structural features of the '<em>Shape Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Adorn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT___ADORN = 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT___GENERATE__VALUE = 1;

	/**
	 * The operation id for the '<em>Remove Adornments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT___REMOVE_ADORNMENTS = 2;

	/**
	 * The number of operations of the '<em>Shape Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.ShapesGraphImpl <em>Shapes Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.ShapesGraphImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getShapesGraph()
	 * @generated
	 */
	int SHAPES_GRAPH = 10;

	/**
	 * The feature id for the '<em><b>Shape Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_GRAPH__SHAPE_CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_GRAPH__TARGETS = 1;

	/**
	 * The number of structural features of the '<em>Shapes Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Is Shape Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_GRAPH___IS_SHAPE_NAME__STRING = 0;

	/**
	 * The number of operations of the '<em>Shapes Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_GRAPH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.ShapeNameImpl <em>Shape Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.ShapeNameImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getShapeName()
	 * @generated
	 */
	int SHAPE_NAME = 12;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.PropertyImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 13;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.ValueImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 14;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.PropertyValuesImpl <em>Property Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.PropertyValuesImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getPropertyValues()
	 * @generated
	 */
	int PROPERTY_VALUES = 15;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.ShapeExpressionImpl <em>Shape Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.ShapeExpressionImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getShapeExpression()
	 * @generated
	 */
	int SHAPE_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION__PROPERTY_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Shape Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>To Abstract String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION___TO_ABSTRACT_STRING = 0;

	/**
	 * The number of operations of the '<em>Shape Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME__PREFIX = NODE__PREFIX;

	/**
	 * The feature id for the '<em><b>Adorned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME__ADORNED = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Magic Shape Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME___GET_MAGIC_SHAPE_NAME = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shape Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PREFIX = NODE__PREFIX;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To Abstract String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___TO_ABSTRACT_STRING = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__PREFIX = NODE__PREFIX;

	/**
	 * The feature id for the '<em><b>Adorned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ADORNED = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To Shape Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___TO_SHAPE_NAME = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUES__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUES__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Property Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUES_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Magic Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUES___GET_MAGIC_PROPERTY_VALUES__STRING = 0;

	/**
	 * The operation id for the '<em>Get Path Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUES___GET_PATH_VALUE = 1;

	/**
	 * The number of operations of the '<em>Property Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link magicSHACL.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.TargetImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 16;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__TERM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>To Shape Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET___TO_SHAPE_NAME = 0;

	/**
	 * The operation id for the '<em>Get Magic Query Seed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET___GET_MAGIC_QUERY_SEED = 1;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link magicSHACL.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.PropertyType
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 17;

	/**
	 * Returns the meta object for class '{@link magicSHACL.DataGraph <em>Data Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Graph</em>'.
	 * @see magicSHACL.DataGraph
	 * @generated
	 */
	EClass getDataGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.DataGraph#getTriples <em>Triples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triples</em>'.
	 * @see magicSHACL.DataGraph#getTriples()
	 * @see #getDataGraph()
	 * @generated
	 */
	EReference getDataGraph_Triples();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Triples <em>Triples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triples</em>'.
	 * @see magicSHACL.Triples
	 * @generated
	 */
	EClass getTriples();

	/**
	 * Returns the meta object for the containment reference '{@link magicSHACL.Triples#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see magicSHACL.Triples#getSubject()
	 * @see #getTriples()
	 * @generated
	 */
	EReference getTriples_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.Triples#getPredicateobject <em>Predicateobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicateobject</em>'.
	 * @see magicSHACL.Triples#getPredicateobject()
	 * @see #getTriples()
	 * @generated
	 */
	EReference getTriples_Predicateobject();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see magicSHACL.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see magicSHACL.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Node#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see magicSHACL.Node#getPrefix()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Prefix();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see magicSHACL.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference '{@link magicSHACL.Graph#getDataGraph <em>Data Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Graph</em>'.
	 * @see magicSHACL.Graph#getDataGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_DataGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.Graph#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see magicSHACL.Graph#getNamespaces()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Namespaces();

	/**
	 * Returns the meta object for the containment reference '{@link magicSHACL.Graph#getShapesGraph <em>Shapes Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shapes Graph</em>'.
	 * @see magicSHACL.Graph#getShapesGraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_ShapesGraph();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see magicSHACL.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Namespace#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see magicSHACL.Namespace#getPrefix()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Namespace#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see magicSHACL.Namespace#getNamespace()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Namespace();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see magicSHACL.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see magicSHACL.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see magicSHACL.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link magicSHACL.PredicateObject <em>Predicate Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Object</em>'.
	 * @see magicSHACL.PredicateObject
	 * @generated
	 */
	EClass getPredicateObject();

	/**
	 * Returns the meta object for the containment reference '{@link magicSHACL.PredicateObject#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see magicSHACL.PredicateObject#getPredicate()
	 * @see #getPredicateObject()
	 * @generated
	 */
	EReference getPredicateObject_Predicate();

	/**
	 * Returns the meta object for the containment reference '{@link magicSHACL.PredicateObject#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see magicSHACL.PredicateObject#getObject()
	 * @see #getPredicateObject()
	 * @generated
	 */
	EReference getPredicateObject_Object();

	/**
	 * Returns the meta object for class '{@link magicSHACL.ShapeConstraint <em>Shape Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Constraint</em>'.
	 * @see magicSHACL.ShapeConstraint
	 * @generated
	 */
	EClass getShapeConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link magicSHACL.ShapeConstraint#getShapeName <em>Shape Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape Name</em>'.
	 * @see magicSHACL.ShapeConstraint#getShapeName()
	 * @see #getShapeConstraint()
	 * @generated
	 */
	EReference getShapeConstraint_ShapeName();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.ShapeConstraint#getShapeExpressions <em>Shape Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape Expressions</em>'.
	 * @see magicSHACL.ShapeConstraint#getShapeExpressions()
	 * @see #getShapeConstraint()
	 * @generated
	 */
	EReference getShapeConstraint_ShapeExpressions();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapeConstraint#adorn() <em>Adorn</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adorn</em>' operation.
	 * @see magicSHACL.ShapeConstraint#adorn()
	 * @generated
	 */
	EOperation getShapeConstraint__Adorn();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapeConstraint#generate(magicSHACL.Value) <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see magicSHACL.ShapeConstraint#generate(magicSHACL.Value)
	 * @generated
	 */
	EOperation getShapeConstraint__Generate__Value();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapeConstraint#removeAdornments() <em>Remove Adornments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Adornments</em>' operation.
	 * @see magicSHACL.ShapeConstraint#removeAdornments()
	 * @generated
	 */
	EOperation getShapeConstraint__RemoveAdornments();

	/**
	 * Returns the meta object for class '{@link magicSHACL.ShapesGraph <em>Shapes Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shapes Graph</em>'.
	 * @see magicSHACL.ShapesGraph
	 * @generated
	 */
	EClass getShapesGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.ShapesGraph#getShapeConstraints <em>Shape Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape Constraints</em>'.
	 * @see magicSHACL.ShapesGraph#getShapeConstraints()
	 * @see #getShapesGraph()
	 * @generated
	 */
	EReference getShapesGraph_ShapeConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.ShapesGraph#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see magicSHACL.ShapesGraph#getTargets()
	 * @see #getShapesGraph()
	 * @generated
	 */
	EReference getShapesGraph_Targets();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapesGraph#isShapeName(java.lang.String) <em>Is Shape Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Shape Name</em>' operation.
	 * @see magicSHACL.ShapesGraph#isShapeName(java.lang.String)
	 * @generated
	 */
	EOperation getShapesGraph__IsShapeName__String();

	/**
	 * Returns the meta object for class '{@link magicSHACL.ShapeName <em>Shape Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Name</em>'.
	 * @see magicSHACL.ShapeName
	 * @generated
	 */
	EClass getShapeName();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.ShapeName#isAdorned <em>Adorned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adorned</em>'.
	 * @see magicSHACL.ShapeName#isAdorned()
	 * @see #getShapeName()
	 * @generated
	 */
	EAttribute getShapeName_Adorned();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapeName#getMagicShapeName() <em>Get Magic Shape Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Magic Shape Name</em>' operation.
	 * @see magicSHACL.ShapeName#getMagicShapeName()
	 * @generated
	 */
	EOperation getShapeName__GetMagicShapeName();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see magicSHACL.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see magicSHACL.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the '{@link magicSHACL.Property#toAbstractString() <em>To Abstract String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Abstract String</em>' operation.
	 * @see magicSHACL.Property#toAbstractString()
	 * @generated
	 */
	EOperation getProperty__ToAbstractString();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see magicSHACL.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Value#isAdorned <em>Adorned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adorned</em>'.
	 * @see magicSHACL.Value#isAdorned()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Adorned();

	/**
	 * Returns the meta object for the '{@link magicSHACL.Value#toShapeName() <em>To Shape Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Shape Name</em>' operation.
	 * @see magicSHACL.Value#toShapeName()
	 * @generated
	 */
	EOperation getValue__ToShapeName();

	/**
	 * Returns the meta object for class '{@link magicSHACL.PropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Values</em>'.
	 * @see magicSHACL.PropertyValues
	 * @generated
	 */
	EClass getPropertyValues();

	/**
	 * Returns the meta object for the containment reference '{@link magicSHACL.PropertyValues#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see magicSHACL.PropertyValues#getProperty()
	 * @see #getPropertyValues()
	 * @generated
	 */
	EReference getPropertyValues_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.PropertyValues#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see magicSHACL.PropertyValues#getValues()
	 * @see #getPropertyValues()
	 * @generated
	 */
	EReference getPropertyValues_Values();

	/**
	 * Returns the meta object for the '{@link magicSHACL.PropertyValues#getMagicPropertyValues(java.lang.String) <em>Get Magic Property Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Magic Property Values</em>' operation.
	 * @see magicSHACL.PropertyValues#getMagicPropertyValues(java.lang.String)
	 * @generated
	 */
	EOperation getPropertyValues__GetMagicPropertyValues__String();

	/**
	 * Returns the meta object for the '{@link magicSHACL.PropertyValues#getPathValue() <em>Get Path Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path Value</em>' operation.
	 * @see magicSHACL.PropertyValues#getPathValue()
	 * @generated
	 */
	EOperation getPropertyValues__GetPathValue();

	/**
	 * Returns the meta object for class '{@link magicSHACL.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see magicSHACL.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Target#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see magicSHACL.Target#getTerm()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Term();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Target#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see magicSHACL.Target#getName()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Name();

	/**
	 * Returns the meta object for the '{@link magicSHACL.Target#toShapeName() <em>To Shape Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Shape Name</em>' operation.
	 * @see magicSHACL.Target#toShapeName()
	 * @generated
	 */
	EOperation getTarget__ToShapeName();

	/**
	 * Returns the meta object for the '{@link magicSHACL.Target#getMagicQuerySeed() <em>Get Magic Query Seed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Magic Query Seed</em>' operation.
	 * @see magicSHACL.Target#getMagicQuerySeed()
	 * @generated
	 */
	EOperation getTarget__GetMagicQuerySeed();

	/**
	 * Returns the meta object for class '{@link magicSHACL.ShapeExpression <em>Shape Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Expression</em>'.
	 * @see magicSHACL.ShapeExpression
	 * @generated
	 */
	EClass getShapeExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.ShapeExpression#getPropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Values</em>'.
	 * @see magicSHACL.ShapeExpression#getPropertyValues()
	 * @see #getShapeExpression()
	 * @generated
	 */
	EReference getShapeExpression_PropertyValues();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.ShapeExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see magicSHACL.ShapeExpression#getType()
	 * @see #getShapeExpression()
	 * @generated
	 */
	EAttribute getShapeExpression_Type();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.ShapeExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see magicSHACL.ShapeExpression#getValue()
	 * @see #getShapeExpression()
	 * @generated
	 */
	EAttribute getShapeExpression_Value();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapeExpression#toAbstractString() <em>To Abstract String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Abstract String</em>' operation.
	 * @see magicSHACL.ShapeExpression#toAbstractString()
	 * @generated
	 */
	EOperation getShapeExpression__ToAbstractString();

	/**
	 * Returns the meta object for enum '{@link magicSHACL.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see magicSHACL.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MagicSHACLFactory getMagicSHACLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link magicSHACL.impl.DataGraphImpl <em>Data Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.DataGraphImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getDataGraph()
		 * @generated
		 */
		EClass DATA_GRAPH = eINSTANCE.getDataGraph();

		/**
		 * The meta object literal for the '<em><b>Triples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_GRAPH__TRIPLES = eINSTANCE.getDataGraph_Triples();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.TriplesImpl <em>Triples</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.TriplesImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getTriples()
		 * @generated
		 */
		EClass TRIPLES = eINSTANCE.getTriples();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLES__SUBJECT = eINSTANCE.getTriples_Subject();

		/**
		 * The meta object literal for the '<em><b>Predicateobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLES__PREDICATEOBJECT = eINSTANCE.getTriples_Predicateobject();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.NodeImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PREFIX = eINSTANCE.getNode_Prefix();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.GraphImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Data Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__DATA_GRAPH = eINSTANCE.getGraph_DataGraph();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NAMESPACES = eINSTANCE.getGraph_Namespaces();

		/**
		 * The meta object literal for the '<em><b>Shapes Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__SHAPES_GRAPH = eINSTANCE.getGraph_ShapesGraph();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.NamespaceImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__PREFIX = eINSTANCE.getNamespace_Prefix();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__NAMESPACE = eINSTANCE.getNamespace_Namespace();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.SubjectImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.PredicateImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.ObjectImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.PredicateObjectImpl <em>Predicate Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.PredicateObjectImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getPredicateObject()
		 * @generated
		 */
		EClass PREDICATE_OBJECT = eINSTANCE.getPredicateObject();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_OBJECT__PREDICATE = eINSTANCE.getPredicateObject_Predicate();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_OBJECT__OBJECT = eINSTANCE.getPredicateObject_Object();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.ShapeConstraintImpl <em>Shape Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.ShapeConstraintImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getShapeConstraint()
		 * @generated
		 */
		EClass SHAPE_CONSTRAINT = eINSTANCE.getShapeConstraint();

		/**
		 * The meta object literal for the '<em><b>Shape Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_CONSTRAINT__SHAPE_NAME = eINSTANCE.getShapeConstraint_ShapeName();

		/**
		 * The meta object literal for the '<em><b>Shape Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS = eINSTANCE.getShapeConstraint_ShapeExpressions();

		/**
		 * The meta object literal for the '<em><b>Adorn</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPE_CONSTRAINT___ADORN = eINSTANCE.getShapeConstraint__Adorn();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPE_CONSTRAINT___GENERATE__VALUE = eINSTANCE.getShapeConstraint__Generate__Value();

		/**
		 * The meta object literal for the '<em><b>Remove Adornments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPE_CONSTRAINT___REMOVE_ADORNMENTS = eINSTANCE.getShapeConstraint__RemoveAdornments();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.ShapesGraphImpl <em>Shapes Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.ShapesGraphImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getShapesGraph()
		 * @generated
		 */
		EClass SHAPES_GRAPH = eINSTANCE.getShapesGraph();

		/**
		 * The meta object literal for the '<em><b>Shape Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_GRAPH__SHAPE_CONSTRAINTS = eINSTANCE.getShapesGraph_ShapeConstraints();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_GRAPH__TARGETS = eINSTANCE.getShapesGraph_Targets();

		/**
		 * The meta object literal for the '<em><b>Is Shape Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPES_GRAPH___IS_SHAPE_NAME__STRING = eINSTANCE.getShapesGraph__IsShapeName__String();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.ShapeNameImpl <em>Shape Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.ShapeNameImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getShapeName()
		 * @generated
		 */
		EClass SHAPE_NAME = eINSTANCE.getShapeName();

		/**
		 * The meta object literal for the '<em><b>Adorned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_NAME__ADORNED = eINSTANCE.getShapeName_Adorned();

		/**
		 * The meta object literal for the '<em><b>Get Magic Shape Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPE_NAME___GET_MAGIC_SHAPE_NAME = eINSTANCE.getShapeName__GetMagicShapeName();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.PropertyImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>To Abstract String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___TO_ABSTRACT_STRING = eINSTANCE.getProperty__ToAbstractString();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.ValueImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Adorned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__ADORNED = eINSTANCE.getValue_Adorned();

		/**
		 * The meta object literal for the '<em><b>To Shape Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___TO_SHAPE_NAME = eINSTANCE.getValue__ToShapeName();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.PropertyValuesImpl <em>Property Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.PropertyValuesImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getPropertyValues()
		 * @generated
		 */
		EClass PROPERTY_VALUES = eINSTANCE.getPropertyValues();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUES__PROPERTY = eINSTANCE.getPropertyValues_Property();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_VALUES__VALUES = eINSTANCE.getPropertyValues_Values();

		/**
		 * The meta object literal for the '<em><b>Get Magic Property Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_VALUES___GET_MAGIC_PROPERTY_VALUES__STRING = eINSTANCE
				.getPropertyValues__GetMagicPropertyValues__String();

		/**
		 * The meta object literal for the '<em><b>Get Path Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_VALUES___GET_PATH_VALUE = eINSTANCE.getPropertyValues__GetPathValue();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.TargetImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__TERM = eINSTANCE.getTarget_Term();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__NAME = eINSTANCE.getTarget_Name();

		/**
		 * The meta object literal for the '<em><b>To Shape Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TARGET___TO_SHAPE_NAME = eINSTANCE.getTarget__ToShapeName();

		/**
		 * The meta object literal for the '<em><b>Get Magic Query Seed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TARGET___GET_MAGIC_QUERY_SEED = eINSTANCE.getTarget__GetMagicQuerySeed();

		/**
		 * The meta object literal for the '{@link magicSHACL.impl.ShapeExpressionImpl <em>Shape Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.impl.ShapeExpressionImpl
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getShapeExpression()
		 * @generated
		 */
		EClass SHAPE_EXPRESSION = eINSTANCE.getShapeExpression();

		/**
		 * The meta object literal for the '<em><b>Property Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_EXPRESSION__PROPERTY_VALUES = eINSTANCE.getShapeExpression_PropertyValues();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_EXPRESSION__TYPE = eINSTANCE.getShapeExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_EXPRESSION__VALUE = eINSTANCE.getShapeExpression_Value();

		/**
		 * The meta object literal for the '<em><b>To Abstract String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPE_EXPRESSION___TO_ABSTRACT_STRING = eINSTANCE.getShapeExpression__ToAbstractString();

		/**
		 * The meta object literal for the '{@link magicSHACL.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see magicSHACL.PropertyType
		 * @see magicSHACL.impl.MagicSHACLPackageImpl#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

	}

} //MagicSHACLPackage
