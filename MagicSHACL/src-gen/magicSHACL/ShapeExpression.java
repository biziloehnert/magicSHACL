/**
 */
package magicSHACL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.ShapeExpression#getType <em>Type</em>}</li>
 *   <li>{@link magicSHACL.ShapeExpression#getShapeExpressions <em>Shape Expressions</em>}</li>
 *   <li>{@link magicSHACL.ShapeExpression#getValues <em>Values</em>}</li>
 *   <li>{@link magicSHACL.ShapeExpression#getAbstractString <em>Abstract String</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getShapeExpression()
 * @model
 * @generated
 */
public interface ShapeExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link magicSHACL.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see magicSHACL.PropertyType
	 * @see #setType(PropertyType)
	 * @see magicSHACL.MagicSHACLPackage#getShapeExpression_Type()
	 * @model
	 * @generated
	 */
	PropertyType getType();

	/**
	 * Sets the value of the '{@link magicSHACL.ShapeExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see magicSHACL.PropertyType
	 * @see #getType()
	 * @generated
	 */
	void setType(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Shape Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.ShapeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Expressions</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getShapeExpression_ShapeExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShapeExpression> getShapeExpressions();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getShapeExpression_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

	/**
	 * Returns the value of the '<em><b>Abstract String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract String</em>' attribute.
	 * @see #setAbstractString(String)
	 * @see magicSHACL.MagicSHACLPackage#getShapeExpression_AbstractString()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	String getAbstractString();

	/**
	 * Sets the value of the '{@link magicSHACL.ShapeExpression#getAbstractString <em>Abstract String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract String</em>' attribute.
	 * @see #getAbstractString()
	 * @generated
	 */
	void setAbstractString(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean contains(String name);

} // ShapeExpression
