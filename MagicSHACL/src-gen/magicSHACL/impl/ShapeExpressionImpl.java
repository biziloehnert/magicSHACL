/**
 */
package magicSHACL.impl;

import java.util.Collection;

import magicSHACL.MagicSHACLPackage;
import magicSHACL.PropertyType;
import magicSHACL.PropertyValues;
import magicSHACL.ShapeExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.impl.ShapeExpressionImpl#getPropertyValues <em>Property Values</em>}</li>
 *   <li>{@link magicSHACL.impl.ShapeExpressionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeExpressionImpl extends MinimalEObjectImpl.Container implements ShapeExpression {
	/**
	 * The cached value of the '{@link #getPropertyValues() <em>Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValues> propertyValues;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyType TYPE_EDEFAULT = PropertyType.CLASS_CONSTRAINT_COMPONENT;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PropertyType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MagicSHACLPackage.Literals.SHAPE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValues> getPropertyValues() {
		if (propertyValues == null) {
			propertyValues = new EObjectContainmentEList<PropertyValues>(PropertyValues.class, this,
					MagicSHACLPackage.SHAPE_EXPRESSION__PROPERTY_VALUES);
		}
		return propertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PropertyType newType) {
		PropertyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.SHAPE_EXPRESSION__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MagicSHACLPackage.SHAPE_EXPRESSION__PROPERTY_VALUES:
			return ((InternalEList<?>) getPropertyValues()).basicRemove(otherEnd, msgs);
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
		case MagicSHACLPackage.SHAPE_EXPRESSION__PROPERTY_VALUES:
			return getPropertyValues();
		case MagicSHACLPackage.SHAPE_EXPRESSION__TYPE:
			return getType();
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
		case MagicSHACLPackage.SHAPE_EXPRESSION__PROPERTY_VALUES:
			getPropertyValues().clear();
			getPropertyValues().addAll((Collection<? extends PropertyValues>) newValue);
			return;
		case MagicSHACLPackage.SHAPE_EXPRESSION__TYPE:
			setType((PropertyType) newValue);
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
		case MagicSHACLPackage.SHAPE_EXPRESSION__PROPERTY_VALUES:
			getPropertyValues().clear();
			return;
		case MagicSHACLPackage.SHAPE_EXPRESSION__TYPE:
			setType(TYPE_EDEFAULT);
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
		case MagicSHACLPackage.SHAPE_EXPRESSION__PROPERTY_VALUES:
			return propertyValues != null && !propertyValues.isEmpty();
		case MagicSHACLPackage.SHAPE_EXPRESSION__TYPE:
			return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ShapeExpressionImpl
