/**
 */
package magicSHACL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shapes Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.ShapesGraph#getShapeConstraints <em>Shape Constraints</em>}</li>
 *   <li>{@link magicSHACL.ShapesGraph#getOddCycles <em>Odd Cycles</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getShapesGraph()
 * @model
 * @generated
 */
public interface ShapesGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.ShapeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Constraints</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getShapesGraph_ShapeConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShapeConstraint> getShapeConstraints();

	/**
	 * Returns the value of the '<em><b>Odd Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odd Cycles</em>' attribute.
	 * @see #setOddCycles(EList)
	 * @see magicSHACL.MagicSHACLPackage#getShapesGraph_OddCycles()
	 * @model many="false" transient="true"
	 * @generated NOT
	 */
	EList<EList<String>> getOddCycles();

	/**
	 * Sets the value of the '{@link magicSHACL.ShapesGraph#getOddCycles <em>Odd Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odd Cycles</em>' attribute.
	 * @see #getOddCycles()
	 * @generated NOT
	 */
	void setOddCycles(EList<EList<String>> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated NOT
	 */
	EList<Node> getAllShapeNames();

} // ShapesGraph
