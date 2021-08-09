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
	 * The feature id for the '<em><b>Xsd Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__XSD_TYPE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Dangerous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT__DANGEROUS = 2;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT__TARGETS = 3;

	/**
	 * The number of structural features of the '<em>Shape Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT___CONTAINS__NODE = 0;

	/**
	 * The operation id for the '<em>Get All Shape Names Of Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT___GET_ALL_SHAPE_NAMES_OF_EXPRESSION = 1;

	/**
	 * The number of operations of the '<em>Shape Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_CONSTRAINT_OPERATION_COUNT = 2;

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
	 * The feature id for the '<em><b>Odd Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_GRAPH__ODD_CYCLES = 1;

	/**
	 * The number of structural features of the '<em>Shapes Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get All Shape Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_GRAPH___GET_ALL_SHAPE_NAMES = 0;

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
	 * The meta object id for the '{@link magicSHACL.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.ValueImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 13;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Shape Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION__SHAPE_EXPRESSIONS = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION__VALUES = 2;

	/**
	 * The feature id for the '<em><b>Abstract String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION__ABSTRACT_STRING = 3;

	/**
	 * The number of structural features of the '<em>Shape Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_EXPRESSION___CONTAINS__STRING = 0;

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
	 * The feature id for the '<em><b>Dangerous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME__DANGEROUS = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Idb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__IDB = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dangerous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DANGEROUS = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xsd Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__XSD_TYPE = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link magicSHACL.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see magicSHACL.impl.TargetImpl
	 * @see magicSHACL.impl.MagicSHACLPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 14;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__TERM = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Shape Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET___GET_SHAPE_NAME = 0;

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
	int PROPERTY_TYPE = 15;

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
	 * Returns the meta object for the attribute '{@link magicSHACL.Object#getXsdType <em>Xsd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsd Type</em>'.
	 * @see magicSHACL.Object#getXsdType()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_XsdType();

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
	 * Returns the meta object for the attribute '{@link magicSHACL.ShapeConstraint#getDangerous <em>Dangerous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dangerous</em>'.
	 * @see magicSHACL.ShapeConstraint#getDangerous()
	 * @see #getShapeConstraint()
	 * @generated
	 */
	EAttribute getShapeConstraint_Dangerous();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.ShapeConstraint#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see magicSHACL.ShapeConstraint#getTargets()
	 * @see #getShapeConstraint()
	 * @generated
	 */
	EReference getShapeConstraint_Targets();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapeConstraint#contains(magicSHACL.Node) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see magicSHACL.ShapeConstraint#contains(magicSHACL.Node)
	 * @generated
	 */
	EOperation getShapeConstraint__Contains__Node();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapeConstraint#getAllShapeNamesOfExpression() <em>Get All Shape Names Of Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Shape Names Of Expression</em>' operation.
	 * @see magicSHACL.ShapeConstraint#getAllShapeNamesOfExpression()
	 * @generated
	 */
	EOperation getShapeConstraint__GetAllShapeNamesOfExpression();

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
	 * Returns the meta object for the attribute '{@link magicSHACL.ShapesGraph#getOddCycles <em>Odd Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odd Cycles</em>'.
	 * @see magicSHACL.ShapesGraph#getOddCycles()
	 * @see #getShapesGraph()
	 * @generated
	 */
	EAttribute getShapesGraph_OddCycles();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapesGraph#getAllShapeNames() <em>Get All Shape Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Shape Names</em>' operation.
	 * @see magicSHACL.ShapesGraph#getAllShapeNames()
	 * @generated
	 */
	EOperation getShapesGraph__GetAllShapeNames();

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
	 * Returns the meta object for the attribute '{@link magicSHACL.ShapeName#isDangerous <em>Dangerous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dangerous</em>'.
	 * @see magicSHACL.ShapeName#isDangerous()
	 * @see #getShapeName()
	 * @generated
	 */
	EAttribute getShapeName_Dangerous();

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
	 * Returns the meta object for the attribute '{@link magicSHACL.Value#isIdb <em>Idb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idb</em>'.
	 * @see magicSHACL.Value#isIdb()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Idb();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Value#isDangerous <em>Dangerous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dangerous</em>'.
	 * @see magicSHACL.Value#isDangerous()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Dangerous();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.Value#getXsdType <em>Xsd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xsd Type</em>'.
	 * @see magicSHACL.Value#getXsdType()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_XsdType();

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
	 * Returns the meta object for the attribute '{@link magicSHACL.Target#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see magicSHACL.Target#getType()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Type();

	/**
	 * Returns the meta object for the '{@link magicSHACL.Target#getShapeName() <em>Get Shape Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Shape Name</em>' operation.
	 * @see magicSHACL.Target#getShapeName()
	 * @generated
	 */
	EOperation getTarget__GetShapeName();

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
	 * Returns the meta object for the containment reference list '{@link magicSHACL.ShapeExpression#getShapeExpressions <em>Shape Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape Expressions</em>'.
	 * @see magicSHACL.ShapeExpression#getShapeExpressions()
	 * @see #getShapeExpression()
	 * @generated
	 */
	EReference getShapeExpression_ShapeExpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link magicSHACL.ShapeExpression#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see magicSHACL.ShapeExpression#getValues()
	 * @see #getShapeExpression()
	 * @generated
	 */
	EReference getShapeExpression_Values();

	/**
	 * Returns the meta object for the attribute '{@link magicSHACL.ShapeExpression#getAbstractString <em>Abstract String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract String</em>'.
	 * @see magicSHACL.ShapeExpression#getAbstractString()
	 * @see #getShapeExpression()
	 * @generated
	 */
	EAttribute getShapeExpression_AbstractString();

	/**
	 * Returns the meta object for the '{@link magicSHACL.ShapeExpression#contains(java.lang.String) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see magicSHACL.ShapeExpression#contains(java.lang.String)
	 * @generated
	 */
	EOperation getShapeExpression__Contains__String();

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
		 * The meta object literal for the '<em><b>Xsd Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__XSD_TYPE = eINSTANCE.getObject_XsdType();

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
		 * The meta object literal for the '<em><b>Dangerous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_CONSTRAINT__DANGEROUS = eINSTANCE.getShapeConstraint_Dangerous();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_CONSTRAINT__TARGETS = eINSTANCE.getShapeConstraint_Targets();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPE_CONSTRAINT___CONTAINS__NODE = eINSTANCE.getShapeConstraint__Contains__Node();

		/**
		 * The meta object literal for the '<em><b>Get All Shape Names Of Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPE_CONSTRAINT___GET_ALL_SHAPE_NAMES_OF_EXPRESSION = eINSTANCE
				.getShapeConstraint__GetAllShapeNamesOfExpression();

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
		 * The meta object literal for the '<em><b>Odd Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPES_GRAPH__ODD_CYCLES = eINSTANCE.getShapesGraph_OddCycles();

		/**
		 * The meta object literal for the '<em><b>Get All Shape Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPES_GRAPH___GET_ALL_SHAPE_NAMES = eINSTANCE.getShapesGraph__GetAllShapeNames();

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
		 * The meta object literal for the '<em><b>Dangerous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_NAME__DANGEROUS = eINSTANCE.getShapeName_Dangerous();

		/**
		 * The meta object literal for the '<em><b>Get Magic Shape Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPE_NAME___GET_MAGIC_SHAPE_NAME = eINSTANCE.getShapeName__GetMagicShapeName();

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
		 * The meta object literal for the '<em><b>Idb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__IDB = eINSTANCE.getValue_Idb();

		/**
		 * The meta object literal for the '<em><b>Dangerous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__DANGEROUS = eINSTANCE.getValue_Dangerous();

		/**
		 * The meta object literal for the '<em><b>Xsd Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__XSD_TYPE = eINSTANCE.getValue_XsdType();

		/**
		 * The meta object literal for the '<em><b>To Shape Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___TO_SHAPE_NAME = eINSTANCE.getValue__ToShapeName();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__TYPE = eINSTANCE.getTarget_Type();

		/**
		 * The meta object literal for the '<em><b>Get Shape Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TARGET___GET_SHAPE_NAME = eINSTANCE.getTarget__GetShapeName();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_EXPRESSION__TYPE = eINSTANCE.getShapeExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Shape Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_EXPRESSION__SHAPE_EXPRESSIONS = eINSTANCE.getShapeExpression_ShapeExpressions();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_EXPRESSION__VALUES = eINSTANCE.getShapeExpression_Values();

		/**
		 * The meta object literal for the '<em><b>Abstract String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_EXPRESSION__ABSTRACT_STRING = eINSTANCE.getShapeExpression_AbstractString();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPE_EXPRESSION___CONTAINS__STRING = eINSTANCE.getShapeExpression__Contains__String();

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
