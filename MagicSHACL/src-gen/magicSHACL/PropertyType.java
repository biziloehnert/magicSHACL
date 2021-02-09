/**
 */
package magicSHACL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see magicSHACL.MagicSHACLPackage#getPropertyType()
 * @model
 * @generated
 */
public enum PropertyType implements Enumerator {
	/**
	 * The '<em><b>Class Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_CONSTRAINT_COMPONENT(9, "ClassConstraintComponent", "sh:class"),

	/**
	 * The '<em><b>Min Count Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_COUNT_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_COUNT_CONSTRAINT_COMPONENT(1, "MinCountConstraintComponent", "sh:minCount"),

	/**
	 * The '<em><b>Max Count Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_COUNT_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_COUNT_CONSTRAINT_COMPONENT(2, "MaxCountConstraintComponent", "sh:maxCount"),

	/**
	 * The '<em><b>Not Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_CONSTRAINT_COMPONENT(3, "NotConstraintComponent", "sh:not"),

	/**
	 * The '<em><b>And Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	AND_CONSTRAINT_COMPONENT(4, "AndConstraintComponent", "sh:and"),

	/**
	 * The '<em><b>Or Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	OR_CONSTRAINT_COMPONENT(5, "OrConstraintComponent", "sh:or"),

	/**
	 * The '<em><b>Node Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_CONSTRAINT_COMPONENT(6, "NodeConstraintComponent", "sh:node"),

	/**
	 * The '<em><b>Has Value Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_VALUE_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_VALUE_CONSTRAINT_COMPONENT(7, "HasValueConstraintComponent", "sh:hasValue"),
	/**
	 * The '<em><b>Predicate Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDICATE_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	PREDICATE_PATH(8, "PredicatePath", "sh:path"),
	/**
	 * The '<em><b>Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY(0, "Property", "sh:property"),
	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(11, "Name", "sh:name"),
	/**
	 * The '<em><b>Datatype Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DATATYPE_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	DATATYPE_CONSTRAINT_COMPONENT(11, "DatatypeConstraintComponent", "sh:datatype"),
	/**
	 * The '<em><b>Node Kind Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NODE_KIND_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_KIND_CONSTRAINT_COMPONENT(12, "NodeKindConstraintComponent", "sh:nodeKind"),
	/**
	 * The '<em><b>Pattern Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PATTERN_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATTERN_CONSTRAINT_COMPONENT(13, "PatternConstraintComponent", "sh:pattern"),
	/**
	 * The '<em><b>Target Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TARGET_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	TARGET_CLASS(14, "TargetClass", "sh:targetClass"),
	/**
	 * The '<em><b>Closed Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CLOSED_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_CONSTRAINT_COMPONENT(15, "ClosedConstraintComponent", "sh:closed"),
	/**
	 * The '<em><b>Closed Constraint Component ignore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CLOSED_CONSTRAINT_COMPONENT_IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_CONSTRAINT_COMPONENT_IGNORE(16, "ClosedConstraintComponent_ignore", "sh:ignoredProperties"),
	/**
	 * The '<em><b>Inverse Path</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #INVERSE_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	INVERSE_PATH(17, "InversePath", "sh:inversePath"),
	/**
	 * The '<em><b>Target Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TARGET_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	TARGET_NODE(18, "TargetNode", "sh:targetNode");

	/**
	 * The '<em><b>Class Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_CONSTRAINT_COMPONENT
	 * @model name="ClassConstraintComponent" literal="sh:class"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_CONSTRAINT_COMPONENT_VALUE = 9;

	/**
	 * The '<em><b>Min Count Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_COUNT_CONSTRAINT_COMPONENT
	 * @model name="MinCountConstraintComponent" literal="sh:minCount"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_COUNT_CONSTRAINT_COMPONENT_VALUE = 1;

	/**
	 * The '<em><b>Max Count Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_COUNT_CONSTRAINT_COMPONENT
	 * @model name="MaxCountConstraintComponent" literal="sh:maxCount"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_COUNT_CONSTRAINT_COMPONENT_VALUE = 2;

	/**
	 * The '<em><b>Not Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_CONSTRAINT_COMPONENT
	 * @model name="NotConstraintComponent" literal="sh:not"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_CONSTRAINT_COMPONENT_VALUE = 3;

	/**
	 * The '<em><b>And Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_CONSTRAINT_COMPONENT
	 * @model name="AndConstraintComponent" literal="sh:and"
	 * @generated
	 * @ordered
	 */
	public static final int AND_CONSTRAINT_COMPONENT_VALUE = 4;

	/**
	 * The '<em><b>Or Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_CONSTRAINT_COMPONENT
	 * @model name="OrConstraintComponent" literal="sh:or"
	 * @generated
	 * @ordered
	 */
	public static final int OR_CONSTRAINT_COMPONENT_VALUE = 5;

	/**
	 * The '<em><b>Node Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_CONSTRAINT_COMPONENT
	 * @model name="NodeConstraintComponent" literal="sh:node"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_CONSTRAINT_COMPONENT_VALUE = 6;

	/**
	 * The '<em><b>Has Value Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_VALUE_CONSTRAINT_COMPONENT
	 * @model name="HasValueConstraintComponent" literal="sh:hasValue"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_VALUE_CONSTRAINT_COMPONENT_VALUE = 7;

	/**
	 * The '<em><b>Predicate Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDICATE_PATH
	 * @model name="PredicatePath" literal="sh:path"
	 * @generated
	 * @ordered
	 */
	public static final int PREDICATE_PATH_VALUE = 8;

	/**
	 * The '<em><b>Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY
	 * @model name="Property" literal="sh:property"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE = 0;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="Name" literal="sh:name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 11;

	/**
	 * The '<em><b>Datatype Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATATYPE_CONSTRAINT_COMPONENT
	 * @model name="DatatypeConstraintComponent" literal="sh:datatype"
	 * @generated
	 * @ordered
	 */
	public static final int DATATYPE_CONSTRAINT_COMPONENT_VALUE = 11;

	/**
	 * The '<em><b>Node Kind Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_KIND_CONSTRAINT_COMPONENT
	 * @model name="NodeKindConstraintComponent" literal="sh:nodeKind"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_KIND_CONSTRAINT_COMPONENT_VALUE = 12;

	/**
	 * The '<em><b>Pattern Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATTERN_CONSTRAINT_COMPONENT
	 * @model name="PatternConstraintComponent" literal="sh:pattern"
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_CONSTRAINT_COMPONENT_VALUE = 13;

	/**
	 * The '<em><b>Target Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_CLASS
	 * @model name="TargetClass" literal="sh:targetClass"
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_CLASS_VALUE = 14;

	/**
	 * The '<em><b>Closed Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_CONSTRAINT_COMPONENT
	 * @model name="ClosedConstraintComponent" literal="sh:closed"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_CONSTRAINT_COMPONENT_VALUE = 15;

	/**
	 * The '<em><b>Closed Constraint Component ignore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_CONSTRAINT_COMPONENT_IGNORE
	 * @model name="ClosedConstraintComponent_ignore" literal="sh:ignoredProperties"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_CONSTRAINT_COMPONENT_IGNORE_VALUE = 16;

	/**
	 * The '<em><b>Inverse Path</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERSE_PATH
	 * @model name="InversePath" literal="sh:inversePath"
	 * @generated
	 * @ordered
	 */
	public static final int INVERSE_PATH_VALUE = 17;

	/**
	 * The '<em><b>Target Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_NODE
	 * @model name="TargetNode" literal="sh:targetNode"
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_NODE_VALUE = 18;

	/**
	 * An array of all the '<em><b>Property Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyType[] VALUES_ARRAY = new PropertyType[] { CLASS_CONSTRAINT_COMPONENT,
			MIN_COUNT_CONSTRAINT_COMPONENT, MAX_COUNT_CONSTRAINT_COMPONENT, NOT_CONSTRAINT_COMPONENT,
			AND_CONSTRAINT_COMPONENT, OR_CONSTRAINT_COMPONENT, NODE_CONSTRAINT_COMPONENT,
			HAS_VALUE_CONSTRAINT_COMPONENT, PREDICATE_PATH, PROPERTY, NAME, DATATYPE_CONSTRAINT_COMPONENT,
			NODE_KIND_CONSTRAINT_COMPONENT, PATTERN_CONSTRAINT_COMPONENT, TARGET_CLASS, CLOSED_CONSTRAINT_COMPONENT,
			CLOSED_CONSTRAINT_COMPONENT_IGNORE, INVERSE_PATH, TARGET_NODE, };

	/**
	 * A public read-only list of all the '<em><b>Property Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyType get(int value) {
		switch (value) {
		case CLASS_CONSTRAINT_COMPONENT_VALUE:
			return CLASS_CONSTRAINT_COMPONENT;
		case MIN_COUNT_CONSTRAINT_COMPONENT_VALUE:
			return MIN_COUNT_CONSTRAINT_COMPONENT;
		case MAX_COUNT_CONSTRAINT_COMPONENT_VALUE:
			return MAX_COUNT_CONSTRAINT_COMPONENT;
		case NOT_CONSTRAINT_COMPONENT_VALUE:
			return NOT_CONSTRAINT_COMPONENT;
		case AND_CONSTRAINT_COMPONENT_VALUE:
			return AND_CONSTRAINT_COMPONENT;
		case OR_CONSTRAINT_COMPONENT_VALUE:
			return OR_CONSTRAINT_COMPONENT;
		case NODE_CONSTRAINT_COMPONENT_VALUE:
			return NODE_CONSTRAINT_COMPONENT;
		case HAS_VALUE_CONSTRAINT_COMPONENT_VALUE:
			return HAS_VALUE_CONSTRAINT_COMPONENT;
		case PREDICATE_PATH_VALUE:
			return PREDICATE_PATH;
		case PROPERTY_VALUE:
			return PROPERTY;
		case NAME_VALUE:
			return NAME;
		case NODE_KIND_CONSTRAINT_COMPONENT_VALUE:
			return NODE_KIND_CONSTRAINT_COMPONENT;
		case PATTERN_CONSTRAINT_COMPONENT_VALUE:
			return PATTERN_CONSTRAINT_COMPONENT;
		case TARGET_CLASS_VALUE:
			return TARGET_CLASS;
		case CLOSED_CONSTRAINT_COMPONENT_VALUE:
			return CLOSED_CONSTRAINT_COMPONENT;
		case CLOSED_CONSTRAINT_COMPONENT_IGNORE_VALUE:
			return CLOSED_CONSTRAINT_COMPONENT_IGNORE;
		case INVERSE_PATH_VALUE:
			return INVERSE_PATH;
		case TARGET_NODE_VALUE:
			return TARGET_NODE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PropertyType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //PropertyType
