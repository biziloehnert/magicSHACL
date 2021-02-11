/**
 */
package magicSHACL.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import magicSHACL.MagicSHACLPackage;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapesGraph;

import magicSHACL.Target;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shapes Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.impl.ShapesGraphImpl#getShapeConstraints <em>Shape Constraints</em>}</li>
 *   <li>{@link magicSHACL.impl.ShapesGraphImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapesGraphImpl extends MinimalEObjectImpl.Container implements ShapesGraph {
	/**
	 * The cached value of the '{@link #getShapeConstraints() <em>Shape Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ShapeConstraint> shapeConstraints;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Target> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapesGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MagicSHACLPackage.Literals.SHAPES_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShapeConstraint> getShapeConstraints() {
		if (shapeConstraints == null) {
			shapeConstraints = new EObjectContainmentEList<ShapeConstraint>(ShapeConstraint.class, this,
					MagicSHACLPackage.SHAPES_GRAPH__SHAPE_CONSTRAINTS);
		}
		return shapeConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Target> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<Target>(Target.class, this, MagicSHACLPackage.SHAPES_GRAPH__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isShapeName(String shapeName) {
		for (ShapeConstraint shapeConstraint : shapeConstraints) {
			if (shapeConstraint.getShapeName().getName().equals(shapeName))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MagicSHACLPackage.SHAPES_GRAPH__SHAPE_CONSTRAINTS:
			return ((InternalEList<?>) getShapeConstraints()).basicRemove(otherEnd, msgs);
		case MagicSHACLPackage.SHAPES_GRAPH__TARGETS:
			return ((InternalEList<?>) getTargets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MagicSHACLPackage.SHAPES_GRAPH__SHAPE_CONSTRAINTS:
			return getShapeConstraints();
		case MagicSHACLPackage.SHAPES_GRAPH__TARGETS:
			return getTargets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MagicSHACLPackage.SHAPES_GRAPH__SHAPE_CONSTRAINTS:
			getShapeConstraints().clear();
			getShapeConstraints().addAll((Collection<? extends ShapeConstraint>) newValue);
			return;
		case MagicSHACLPackage.SHAPES_GRAPH__TARGETS:
			getTargets().clear();
			getTargets().addAll((Collection<? extends Target>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MagicSHACLPackage.SHAPES_GRAPH__SHAPE_CONSTRAINTS:
			getShapeConstraints().clear();
			return;
		case MagicSHACLPackage.SHAPES_GRAPH__TARGETS:
			getTargets().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MagicSHACLPackage.SHAPES_GRAPH__SHAPE_CONSTRAINTS:
			return shapeConstraints != null && !shapeConstraints.isEmpty();
		case MagicSHACLPackage.SHAPES_GRAPH__TARGETS:
			return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MagicSHACLPackage.SHAPES_GRAPH___IS_SHAPE_NAME__STRING:
			return isShapeName((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ShapesGraphImpl
