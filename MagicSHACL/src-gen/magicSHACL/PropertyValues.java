/**
 */
package magicSHACL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.PropertyValues#getProperty <em>Property</em>}</li>
 *   <li>{@link magicSHACL.PropertyValues#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getPropertyValues()
 * @model
 * @generated
 */
public interface PropertyValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(Property)
	 * @see magicSHACL.MagicSHACLPackage#getPropertyValues_Property()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link magicSHACL.PropertyValues#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getPropertyValues_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Value> getValues();

} // PropertyValues
