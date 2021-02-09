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
 *   <li>{@link magicSHACL.ShapeExpression#getPropertyValues <em>Property Values</em>}</li>
 *   <li>{@link magicSHACL.ShapeExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getShapeExpression()
 * @model
 * @generated
 */
public interface ShapeExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.PropertyValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Values</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getShapeExpression_PropertyValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyValues> getPropertyValues();

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

} // ShapeExpression
