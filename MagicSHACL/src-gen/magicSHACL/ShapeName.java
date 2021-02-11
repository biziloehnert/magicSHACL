/**
 */
package magicSHACL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.ShapeName#isAdorned <em>Adorned</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getShapeName()
 * @model
 * @generated
 */
public interface ShapeName extends Node {

	/**
	 * Returns the value of the '<em><b>Adorned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adorned</em>' attribute.
	 * @see #setAdorned(boolean)
	 * @see magicSHACL.MagicSHACLPackage#getShapeName_Adorned()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAdorned();

	/**
	 * Sets the value of the '{@link magicSHACL.ShapeName#isAdorned <em>Adorned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adorned</em>' attribute.
	 * @see #isAdorned()
	 * @generated
	 */
	void setAdorned(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ShapeName getMagicShapeName();
} // ShapeName
