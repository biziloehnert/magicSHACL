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
import magicSHACL.Property;
import magicSHACL.PropertyType;
import magicSHACL.PropertyValues;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapeExpression;
import magicSHACL.ShapeName;
import magicSHACL.ShapesGraph;
import magicSHACL.Subject;
import magicSHACL.Triples;
import magicSHACL.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
	private EClass propertyEClass = null;

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
	private EClass propertyValuesEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iriEDataType = null;

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
	public EClass getDataGraph() {
		return dataGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataGraph_Triples() {
		return (EReference) dataGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriples() {
		return triplesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriples_Subject() {
		return (EReference) triplesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriples_Predicateobject() {
		return (EReference) triplesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Prefix() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_DataGraph() {
		return (EReference) graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_Namespaces() {
		return (EReference) graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_ShapesGraph() {
		return (EReference) graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Prefix() {
		return (EAttribute) namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Namespace() {
		return (EAttribute) namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubject() {
		return subjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateObject() {
		return predicateObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateObject_Predicate() {
		return (EReference) predicateObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateObject_Object() {
		return (EReference) predicateObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeConstraint() {
		return shapeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeConstraint_ShapeName() {
		return (EReference) shapeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeConstraint_ShapeExpressions() {
		return (EReference) shapeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapesGraph() {
		return shapesGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapesGraph_ShapeConstraints() {
		return (EReference) shapesGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeName() {
		return shapeNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValues() {
		return propertyValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValues_Property() {
		return (EReference) propertyValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValues_Values() {
		return (EReference) propertyValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeExpression() {
		return shapeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeExpression_PropertyValues() {
		return (EReference) shapeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeExpression_Type() {
		return (EAttribute) shapeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyType() {
		return propertyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIRI() {
		return iriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

		predicateObjectEClass = createEClass(PREDICATE_OBJECT);
		createEReference(predicateObjectEClass, PREDICATE_OBJECT__PREDICATE);
		createEReference(predicateObjectEClass, PREDICATE_OBJECT__OBJECT);

		shapeConstraintEClass = createEClass(SHAPE_CONSTRAINT);
		createEReference(shapeConstraintEClass, SHAPE_CONSTRAINT__SHAPE_NAME);
		createEReference(shapeConstraintEClass, SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS);

		shapesGraphEClass = createEClass(SHAPES_GRAPH);
		createEReference(shapesGraphEClass, SHAPES_GRAPH__SHAPE_CONSTRAINTS);

		shapeExpressionEClass = createEClass(SHAPE_EXPRESSION);
		createEReference(shapeExpressionEClass, SHAPE_EXPRESSION__PROPERTY_VALUES);
		createEAttribute(shapeExpressionEClass, SHAPE_EXPRESSION__TYPE);

		shapeNameEClass = createEClass(SHAPE_NAME);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__TYPE);

		valueEClass = createEClass(VALUE);

		propertyValuesEClass = createEClass(PROPERTY_VALUES);
		createEReference(propertyValuesEClass, PROPERTY_VALUES__PROPERTY);
		createEReference(propertyValuesEClass, PROPERTY_VALUES__VALUES);

		// Create enums
		propertyTypeEEnum = createEEnum(PROPERTY_TYPE);

		// Create data types
		iriEDataType = createEDataType(IRI);
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
		propertyEClass.getESuperTypes().add(this.getNode());
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

		initEClass(shapesGraphEClass, ShapesGraph.class, "ShapesGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapesGraph_ShapeConstraints(), this.getShapeConstraint(), null, "shapeConstraints", null, 0,
				-1, ShapesGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeExpressionEClass, ShapeExpression.class, "ShapeExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeExpression_PropertyValues(), this.getPropertyValues(), null, "propertyValues", null, 0,
				-1, ShapeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeExpression_Type(), this.getPropertyType(), "type", null, 0, 1, ShapeExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeNameEClass, ShapeName.class, "ShapeName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Type(), this.getPropertyType(), "type", "", 0, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyValuesEClass, PropertyValues.class, "PropertyValues", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyValues_Property(), this.getProperty(), null, "property", null, 1, 1,
				PropertyValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyValues_Values(), this.getValue(), null, "values", null, 1, -1, PropertyValues.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(propertyTypeEEnum, PropertyType.class, "PropertyType");
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

		// Initialize data types
		initEDataType(iriEDataType, String.class, "IRI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MagicSHACLPackageImpl
