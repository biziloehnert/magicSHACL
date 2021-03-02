/**
 */
package magicSHACL.impl;

import java.lang.reflect.InvocationTargetException;

import magicSHACL.Graph;
import magicSHACL.MagicSHACLPackage;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapeName;
import magicSHACL.ShapesGraph;
import magicSHACL.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.impl.ValueImpl#isAdorned <em>Adorned</em>}</li>
 *   <li>{@link magicSHACL.impl.ValueImpl#isIdb <em>Idb</em>}</li>
 *   <li>{@link magicSHACL.impl.ValueImpl#isDangerous <em>Dangerous</em>}</li>
 *   <li>{@link magicSHACL.impl.ValueImpl#getXsdType <em>Xsd Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueImpl extends NodeImpl implements Value {
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
	 * The default value of the '{@link #isIdb() <em>Idb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdb()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDB_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIdb() <em>Idb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdb()
	 * @generated
	 * @ordered
	 */
	protected boolean idb = IDB_EDEFAULT;

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
	 * The default value of the '{@link #getXsdType() <em>Xsd Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdType()
	 * @generated
	 * @ordered
	 */
	protected static final String XSD_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getXsdType() <em>Xsd Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdType()
	 * @generated
	 * @ordered
	 */
	protected String xsdType = XSD_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MagicSHACLPackage.Literals.VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.VALUE__ADORNED, oldAdorned,
					adorned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isIdb() {
		ShapesGraph parent = ((Graph) EcoreUtil.getRootContainer(this)).getShapesGraph();
		for (ShapeConstraint c : parent.getShapeConstraints()) {
			if (c.getShapeName().getName().equals(this.name))
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
	public void setIdb(boolean newIdb) {
		boolean oldIdb = idb;
		idb = newIdb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.VALUE__IDB, oldIdb, idb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isDangerous() {
		return dangerous;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.VALUE__DANGEROUS, oldDangerous,
					dangerous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXsdType() {
		return xsdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXsdType(String newXsdType) {
		String oldXsdType = xsdType;
		xsdType = newXsdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.VALUE__XSD_TYPE, oldXsdType,
					xsdType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ShapeName toShapeName() {
		ShapeName shapeName = new ShapeNameImpl();
		shapeName.setName(name);
		shapeName.setAdorned(adorned);
		return shapeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MagicSHACLPackage.VALUE__ADORNED:
			return isAdorned();
		case MagicSHACLPackage.VALUE__IDB:
			return isIdb();
		case MagicSHACLPackage.VALUE__DANGEROUS:
			return isDangerous();
		case MagicSHACLPackage.VALUE__XSD_TYPE:
			return getXsdType();
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
		case MagicSHACLPackage.VALUE__ADORNED:
			setAdorned((Boolean) newValue);
			return;
		case MagicSHACLPackage.VALUE__IDB:
			setIdb((Boolean) newValue);
			return;
		case MagicSHACLPackage.VALUE__DANGEROUS:
			setDangerous((Boolean) newValue);
			return;
		case MagicSHACLPackage.VALUE__XSD_TYPE:
			setXsdType((String) newValue);
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
		case MagicSHACLPackage.VALUE__ADORNED:
			setAdorned(ADORNED_EDEFAULT);
			return;
		case MagicSHACLPackage.VALUE__IDB:
			setIdb(IDB_EDEFAULT);
			return;
		case MagicSHACLPackage.VALUE__DANGEROUS:
			setDangerous(DANGEROUS_EDEFAULT);
			return;
		case MagicSHACLPackage.VALUE__XSD_TYPE:
			setXsdType(XSD_TYPE_EDEFAULT);
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
		case MagicSHACLPackage.VALUE__ADORNED:
			return adorned != ADORNED_EDEFAULT;
		case MagicSHACLPackage.VALUE__IDB:
			return idb != IDB_EDEFAULT;
		case MagicSHACLPackage.VALUE__DANGEROUS:
			return dangerous != DANGEROUS_EDEFAULT;
		case MagicSHACLPackage.VALUE__XSD_TYPE:
			return XSD_TYPE_EDEFAULT == null ? xsdType != null : !XSD_TYPE_EDEFAULT.equals(xsdType);
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
		case MagicSHACLPackage.VALUE___TO_SHAPE_NAME:
			return toShapeName();
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
		result.append(", idb: ");
		result.append(idb);
		result.append(", dangerous: ");
		result.append(dangerous);
		result.append(", xsdType: ");
		result.append(xsdType);
		result.append(')');
		return result.toString();
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

} //ValueImpl
