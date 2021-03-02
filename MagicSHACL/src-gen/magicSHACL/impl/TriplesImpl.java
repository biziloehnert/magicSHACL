/**
 */
package magicSHACL.impl;

import java.util.Collection;

import magicSHACL.MagicSHACLPackage;
import magicSHACL.PredicateObject;
import magicSHACL.Subject;
import magicSHACL.Triples;

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
 * An implementation of the model object '<em><b>Triples</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.impl.TriplesImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link magicSHACL.impl.TriplesImpl#getPredicateobject <em>Predicateobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriplesImpl extends MinimalEObjectImpl.Container implements Triples {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Subject subject;

	/**
	 * The cached value of the '{@link #getPredicateobject() <em>Predicateobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicateobject()
	 * @generated
	 * @ordered
	 */
	protected EList<PredicateObject> predicateobject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriplesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MagicSHACLPackage.Literals.TRIPLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subject getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Subject newSubject, NotificationChain msgs) {
		Subject oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MagicSHACLPackage.TRIPLES__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Subject newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject) subject).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MagicSHACLPackage.TRIPLES__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject) newSubject).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MagicSHACLPackage.TRIPLES__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.TRIPLES__SUBJECT, newSubject,
					newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PredicateObject> getPredicateobject() {
		if (predicateobject == null) {
			predicateobject = new EObjectContainmentEList<PredicateObject>(PredicateObject.class, this,
					MagicSHACLPackage.TRIPLES__PREDICATEOBJECT);
		}
		return predicateobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MagicSHACLPackage.TRIPLES__SUBJECT:
			return basicSetSubject(null, msgs);
		case MagicSHACLPackage.TRIPLES__PREDICATEOBJECT:
			return ((InternalEList<?>) getPredicateobject()).basicRemove(otherEnd, msgs);
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
		case MagicSHACLPackage.TRIPLES__SUBJECT:
			return getSubject();
		case MagicSHACLPackage.TRIPLES__PREDICATEOBJECT:
			return getPredicateobject();
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
		case MagicSHACLPackage.TRIPLES__SUBJECT:
			setSubject((Subject) newValue);
			return;
		case MagicSHACLPackage.TRIPLES__PREDICATEOBJECT:
			getPredicateobject().clear();
			getPredicateobject().addAll((Collection<? extends PredicateObject>) newValue);
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
		case MagicSHACLPackage.TRIPLES__SUBJECT:
			setSubject((Subject) null);
			return;
		case MagicSHACLPackage.TRIPLES__PREDICATEOBJECT:
			getPredicateobject().clear();
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
		case MagicSHACLPackage.TRIPLES__SUBJECT:
			return subject != null;
		case MagicSHACLPackage.TRIPLES__PREDICATEOBJECT:
			return predicateobject != null && !predicateobject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TriplesImpl
