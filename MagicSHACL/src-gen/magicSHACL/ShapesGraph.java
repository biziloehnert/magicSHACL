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

} // ShapesGraph
