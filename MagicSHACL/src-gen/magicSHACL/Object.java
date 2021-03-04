/**
 */
package magicSHACL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.Object#getXsdType <em>Xsd Type</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Node {

	/**
	 * Returns the value of the '<em><b>Xsd Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd Type</em>' attribute.
	 * @see #setXsdType(String)
	 * @see magicSHACL.MagicSHACLPackage#getObject_XsdType()
	 * @model
	 * @generated
	 */
	String getXsdType();

	/**
	 * Sets the value of the '{@link magicSHACL.Object#getXsdType <em>Xsd Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd Type</em>' attribute.
	 * @see #getXsdType()
	 * @generated
	 */
	void setXsdType(String value);
} // Object
