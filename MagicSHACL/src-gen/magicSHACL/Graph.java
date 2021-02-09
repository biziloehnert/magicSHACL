/**
 */
package magicSHACL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.Graph#getDataGraph <em>Data Graph</em>}</li>
 *   <li>{@link magicSHACL.Graph#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link magicSHACL.Graph#getShapesGraph <em>Shapes Graph</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Graph</em>' containment reference.
	 * @see #setDataGraph(DataGraph)
	 * @see magicSHACL.MagicSHACLPackage#getGraph_DataGraph()
	 * @model containment="true"
	 * @generated
	 */
	DataGraph getDataGraph();

	/**
	 * Sets the value of the '{@link magicSHACL.Graph#getDataGraph <em>Data Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Graph</em>' containment reference.
	 * @see #getDataGraph()
	 * @generated
	 */
	void setDataGraph(DataGraph value);

	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.Namespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getGraph_Namespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespaces();

	/**
	 * Returns the value of the '<em><b>Shapes Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes Graph</em>' containment reference.
	 * @see #setShapesGraph(ShapesGraph)
	 * @see magicSHACL.MagicSHACLPackage#getGraph_ShapesGraph()
	 * @model containment="true"
	 * @generated
	 */
	ShapesGraph getShapesGraph();

	/**
	 * Sets the value of the '{@link magicSHACL.Graph#getShapesGraph <em>Shapes Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shapes Graph</em>' containment reference.
	 * @see #getShapesGraph()
	 * @generated
	 */
	void setShapesGraph(ShapesGraph value);

} // Graph
