/**
 */
package magicSHACL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.PredicateObject#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link magicSHACL.PredicateObject#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getPredicateObject()
 * @model
 * @generated
 */
public interface PredicateObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(Predicate)
	 * @see magicSHACL.MagicSHACLPackage#getPredicateObject_Predicate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link magicSHACL.PredicateObject#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(magicSHACL.Object)
	 * @see magicSHACL.MagicSHACLPackage#getPredicateObject_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	magicSHACL.Object getObject();

	/**
	 * Sets the value of the '{@link magicSHACL.PredicateObject#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(magicSHACL.Object value);

} // PredicateObject
