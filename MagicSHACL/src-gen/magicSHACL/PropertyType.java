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
	 * The '<em><b>Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	BLANK(0, "Blank", " "),
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
	PROPERTY(29, "Property", "sh:property"),
	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(10, "Name", "sh:name"),
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
	TARGET_NODE(18, "TargetNode", "sh:targetNode"),
	/**
	 * The '<em><b>Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE(19, "Message", "sh:message"),
	/**
	 * The '<em><b>Min Exclusive Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MIN_EXCLUSIVE_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_EXCLUSIVE_CONSTRAINT_COMPONENT(20, "MinExclusiveConstraintComponent", "sh:minExclusive"),
	/**
	 * The '<em><b>Min Inclusive Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MIN_INCLUSIVE_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_INCLUSIVE_CONSTRAINT_COMPONENT(21, "MinInclusiveConstraintComponent", "sh:minInclusive"),
	/**
	 * The '<em><b>Max Exclusive Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MAX_EXCLUSIVE_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_EXCLUSIVE_CONSTRAINT_COMPONENT(22, "MaxExclusiveConstraintComponent", "sh:maxExclusive"),
	/**
	 * The '<em><b>Max Inclusive Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MAX_INCLUSIVE_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_INCLUSIVE_CONSTRAINT_COMPONENT(23, "MaxInclusiveConstraintComponent", "sh:maxInclusive"),
	/**
	 * The '<em><b>Min Length Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MIN_LENGTH_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_LENGTH_CONSTRAINT_COMPONENT(24, "MinLengthConstraintComponent", "sh:minLength"),
	/**
	 * The '<em><b>Max Length Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MAX_LENGTH_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_LENGTH_CONSTRAINT_COMPONENT(25, "MaxLengthConstraintComponent", "sh:maxLength"),
	/**
	 * The '<em><b>Instance Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #INSTANCE_OF_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE_OF(26, "InstanceOf", "a"),
	/**
	 * The '<em><b>Rdfs Label</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #RDFS_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	RDFS_LABEL(27, "RdfsLabel", "rdfs:label"),
	/**
	 * The '<em><b>Description</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTION(28, "Description", "Description"),
	/**
	 * The '<em><b>Equals Constraint Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #EQUALS_CONSTRAINT_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS_CONSTRAINT_COMPONENT(29, "EqualsConstraintComponent", "sh:equals"),
	/**
	 * The '<em><b>Qualified Value Shape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #QUALIFIED_VALUE_SHAPE_VALUE
	 * @generated
	 * @ordered
	 */
	QUALIFIED_VALUE_SHAPE(30, "QualifiedValueShape", "sh:qualifiedValueShape"),
	/**
	 * The '<em><b>Qualified Min Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #QUALIFIED_MIN_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	QUALIFIED_MIN_COUNT(31, "QualifiedMinCount", "sh:qualifiedMinCount"),
	/**
	 * The '<em><b>Qualified Max Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #QUALIFIED_MAX_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	QUALIFIED_MAX_COUNT(32, "QualifiedMaxCount", "sh:qualifiedMaxCount"),
	/**
	* The '<em><b>Has Class Constraint Component</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #HAS_CLASS_CONSTRAINT_COMPONENT_VALUE
	* @generated
	* @ordered
	*/
	HAS_CLASS_CONSTRAINT_COMPONENT(33, "HasClassConstraintComponent", "sh:hasClass");

	/**
	 * The '<em><b>Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLANK
	 * @model name="Blank" literal=" "
	 * @generated
	 * @ordered
	 */
	public static final int BLANK_VALUE = 0;

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
	public static final int PROPERTY_VALUE = 29;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="Name" literal="sh:name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 10;

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
	 * The '<em><b>Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE
	 * @model name="Message" literal="sh:message"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_VALUE = 19;

	/**
	 * The '<em><b>Min Exclusive Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_EXCLUSIVE_CONSTRAINT_COMPONENT
	 * @model name="MinExclusiveConstraintComponent" literal="sh:minExclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_EXCLUSIVE_CONSTRAINT_COMPONENT_VALUE = 20;

	/**
	 * The '<em><b>Min Inclusive Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_INCLUSIVE_CONSTRAINT_COMPONENT
	 * @model name="MinInclusiveConstraintComponent" literal="sh:minInclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_INCLUSIVE_CONSTRAINT_COMPONENT_VALUE = 21;

	/**
	 * The '<em><b>Max Exclusive Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_EXCLUSIVE_CONSTRAINT_COMPONENT
	 * @model name="MaxExclusiveConstraintComponent" literal="sh:maxExclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_EXCLUSIVE_CONSTRAINT_COMPONENT_VALUE = 22;

	/**
	 * The '<em><b>Max Inclusive Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_INCLUSIVE_CONSTRAINT_COMPONENT
	 * @model name="MaxInclusiveConstraintComponent" literal="sh:maxInclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_INCLUSIVE_CONSTRAINT_COMPONENT_VALUE = 23;

	/**
	 * The '<em><b>Min Length Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_LENGTH_CONSTRAINT_COMPONENT
	 * @model name="MinLengthConstraintComponent" literal="sh:minLength"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_LENGTH_CONSTRAINT_COMPONENT_VALUE = 24;

	/**
	 * The '<em><b>Max Length Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_LENGTH_CONSTRAINT_COMPONENT
	 * @model name="MaxLengthConstraintComponent" literal="sh:maxLength"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_LENGTH_CONSTRAINT_COMPONENT_VALUE = 25;

	/**
	 * The '<em><b>Instance Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_OF
	 * @model name="InstanceOf" literal="a"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_OF_VALUE = 26;

	/**
	 * The '<em><b>Rdfs Label</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDFS_LABEL
	 * @model name="RdfsLabel" literal="rdfs:label"
	 * @generated
	 * @ordered
	 */
	public static final int RDFS_LABEL_VALUE = 27;

	/**
	 * The '<em><b>Description</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION
	 * @model name="Description"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTION_VALUE = 28;

	/**
	 * The '<em><b>Equals Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_CONSTRAINT_COMPONENT
	 * @model name="EqualsConstraintComponent" literal="sh:equals"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_CONSTRAINT_COMPONENT_VALUE = 29;

	/**
	 * The '<em><b>Qualified Value Shape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALIFIED_VALUE_SHAPE
	 * @model name="QualifiedValueShape" literal="sh:qualifiedValueShape"
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFIED_VALUE_SHAPE_VALUE = 30;

	/**
	 * The '<em><b>Qualified Min Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALIFIED_MIN_COUNT
	 * @model name="QualifiedMinCount" literal="sh:qualifiedMinCount"
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFIED_MIN_COUNT_VALUE = 31;

	/**
	 * The '<em><b>Qualified Max Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALIFIED_MAX_COUNT
	 * @model name="QualifiedMaxCount" literal="sh:qualifiedMaxCount"
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFIED_MAX_COUNT_VALUE = 32;

	/**
	 * The '<em><b>Has Class Constraint Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_CLASS_CONSTRAINT_COMPONENT
	 * @model name="HasClassConstraintComponent" literal="sh:hasClass"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_CLASS_CONSTRAINT_COMPONENT_VALUE = 33;

	/**
	 * An array of all the '<em><b>Property Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyType[] VALUES_ARRAY = new PropertyType[] { BLANK, CLASS_CONSTRAINT_COMPONENT,
			MIN_COUNT_CONSTRAINT_COMPONENT, MAX_COUNT_CONSTRAINT_COMPONENT, NOT_CONSTRAINT_COMPONENT,
			AND_CONSTRAINT_COMPONENT, OR_CONSTRAINT_COMPONENT, NODE_CONSTRAINT_COMPONENT,
			HAS_VALUE_CONSTRAINT_COMPONENT, PREDICATE_PATH, PROPERTY, NAME, DATATYPE_CONSTRAINT_COMPONENT,
			NODE_KIND_CONSTRAINT_COMPONENT, PATTERN_CONSTRAINT_COMPONENT, TARGET_CLASS, CLOSED_CONSTRAINT_COMPONENT,
			CLOSED_CONSTRAINT_COMPONENT_IGNORE, INVERSE_PATH, TARGET_NODE, MESSAGE, MIN_EXCLUSIVE_CONSTRAINT_COMPONENT,
			MIN_INCLUSIVE_CONSTRAINT_COMPONENT, MAX_EXCLUSIVE_CONSTRAINT_COMPONENT, MAX_INCLUSIVE_CONSTRAINT_COMPONENT,
			MIN_LENGTH_CONSTRAINT_COMPONENT, MAX_LENGTH_CONSTRAINT_COMPONENT, INSTANCE_OF, RDFS_LABEL, DESCRIPTION,
			EQUALS_CONSTRAINT_COMPONENT, QUALIFIED_VALUE_SHAPE, QUALIFIED_MIN_COUNT, QUALIFIED_MAX_COUNT,
			HAS_CLASS_CONSTRAINT_COMPONENT, };

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
		case BLANK_VALUE:
			return BLANK;
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
		case DATATYPE_CONSTRAINT_COMPONENT_VALUE:
			return DATATYPE_CONSTRAINT_COMPONENT;
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
		case MESSAGE_VALUE:
			return MESSAGE;
		case MIN_EXCLUSIVE_CONSTRAINT_COMPONENT_VALUE:
			return MIN_EXCLUSIVE_CONSTRAINT_COMPONENT;
		case MIN_INCLUSIVE_CONSTRAINT_COMPONENT_VALUE:
			return MIN_INCLUSIVE_CONSTRAINT_COMPONENT;
		case MAX_EXCLUSIVE_CONSTRAINT_COMPONENT_VALUE:
			return MAX_EXCLUSIVE_CONSTRAINT_COMPONENT;
		case MAX_INCLUSIVE_CONSTRAINT_COMPONENT_VALUE:
			return MAX_INCLUSIVE_CONSTRAINT_COMPONENT;
		case MIN_LENGTH_CONSTRAINT_COMPONENT_VALUE:
			return MIN_LENGTH_CONSTRAINT_COMPONENT;
		case MAX_LENGTH_CONSTRAINT_COMPONENT_VALUE:
			return MAX_LENGTH_CONSTRAINT_COMPONENT;
		case INSTANCE_OF_VALUE:
			return INSTANCE_OF;
		case RDFS_LABEL_VALUE:
			return RDFS_LABEL;
		case DESCRIPTION_VALUE:
			return DESCRIPTION;
		case QUALIFIED_VALUE_SHAPE_VALUE:
			return QUALIFIED_VALUE_SHAPE;
		case QUALIFIED_MIN_COUNT_VALUE:
			return QUALIFIED_MIN_COUNT;
		case QUALIFIED_MAX_COUNT_VALUE:
			return QUALIFIED_MAX_COUNT;
		case HAS_CLASS_CONSTRAINT_COMPONENT_VALUE:
			return HAS_CLASS_CONSTRAINT_COMPONENT;
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
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
