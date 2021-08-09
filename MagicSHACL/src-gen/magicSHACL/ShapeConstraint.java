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
 *   <li>{@link magicSHACL.ShapeConstraint#getDangerous <em>Dangerous</em>}</li>
 *   <li>{@link magicSHACL.ShapeConstraint#getTargets <em>Targets</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Dangerous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dangerous</em>' attribute.
	 * @see #setDangerous(Boolean)
	 * @see magicSHACL.MagicSHACLPackage#getShapeConstraint_Dangerous()
	 * @model derived="true"
	 * @generated
	 */
	Boolean getDangerous();

	/**
	 * Sets the value of the '{@link magicSHACL.ShapeConstraint#getDangerous <em>Dangerous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dangerous</em>' attribute.
	 * @see #getDangerous()
	 * @generated
	 */
	void setDangerous(Boolean value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link magicSHACL.Target}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see magicSHACL.MagicSHACLPackage#getShapeConstraint_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Target> getTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean contains(Node name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated NOT
	 */
	EList<Node> getAllShapeNamesOfExpression();

} // ShapeConstraint
