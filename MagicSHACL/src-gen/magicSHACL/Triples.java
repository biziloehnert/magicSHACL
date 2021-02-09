/**
 */
package magicSHACL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triples</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.Triples#getSubject <em>Subject</em>}</li>
 *   <li>{@link magicSHACL.Triples#getPredicateobject <em>Predicateobject</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getTriples()
 * @model
 * @generated
 */
public interface Triples extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Subject)
	 * @see magicSHACL.MagicSHACLPackage#getTriples_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Subject getSubject();

	/**
	 * Sets the value of the '{@link magicSHACL.Triples#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Subject value);

	/**
	 * Returns the value of the '<em><b>Predicateobject</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.PredicateObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicateobject</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getTriples_Predicateobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<PredicateObject> getPredicateobject();

} // Triples
