/**
 */
package magicSHACL.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;

import magicSHACL.MagicSHACLPackage;
import magicSHACL.PropertyType;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapeExpression;
import magicSHACL.Value;

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
 *   <li>{@link magicSHACL.impl.ShapeExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link magicSHACL.impl.ShapeExpressionImpl#getShapeExpressions <em>Shape Expressions</em>}</li>
 *   <li>{@link magicSHACL.impl.ShapeExpressionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link magicSHACL.impl.ShapeExpressionImpl#getAbstractString <em>Abstract String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeExpressionImpl extends MinimalEObjectImpl.Container implements ShapeExpression {
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
	 * The cached value of the '{@link #getShapeExpressions() <em>Shape Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ShapeExpression> shapeExpressions;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;

	/**
	 * The default value of the '{@link #getAbstractString() <em>Abstract String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractString()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAbstractString() <em>Abstract String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractString()
	 * @generated
	 * @ordered
	 */
	protected String abstractString = ABSTRACT_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeExpressionImpl() {
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
	@Override
	public PropertyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public EList<ShapeExpression> getShapeExpressions() {
		if (shapeExpressions == null) {
			shapeExpressions = new EObjectContainmentEList<ShapeExpression>(ShapeExpression.class, this,
					MagicSHACLPackage.SHAPE_EXPRESSION__SHAPE_EXPRESSIONS);
		}
		return shapeExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<Value>(Value.class, this, MagicSHACLPackage.SHAPE_EXPRESSION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getAbstractString() {
		String s = "";

		switch (type) {
		case PROPERTY:
		case AND_CONSTRAINT_COMPONENT:
			s += (eContainer instanceof ShapeConstraint) ? "AND " : "";
			break;
		case OR_CONSTRAINT_COMPONENT:
			s += "OR ";
			break;
		case NOT_CONSTRAINT_COMPONENT:
			s += "NOT ";
			break;
		case PREDICATE_PATH:
			s += "SOME ";
			break;
		case INVERSE_PATH:
			s += "^";
			break;
		case MAX_COUNT_CONSTRAINT_COMPONENT:
			s += "MAX ";
			break;
		case MIN_COUNT_CONSTRAINT_COMPONENT:
			s += "MIN ";
			break;
		case CLASS_CONSTRAINT_COMPONENT:
			s += "";
			break;
		default:
			return "";
		}

		for (Value value : getValues())
			s += value.getName() + " ";

		for (ShapeExpression shapeExpression : getShapeExpressions())
			s += shapeExpression.getAbstractString();

		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractString(String newAbstractString) {
		String oldAbstractString = abstractString;
		abstractString = newAbstractString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.SHAPE_EXPRESSION__ABSTRACT_STRING,
					oldAbstractString, abstractString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean contains(String name) {
		for (Value v : getValues())
			if (name.equals(v.getName()))
				return true;

		for (ShapeExpression shapeExpression : getShapeExpressions()) {
			return shapeExpression.contains(name);
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
		case MagicSHACLPackage.SHAPE_EXPRESSION__SHAPE_EXPRESSIONS:
			return ((InternalEList<?>) getShapeExpressions()).basicRemove(otherEnd, msgs);
		case MagicSHACLPackage.SHAPE_EXPRESSION__VALUES:
			return ((InternalEList<?>) getValues()).basicRemove(otherEnd, msgs);
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
		case MagicSHACLPackage.SHAPE_EXPRESSION__TYPE:
			return getType();
		case MagicSHACLPackage.SHAPE_EXPRESSION__SHAPE_EXPRESSIONS:
			return getShapeExpressions();
		case MagicSHACLPackage.SHAPE_EXPRESSION__VALUES:
			return getValues();
		case MagicSHACLPackage.SHAPE_EXPRESSION__ABSTRACT_STRING:
			return getAbstractString();
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
		case MagicSHACLPackage.SHAPE_EXPRESSION__TYPE:
			setType((PropertyType) newValue);
			return;
		case MagicSHACLPackage.SHAPE_EXPRESSION__SHAPE_EXPRESSIONS:
			getShapeExpressions().clear();
			getShapeExpressions().addAll((Collection<? extends ShapeExpression>) newValue);
			return;
		case MagicSHACLPackage.SHAPE_EXPRESSION__VALUES:
			getValues().clear();
			getValues().addAll((Collection<? extends Value>) newValue);
			return;
		case MagicSHACLPackage.SHAPE_EXPRESSION__ABSTRACT_STRING:
			setAbstractString((String) newValue);
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
		case MagicSHACLPackage.SHAPE_EXPRESSION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MagicSHACLPackage.SHAPE_EXPRESSION__SHAPE_EXPRESSIONS:
			getShapeExpressions().clear();
			return;
		case MagicSHACLPackage.SHAPE_EXPRESSION__VALUES:
			getValues().clear();
			return;
		case MagicSHACLPackage.SHAPE_EXPRESSION__ABSTRACT_STRING:
			setAbstractString(ABSTRACT_STRING_EDEFAULT);
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
		case MagicSHACLPackage.SHAPE_EXPRESSION__TYPE:
			return type != TYPE_EDEFAULT;
		case MagicSHACLPackage.SHAPE_EXPRESSION__SHAPE_EXPRESSIONS:
			return shapeExpressions != null && !shapeExpressions.isEmpty();
		case MagicSHACLPackage.SHAPE_EXPRESSION__VALUES:
			return values != null && !values.isEmpty();
		case MagicSHACLPackage.SHAPE_EXPRESSION__ABSTRACT_STRING:
			return ABSTRACT_STRING_EDEFAULT == null ? abstractString != null
					: !ABSTRACT_STRING_EDEFAULT.equals(abstractString);
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
		case MagicSHACLPackage.SHAPE_EXPRESSION___CONTAINS__STRING:
			return contains((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (type == PropertyType.PREDICATE_PATH || type == PropertyType.MAX_COUNT_CONSTRAINT_COMPONENT
				|| type == PropertyType.MIN_COUNT_CONSTRAINT_COMPONENT || type == PropertyType.NOT_CONSTRAINT_COMPONENT)
			return getAbstractString();
		else if (type == PropertyType.INVERSE_PATH)
			return "SOME " + getAbstractString();
		else if (type == PropertyType.OR_CONSTRAINT_COMPONENT && values.size() > 0) {
			String s = values.get(0).getName();
			for (Value v : values.subList(1, values.size())) {
				s += " OR " + v.getName();
			}
			return s;
		} else if (values.size() > 0) {
			String s = values.get(0).getName();
			for (Value v : values.subList(1, values.size())) {
				s += " AND " + v.getName();
			}
			return s;
		}

		return "";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (!(obj instanceof ShapeExpression))
			return false;

		ShapeExpression exp = (ShapeExpression) obj;
		if (!new HashSet<>(exp.getValues()).equals(new HashSet<>(getValues())))
			return false;

		if (!new HashSet<>(exp.getShapeExpressions()).equals(new HashSet<>(getShapeExpressions())))
			return false;

		return exp.getType().equals(getType());
	}

	@Override
	public int hashCode() {
		return getValues().hashCode() * getShapeExpressions().hashCode() * getType().hashCode();
	}

} //ShapeExpressionImpl
