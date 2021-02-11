/**
 */
package magicSHACL.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import magicSHACL.MagicSHACLPackage;
import magicSHACL.PropertyValues;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapeExpression;
import magicSHACL.ShapeName;
import magicSHACL.ShapesGraph;
import magicSHACL.Value;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeConstraintImpl() {
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
	 * @generated
	 */
	public EList<ShapeExpression> getShapeExpressions() {
		if (shapeExpressions == null) {
			shapeExpressions = new EObjectContainmentEList<ShapeExpression>(ShapeExpression.class, this,
					MagicSHACLPackage.SHAPE_CONSTRAINT__SHAPE_EXPRESSIONS);
		}
		return shapeExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ShapeName> adorn() {
		ShapesGraph shapesGraph = (ShapesGraph) eContainer;
		EList<ShapeName> adornedShapes = new BasicEList<ShapeName>();

		TreeIterator<EObject> it = this.eAllContents();
		while (it.hasNext()) {
			EObject content = it.next();
			if (content instanceof Value && shapesGraph.isShapeName(((Value) content).getName())) {
				((Value) content).setAdorned(true);
				ShapeName s = new ShapeNameImpl();
				s.setName(((Value) content).getName());
				s.setAdorned(true);
				adornedShapes.add(s);
			}
		}
		return adornedShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ShapeConstraint generate(Value adornedShape) {
		ShapeConstraint magicShapeConstraint = new ShapeConstraintImpl();
		magicShapeConstraint.setShapeName(adornedShape.toShapeName().getMagicShapeName());

		ShapeExpression magicShapeExpression = new ShapeExpressionImpl();
		magicShapeExpression.getPropertyValues()
				.add(((PropertyValues) adornedShape.eContainer()).getMagicPropertyValues(shapeName.getName()));

		magicShapeConstraint.getShapeExpressions().add(magicShapeExpression);

		return magicShapeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeAdornments() {
		this.shapeName.setAdorned(false);
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
		case MagicSHACLPackage.SHAPE_CONSTRAINT___ADORN:
			return adorn();
		case MagicSHACLPackage.SHAPE_CONSTRAINT___GENERATE__VALUE:
			return generate((Value) arguments.get(0));
		case MagicSHACLPackage.SHAPE_CONSTRAINT___REMOVE_ADORNMENTS:
			removeAdornments();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ShapeConstraintImpl
