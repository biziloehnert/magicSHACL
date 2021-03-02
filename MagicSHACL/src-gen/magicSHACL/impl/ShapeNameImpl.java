/**
 */
package magicSHACL.impl;

import java.lang.reflect.InvocationTargetException;
import magicSHACL.MagicSHACLPackage;
import magicSHACL.Node;
import magicSHACL.ShapeName;
import magicSHACL.ShapesGraph;
import magicSHACL.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.impl.ShapeNameImpl#isAdorned <em>Adorned</em>}</li>
 *   <li>{@link magicSHACL.impl.ShapeNameImpl#isDangerous <em>Dangerous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeNameImpl extends NodeImpl implements ShapeName {
	/**
	 * The default value of the '{@link #isAdorned() <em>Adorned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdorned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADORNED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAdorned() <em>Adorned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdorned()
	 * @generated
	 * @ordered
	 */
	protected boolean adorned = ADORNED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDangerous() <em>Dangerous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDangerous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DANGEROUS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDangerous() <em>Dangerous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDangerous()
	 * @generated
	 * @ordered
	 */
	protected boolean dangerous = DANGEROUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ShapeNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MagicSHACLPackage.Literals.SHAPE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAdorned() {
		return adorned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdorned(boolean newAdorned) {
		boolean oldAdorned = adorned;
		adorned = newAdorned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.SHAPE_NAME__ADORNED, oldAdorned,
					adorned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isDangerous() {
		for (EList<String> cycle : ((ShapesGraph) eContainer().eContainer()).getOddCycles()) {
			if (cycle.contains(this.getName()))
				return true;
		}

		for (Node node : ((ShapesGraph) eContainer().eContainer()).getAllShapeNames()) {
			if (node.equals(this) && node instanceof Value && ((Value) node).isDangerous())
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
	public void setDangerous(boolean newDangerous) {
		boolean oldDangerous = dangerous;
		dangerous = newDangerous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.SHAPE_NAME__DANGEROUS, oldDangerous,
					dangerous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ShapeName getMagicShapeName() {
		ShapeName magicShapeName = new ShapeNameImpl();
		magicShapeName.setName(this.name + "_magic");
		return magicShapeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MagicSHACLPackage.SHAPE_NAME__ADORNED:
			return isAdorned();
		case MagicSHACLPackage.SHAPE_NAME__DANGEROUS:
			return isDangerous();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MagicSHACLPackage.SHAPE_NAME__ADORNED:
			setAdorned((Boolean) newValue);
			return;
		case MagicSHACLPackage.SHAPE_NAME__DANGEROUS:
			setDangerous((Boolean) newValue);
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
		case MagicSHACLPackage.SHAPE_NAME__ADORNED:
			setAdorned(ADORNED_EDEFAULT);
			return;
		case MagicSHACLPackage.SHAPE_NAME__DANGEROUS:
			setDangerous(DANGEROUS_EDEFAULT);
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
		case MagicSHACLPackage.SHAPE_NAME__ADORNED:
			return adorned != ADORNED_EDEFAULT;
		case MagicSHACLPackage.SHAPE_NAME__DANGEROUS:
			return dangerous != DANGEROUS_EDEFAULT;
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
		case MagicSHACLPackage.SHAPE_NAME___GET_MAGIC_SHAPE_NAME:
			return getMagicShapeName();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (adorned: ");
		result.append(adorned);
		result.append(", dangerous: ");
		result.append(dangerous);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ShapeName)
			return name.equals(((ShapeName) obj).getName());
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

} //ShapeNameImpl
