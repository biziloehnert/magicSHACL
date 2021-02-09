/**
 */
package magicSHACL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.Namespace#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link magicSHACL.Namespace#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends EObject {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see magicSHACL.MagicSHACLPackage#getNamespace_Prefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link magicSHACL.Namespace#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see magicSHACL.MagicSHACLPackage#getNamespace_Namespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link magicSHACL.Namespace#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // Namespace
