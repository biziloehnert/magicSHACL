/**
 */
package magicSHACL.impl;

import magicSHACL.DataGraph;
import magicSHACL.Graph;
import magicSHACL.MagicSHACLFactory;
import magicSHACL.MagicSHACLPackage;
import magicSHACL.Namespace;
import magicSHACL.Node;
import magicSHACL.Predicate;
import magicSHACL.PredicateObject;
import magicSHACL.PropertyType;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapeExpression;
import magicSHACL.ShapeName;
import magicSHACL.ShapesGraph;
import magicSHACL.Subject;
import magicSHACL.Target;
import magicSHACL.Triples;
import magicSHACL.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MagicSHACLPackageImpl extends EPackageImpl implements MagicSHACLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triplesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapesGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see magicSHACL.MagicSHACLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MagicSHACLPackageImpl() {
		super(eNS_URI, MagicSHACLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MagicSHACLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MagicSHACLPackage init() {
		if (isInited)
			return (MagicSHACLPackage) EPackage.Registry.INSTANCE.getEPackage(MagicSHACLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMagicSHACLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MagicSHACLPackageImpl theMagicSHACLPackage = registeredMagicSHACLPackage instanceof MagicSHACLPackageImpl
				? (MagicSHACLPackageImpl) registeredMagicSHACLPackage
				: new MagicSHACLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMagicSHACLPackage.createPackageContents();

		// Initialize created meta-data
		theMagicSHACLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMagicSHACLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MagicSHACLPackage.eNS_URI, theMagicSHACLPackage);
		return theMagicSHACLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataGraph() {
		return dataGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataGraph_Triples() {
		return (EReference) dataGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriples() {
		return triplesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriples_Subject() {
		return (EReference) triplesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriples_Predicateobject() {
		return (EReference) triplesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Name() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Prefix() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_DataGraph() {
		return (EReference) graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Namespaces() {
		return (EReference) graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_ShapesGraph() {
		return (EReference) graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamespace_Prefix() {
		return (EAttribute) namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamespace_Namespace() {
		return (EAttribute) namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubject() {
		return subjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObject_XsdType() {
		return (EAttribute) objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateObject() {
		return predicateObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateObject_Predicate() {
		return (EReference) predicateObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateObject_Object() {
		return (EReference) predicateObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShapeConstraint() {
		return shapeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShapeConstraint_ShapeName() {
		return (EReference) shapeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShapeConstraint_ShapeExpressions() {
		return (EReference) shapeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShapeConstraint_Dangerous() {
		return (EAttribute) shapeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShapeConstraint_Targets() {
		return (EReference) shapeConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShapeConstraint__Contains__Node() {
		return shapeConstraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShapeConstraint__GetAllShapeNamesOfExpression() {
		return shapeConstraintEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShapesGraph() {
		return shapesGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShapesGraph_ShapeConstraints() {
		return (EReference) shapesGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShapesGraph_OddCycles() {
		return (EAttribute) shapesGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShapesGraph__GetAllShapeNames() {
		return shapesGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShapeName() {
		return shapeNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShapeName_Adorned() {
		return (EAttribute) shapeNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShapeName_Dangerous() {
		return (EAttribute) shapeNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShapeName__GetMagicShapeName() {
		return shapeNameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValue_Adorned() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValue_Idb() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValue_Dangerous() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValue_XsdType() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValue__ToShapeName() {
		return valueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTarget() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTarget_Term() {
		return (EAttribute) targetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTarget_Type() {
		return (EAttribute) targetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTarget__GetShapeName() {
		return targetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTarget__GetMagicQuerySeed() {
		return targetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShapeExpression() {
		return shapeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShapeExpression_Type() {
		return (EAttribute) shapeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShapeExpression_ShapeExpressions() {
		return (EReference) shapeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShapeExpression_Values() {
		return (EReference) shapeExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShapeExpression_AbstractString() {
		return (EAttribute) shapeExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShapeExpression__Contains__String() {
		return shapeExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyType() {
		return propertyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MagicSHACLFactory getMagicSHACLFactory() {
		return (MagicSHACLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dataGraphEClass = createEClass(DATA_GRAPH);
		createEReference(dataGraphEClass, DATA_GRAPH__TRIPLES);

		triplesEClass = createEClass(TRIPLES);
		createEReference(triplesEClass, TRIPLES__SUBJECT);
		createEReference(triplesEClass, TRIPLES__PREDICATEOBJECT);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEAttribute(nodeEClass, NODE__PREFIX);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__DATA_GRAPH);
		createEReference(graphEClass, GRAPH__NAMESPACES);
		createEReference(graphEClass, GRAPH__SHAPES_GRAPH);

		namespaceEClass = createEClass(NAMESPACE);
		createEAttribute(namespaceEClass, NAMESPACE__PREFIX);
		createEAttribute(namespaceEClass, NAMESPACE__NAMESPACE);

		subjectEClass = createEClass(SUBJECT);

		predicateEClass = createEClass(PREDICATE);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__XSD_TYPE);

		predicateObjectEClass = createEClass(PREDICATE_OBJECT);
		createEReference(predicateObjectEClass, PREDICATE_OBJECT__PREDICATE);
		createEReference(predicateObjectEClass, PREDICATE_OBJECT__OBJECT);

		shapeConstraintEClass = createEClass(SHAPE_CONSTRAINT);
		createEReference(shapeConstraintEClass, SHAPE_CONSTRAINT__SHAPE_NAME);
		createEReference(shapeConstraintEClass, SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS);
		createEAttribute(shapeConstraintEClass, SHAPE_CONSTRAINT__DANGEROUS);
		createEReference(shapeConstraintEClass, SHAPE_CONSTRAINT__TARGETS);
		createEOperation(shapeConstraintEClass, SHAPE_CONSTRAINT___CONTAINS__NODE);
		createEOperation(shapeConstraintEClass, SHAPE_CONSTRAINT___GET_ALL_SHAPE_NAMES_OF_EXPRESSION);

		shapesGraphEClass = createEClass(SHAPES_GRAPH);
		createEReference(shapesGraphEClass, SHAPES_GRAPH__SHAPE_CONSTRAINTS);
		createEAttribute(shapesGraphEClass, SHAPES_GRAPH__ODD_CYCLES);
		createEOperation(shapesGraphEClass, SHAPES_GRAPH___GET_ALL_SHAPE_NAMES);

		shapeExpressionEClass = createEClass(SHAPE_EXPRESSION);
		createEAttribute(shapeExpressionEClass, SHAPE_EXPRESSION__TYPE);
		createEReference(shapeExpressionEClass, SHAPE_EXPRESSION__SHAPE_EXPRESSIONS);
		createEReference(shapeExpressionEClass, SHAPE_EXPRESSION__VALUES);
		createEAttribute(shapeExpressionEClass, SHAPE_EXPRESSION__ABSTRACT_STRING);
		createEOperation(shapeExpressionEClass, SHAPE_EXPRESSION___CONTAINS__STRING);

		shapeNameEClass = createEClass(SHAPE_NAME);
		createEAttribute(shapeNameEClass, SHAPE_NAME__ADORNED);
		createEAttribute(shapeNameEClass, SHAPE_NAME__DANGEROUS);
		createEOperation(shapeNameEClass, SHAPE_NAME___GET_MAGIC_SHAPE_NAME);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__ADORNED);
		createEAttribute(valueEClass, VALUE__IDB);
		createEAttribute(valueEClass, VALUE__DANGEROUS);
		createEAttribute(valueEClass, VALUE__XSD_TYPE);
		createEOperation(valueEClass, VALUE___TO_SHAPE_NAME);

		targetEClass = createEClass(TARGET);
		createEAttribute(targetEClass, TARGET__TERM);
		createEAttribute(targetEClass, TARGET__TYPE);
		createEOperation(targetEClass, TARGET___GET_SHAPE_NAME);
		createEOperation(targetEClass, TARGET___GET_MAGIC_QUERY_SEED);

		// Create enums
		propertyTypeEEnum = createEEnum(PROPERTY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		subjectEClass.getESuperTypes().add(this.getNode());
		predicateEClass.getESuperTypes().add(this.getNode());
		objectEClass.getESuperTypes().add(this.getNode());
		shapeNameEClass.getESuperTypes().add(this.getNode());
		valueEClass.getESuperTypes().add(this.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataGraphEClass, DataGraph.class, "DataGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataGraph_Triples(), this.getTriples(), null, "triples", null, 0, -1, DataGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triplesEClass, Triples.class, "Triples", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriples_Subject(), this.getSubject(), null, "subject", null, 1, 1, Triples.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriples_Predicateobject(), this.getPredicateObject(), null, "predicateobject", null, 0, -1,
				Triples.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", "", 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_DataGraph(), this.getDataGraph(), null, "dataGraph", null, 0, 1, Graph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Namespaces(), this.getNamespace(), null, "namespaces", null, 0, -1, Graph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_ShapesGraph(), this.getShapesGraph(), null, "shapesGraph", null, 0, 1, Graph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespace_Prefix(), theXMLTypePackage.getString(), "prefix", null, 0, 1, Namespace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespace_Namespace(), theXMLTypePackage.getString(), "namespace", null, 0, 1,
				Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(subjectEClass, Subject.class, "Subject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectEClass, magicSHACL.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_XsdType(), ecorePackage.getEString(), "xsdType", null, 0, 1, magicSHACL.Object.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateObjectEClass, PredicateObject.class, "PredicateObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateObject_Predicate(), this.getPredicate(), null, "predicate", null, 1, 1,
				PredicateObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateObject_Object(), this.getObject(), null, "object", null, 1, 1, PredicateObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeConstraintEClass, ShapeConstraint.class, "ShapeConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeConstraint_ShapeName(), this.getShapeName(), null, "shapeName", null, 1, 1,
				ShapeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeConstraint_ShapeExpressions(), this.getShapeExpression(), null, "shapeExpressions", null,
				0, -1, ShapeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeConstraint_Dangerous(), ecorePackage.getEBooleanObject(), "dangerous", null, 0, 1,
				ShapeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEReference(getShapeConstraint_Targets(), this.getTarget(), null, "targets", null, 0, -1,
				ShapeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getShapeConstraint__Contains__Node(), theXMLTypePackage.getBoolean(), "contains",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getShapeConstraint__GetAllShapeNamesOfExpression(), null, "getAllShapeNamesOfExpression", 0,
				1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(shapesGraphEClass, ShapesGraph.class, "ShapesGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapesGraph_ShapeConstraints(), this.getShapeConstraint(), null, "shapeConstraints", null, 0,
				-1, ShapesGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getShapesGraph_OddCycles(), g1, "oddCycles", null, 0, 1, ShapesGraph.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getShapesGraph__GetAllShapeNames(), null, "getAllShapeNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(shapeExpressionEClass, ShapeExpression.class, "ShapeExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeExpression_Type(), this.getPropertyType(), "type", null, 0, 1, ShapeExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeExpression_ShapeExpressions(), this.getShapeExpression(), null, "shapeExpressions", null,
				0, -1, ShapeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeExpression_Values(), this.getValue(), null, "values", null, 0, -1, ShapeExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeExpression_AbstractString(), ecorePackage.getEString(), "abstractString", null, 0, 1,
				ShapeExpression.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		op = initEOperation(getShapeExpression__Contains__String(), theXMLTypePackage.getBoolean(), "contains", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(shapeNameEClass, ShapeName.class, "ShapeName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeName_Adorned(), theXMLTypePackage.getBoolean(), "adorned", null, 0, 1, ShapeName.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeName_Dangerous(), theXMLTypePackage.getBoolean(), "dangerous", null, 0, 1,
				ShapeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEOperation(getShapeName__GetMagicShapeName(), this.getShapeName(), "getMagicShapeName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Adorned(), theXMLTypePackage.getBoolean(), "adorned", null, 0, 1, Value.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValue_Idb(), theXMLTypePackage.getBoolean(), "idb", null, 0, 1, Value.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getValue_Dangerous(), theXMLTypePackage.getBoolean(), "dangerous", null, 0, 1, Value.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getValue_XsdType(), ecorePackage.getEString(), "xsdType", null, 0, 1, Value.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getValue__ToShapeName(), this.getShapeName(), "toShapeName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarget_Term(), ecorePackage.getEString(), "term", null, 0, 1, Target.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Type(), ecorePackage.getEString(), "type", null, 0, 1, Target.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTarget__GetShapeName(), this.getShapeName(), "getShapeName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTarget__GetMagicQuerySeed(), this.getShapeConstraint(), "getMagicQuerySeed", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(propertyTypeEEnum, PropertyType.class, "PropertyType");
		addEEnumLiteral(propertyTypeEEnum, PropertyType.BLANK);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.CLASS_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MIN_COUNT_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MAX_COUNT_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.NOT_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.AND_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.OR_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.NODE_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.HAS_VALUE_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.PREDICATE_PATH);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.PROPERTY);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.NAME);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.DATATYPE_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.NODE_KIND_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.PATTERN_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.TARGET_CLASS);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.CLOSED_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.CLOSED_CONSTRAINT_COMPONENT_IGNORE);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.INVERSE_PATH);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.TARGET_NODE);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MESSAGE);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MIN_EXCLUSIVE_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MIN_INCLUSIVE_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MAX_EXCLUSIVE_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MAX_INCLUSIVE_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MIN_LENGTH_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.MAX_LENGTH_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.INSTANCE_OF);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.RDFS_LABEL);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.DESCRIPTION);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.EQUALS_CONSTRAINT_COMPONENT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.QUALIFIED_VALUE_SHAPE);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.QUALIFIED_MIN_COUNT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.QUALIFIED_MAX_COUNT);
		addEEnumLiteral(propertyTypeEEnum, PropertyType.HAS_CLASS_CONSTRAINT_COMPONENT);

		// Create resource
		createResource(eNS_URI);
	}

} //MagicSHACLPackageImpl
