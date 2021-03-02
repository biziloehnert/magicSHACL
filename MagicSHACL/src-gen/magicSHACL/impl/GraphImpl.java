/**
 */
package magicSHACL.impl;

import java.util.Collection;

import magicSHACL.DataGraph;
import magicSHACL.Graph;
import magicSHACL.MagicSHACLPackage;
import magicSHACL.Namespace;
import magicSHACL.ShapesGraph;

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
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link magicSHACL.impl.GraphImpl#getDataGraph <em>Data Graph</em>}</li>
 *   <li>{@link magicSHACL.impl.GraphImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link magicSHACL.impl.GraphImpl#getShapesGraph <em>Shapes Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
	/**
	 * The cached value of the '{@link #getDataGraph() <em>Data Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataGraph()
	 * @generated
	 * @ordered
	 */
	protected DataGraph dataGraph;

	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespaces;

	/**
	 * The cached value of the '{@link #getShapesGraph() <em>Shapes Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapesGraph()
	 * @generated
	 * @ordered
	 */
	protected ShapesGraph shapesGraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MagicSHACLPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataGraph getDataGraph() {
		return dataGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataGraph(DataGraph newDataGraph, NotificationChain msgs) {
		DataGraph oldDataGraph = dataGraph;
		dataGraph = newDataGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MagicSHACLPackage.GRAPH__DATA_GRAPH, oldDataGraph, newDataGraph);
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
	public void setDataGraph(DataGraph newDataGraph) {
		if (newDataGraph != dataGraph) {
			NotificationChain msgs = null;
			if (dataGraph != null)
				msgs = ((InternalEObject) dataGraph).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MagicSHACLPackage.GRAPH__DATA_GRAPH, null, msgs);
			if (newDataGraph != null)
				msgs = ((InternalEObject) newDataGraph).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MagicSHACLPackage.GRAPH__DATA_GRAPH, null, msgs);
			msgs = basicSetDataGraph(newDataGraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.GRAPH__DATA_GRAPH, newDataGraph,
					newDataGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Namespace> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EObjectContainmentEList<Namespace>(Namespace.class, this,
					MagicSHACLPackage.GRAPH__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShapesGraph getShapesGraph() {
		return shapesGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapesGraph(ShapesGraph newShapesGraph, NotificationChain msgs) {
		ShapesGraph oldShapesGraph = shapesGraph;
		shapesGraph = newShapesGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MagicSHACLPackage.GRAPH__SHAPES_GRAPH, oldShapesGraph, newShapesGraph);
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
	public void setShapesGraph(ShapesGraph newShapesGraph) {
		if (newShapesGraph != shapesGraph) {
			NotificationChain msgs = null;
			if (shapesGraph != null)
				msgs = ((InternalEObject) shapesGraph).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MagicSHACLPackage.GRAPH__SHAPES_GRAPH, null, msgs);
			if (newShapesGraph != null)
				msgs = ((InternalEObject) newShapesGraph).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MagicSHACLPackage.GRAPH__SHAPES_GRAPH, null, msgs);
			msgs = basicSetShapesGraph(newShapesGraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.GRAPH__SHAPES_GRAPH, newShapesGraph,
					newShapesGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MagicSHACLPackage.GRAPH__DATA_GRAPH:
			return basicSetDataGraph(null, msgs);
		case MagicSHACLPackage.GRAPH__NAMESPACES:
			return ((InternalEList<?>) getNamespaces()).basicRemove(otherEnd, msgs);
		case MagicSHACLPackage.GRAPH__SHAPES_GRAPH:
			return basicSetShapesGraph(null, msgs);
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
		case MagicSHACLPackage.GRAPH__DATA_GRAPH:
			return getDataGraph();
		case MagicSHACLPackage.GRAPH__NAMESPACES:
			return getNamespaces();
		case MagicSHACLPackage.GRAPH__SHAPES_GRAPH:
			return getShapesGraph();
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
		case MagicSHACLPackage.GRAPH__DATA_GRAPH:
			setDataGraph((DataGraph) newValue);
			return;
		case MagicSHACLPackage.GRAPH__NAMESPACES:
			getNamespaces().clear();
			getNamespaces().addAll((Collection<? extends Namespace>) newValue);
			return;
		case MagicSHACLPackage.GRAPH__SHAPES_GRAPH:
			setShapesGraph((ShapesGraph) newValue);
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
		case MagicSHACLPackage.GRAPH__DATA_GRAPH:
			setDataGraph((DataGraph) null);
			return;
		case MagicSHACLPackage.GRAPH__NAMESPACES:
			getNamespaces().clear();
			return;
		case MagicSHACLPackage.GRAPH__SHAPES_GRAPH:
			setShapesGraph((ShapesGraph) null);
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
		case MagicSHACLPackage.GRAPH__DATA_GRAPH:
			return dataGraph != null;
		case MagicSHACLPackage.GRAPH__NAMESPACES:
			return namespaces != null && !namespaces.isEmpty();
		case MagicSHACLPackage.GRAPH__SHAPES_GRAPH:
			return shapesGraph != null;
		}
		return super.eIsSet(featureID);
	}

} //GraphImpl
