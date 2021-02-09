/**
 */
package magicSHACL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.ShapeConstraint#getShapeName <em>Shape Name</em>}</li>
 *   <li>{@link magicSHACL.ShapeConstraint#getShapeExpressions <em>Shape Expressions</em>}</li>
 * </ul>
 *
 * @see magicSHACL.MagicSHACLPackage#getShapeConstraint()
 * @model
 * @generated
 */
public interface ShapeConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Name</em>' containment reference.
	 * @see #setShapeName(ShapeName)
	 * @see magicSHACL.MagicSHACLPackage#getShapeConstraint_ShapeName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ShapeName getShapeName();

	/**
	 * Sets the value of the '{@link magicSHACL.ShapeConstraint#getShapeName <em>Shape Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Name</em>' containment reference.
	 * @see #getShapeName()
	 * @generated
	 */
	void setShapeName(ShapeName value);

	/**
	 * Returns the value of the '<em><b>Shape Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.ShapeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Expressions</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getShapeConstraint_ShapeExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShapeExpression> getShapeExpressions();

} // ShapeConstraint
