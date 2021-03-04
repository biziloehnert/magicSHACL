/**
 */
package magicSHACL.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import magicSHACL.MagicSHACLPackage;
import magicSHACL.Node;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapeExpression;
import magicSHACL.ShapeName;
import magicSHACL.Value;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.impl.ShapeConstraintImpl#getShapeName <em>Shape Name</em>}</li>
 *   <li>{@link magicSHACL.impl.ShapeConstraintImpl#getShapeExpressions <em>Shape Expressions</em>}</li>
 *   <li>{@link magicSHACL.impl.ShapeConstraintImpl#getDangerous <em>Dangerous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeConstraintImpl extends MinimalEObjectImpl.Container implements ShapeConstraint {
	/**
	 * The cached value of the '{@link #getShapeName() <em>Shape Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeName()
	 * @generated
	 * @ordered
	 */
	protected ShapeName shapeName;

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
	 * The default value of the '{@link #getDangerous() <em>Dangerous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDangerous()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DANGEROUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDangerous() <em>Dangerous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDangerous()
	 * @generated
	 * @ordered
	 */
	protected Boolean dangerous = DANGEROUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MagicSHACLPackage.Literals.SHAPE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShapeName getShapeName() {
		return shapeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapeName(ShapeName newShapeName, NotificationChain msgs) {
		ShapeName oldShapeName = shapeName;
		shapeName = newShapeName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_NAME, oldShapeName, newShapeName);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShapeName(ShapeName newShapeName) {
		if (newShapeName != shapeName) {
			NotificationChain msgs = null;
			if (shapeName != null)
				msgs = ((InternalEObject) shapeName).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_NAME, null, msgs);
			if (newShapeName != null)
				msgs = ((InternalEObject) newShapeName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_NAME, null, msgs);
			msgs = basicSetShapeName(newShapeName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_NAME,
					newShapeName, newShapeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ShapeExpression> getShapeExpressions() {
		if (shapeExpressions == null) {
			shapeExpressions = new EObjectContainmentEList<ShapeExpression>(ShapeExpression.class, this,
					MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS);
		}

		ECollections.sort(shapeExpressions, new Comparator<ShapeExpression>() {
			@Override
			public int compare(ShapeExpression arg0, ShapeExpression arg1) {
				return arg0.getType().compareTo(arg1.getType());
			}
		});

		return shapeExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDangerous() {
		if(dangerous == null) {
			dangerous = Boolean.valueOf(shapeName.isDangerous());
			if (dangerous) {
				for (Node node : getAllShapeNamesOfExpression()) {
					if (node instanceof Value) {
						((Value) node).setDangerous(true);
					}
				}
			}
		}
		return dangerous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDangerous(Boolean newDangerous) {
		Boolean oldDangerous = dangerous;
		dangerous = newDangerous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.SHAPE_CONSTRAINT__DANGEROUS,
					oldDangerous, dangerous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isDangerous() {
		dangerous = shapeName.isDangerous();

		if (dangerous) {
			for (Node node : getAllShapeNamesOfExpression()) {
				if (node instanceof Value) {
					((Value) node).setDangerous(true);
				}
			}
		}
		return dangerous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean contains(Node name) {
		for (Node node : getAllShapeNamesOfExpression()) {
			if (node.getName().equals(name.getName()))
				return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getAllShapeNamesOfExpression() {
		EList<Node> shapeNames = new BasicEList<Node>();

		List<EObject> objects = new ArrayList<EObject>();
		eAllContents().forEachRemaining(objects::add);
		for (EObject obj : objects) {
			if (obj instanceof Value && ((Value) obj).isIdb())
				shapeNames.add((Node) obj);
		}
		return shapeNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_NAME:
			return basicSetShapeName(null, msgs);
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS:
			return ((InternalEList<?>) getShapeExpressions()).basicRemove(otherEnd, msgs);
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
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_NAME:
			return getShapeName();
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS:
			return getShapeExpressions();
		case MagicSHACLPackage.SHAPE_CONSTRAINT__DANGEROUS:
			return getDangerous();
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
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_NAME:
			setShapeName((ShapeName) newValue);
			return;
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS:
			getShapeExpressions().clear();
			getShapeExpressions().addAll((Collection<? extends ShapeExpression>) newValue);
			return;
		case MagicSHACLPackage.SHAPE_CONSTRAINT__DANGEROUS:
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
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_NAME:
			setShapeName((ShapeName) null);
			return;
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS:
			getShapeExpressions().clear();
			return;
		case MagicSHACLPackage.SHAPE_CONSTRAINT__DANGEROUS:
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
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_NAME:
			return shapeName != null;
		case MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS:
			return shapeExpressions != null && !shapeExpressions.isEmpty();
		case MagicSHACLPackage.SHAPE_CONSTRAINT__DANGEROUS:
			return DANGEROUS_EDEFAULT == null ? dangerous != null : !DANGEROUS_EDEFAULT.equals(dangerous);
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
		case MagicSHACLPackage.SHAPE_CONSTRAINT___CONTAINS__NODE:
			return contains((Node) arguments.get(0));
		case MagicSHACLPackage.SHAPE_CONSTRAINT___GET_ALL_SHAPE_NAMES_OF_EXPRESSION:
			return getAllShapeNamesOfExpression();
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
		result.append(" (dangerous: ");
		result.append(dangerous);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (!(obj instanceof ShapeConstraint))
			return false;

		ShapeConstraint c = (ShapeConstraint) obj;
		if (!new HashSet<>(c.getShapeExpressions()).equals(new HashSet<>(getShapeExpressions())))
			return false;

		return (this.shapeName.equals(c.getShapeName()));
	}

	@Override
	public int hashCode() {
		return getShapeName().hashCode() * getShapeExpressions().hashCode();
	}

} //ShapeConstraintImpl
