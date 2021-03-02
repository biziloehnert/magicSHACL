/**
 */
package magicSHACL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.Value#isAdorned <em>Adorned</em>}</li>
 *   <li>{@link magicSHACL.Value#isIdb <em>Idb</em>}</li>
 *   <li>{@link magicSHACL.Value#isDangerous <em>Dangerous</em>}</li>
 *   <li>{@link magicSHACL.Value#getXsdType <em>Xsd Type</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends Node {

	/**
	 * Returns the value of the '<em><b>Adorned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adorned</em>' attribute.
	 * @see #setAdorned(boolean)
	 * @see magicSHACL.MagicSHACLPackage#getValue_Adorned()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAdorned();

	/**
	 * Sets the value of the '{@link magicSHACL.Value#isAdorned <em>Adorned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adorned</em>' attribute.
	 * @see #isAdorned()
	 * @generated
	 */
	void setAdorned(boolean value);

	/**
	 * Returns the value of the '<em><b>Idb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idb</em>' attribute.
	 * @see #setIdb(boolean)
	 * @see magicSHACL.MagicSHACLPackage#getValue_Idb()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" derived="true"
	 * @generated
	 */
	boolean isIdb();

	/**
	 * Sets the value of the '{@link magicSHACL.Value#isIdb <em>Idb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idb</em>' attribute.
	 * @see #isIdb()
	 * @generated
	 */
	void setIdb(boolean value);

	/**
	 * Returns the value of the '<em><b>Dangerous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dangerous</em>' attribute.
	 * @see #setDangerous(boolean)
	 * @see magicSHACL.MagicSHACLPackage#getValue_Dangerous()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" derived="true"
	 * @generated
	 */
	boolean isDangerous();

	/**
	 * Sets the value of the '{@link magicSHACL.Value#isDangerous <em>Dangerous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dangerous</em>' attribute.
	 * @see #isDangerous()
	 * @generated
	 */
	void setDangerous(boolean value);

	/**
	 * Returns the value of the '<em><b>Xsd Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsd Type</em>' attribute.
	 * @see #setXsdType(String)
	 * @see magicSHACL.MagicSHACLPackage#getValue_XsdType()
	 * @model
	 * @generated
	 */
	String getXsdType();

	/**
	 * Sets the value of the '{@link magicSHACL.Value#getXsdType <em>Xsd Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsd Type</em>' attribute.
	 * @see #getXsdType()
	 * @generated
	 */
	void setXsdType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ShapeName toShapeName();
}
// Value
