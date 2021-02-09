/**
 */
package magicSHACL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.DataGraph#getTriples <em>Triples</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getDataGraph()
 * @model
 * @generated
 */
public interface DataGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Triples</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.Triples}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triples</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getDataGraph_Triples()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triples> getTriples();

} // DataGraph
