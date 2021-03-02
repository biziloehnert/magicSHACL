/**
 */
package magicSHACL.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import magicSHACL.MagicSHACLPackage;
import magicSHACL.Node;
import magicSHACL.PropertyType;
import magicSHACL.ShapeConstraint;
import magicSHACL.ShapeExpression;
import magicSHACL.ShapesGraph;

import magicSHACL.Target;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jgrapht.alg.cycle.DirectedSimpleCycles;
import org.jgrapht.alg.cycle.JohnsonSimpleCycles;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

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
 *   <li>{@link magicSHACL.impl.ShapesGraphImpl#getOddCycles <em>Odd Cycles</em>}</li>
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
	 * The cached value of the '{@link #getOddCycles() <em>Odd Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOddCycles()
	 * @generated NOT
	 * @ordered 
	 */
	protected EList<EList<String>> oddCycles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesGraphImpl() {
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
	@Override
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
	@Override
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
	public EList<EList<String>> getOddCycles() {
		if (oddCycles != null)
			return oddCycles;

		oddCycles = new BasicEList<EList<String>>();
		DefaultDirectedGraph<String, DefaultEdge> dependencyGraph = new DefaultDirectedGraph<String, DefaultEdge>(
				DefaultEdge.class);

		for (Node shapeName : getAllShapeNames())
			dependencyGraph.addVertex(shapeName.getName());

		for (ShapeConstraint shapeConstraint : shapeConstraints)
			for (Node shapeName : shapeConstraint.getAllShapeNamesOfExpression())
				dependencyGraph.addEdge(shapeName.getName(), shapeConstraint.getShapeName().getName());

		DirectedSimpleCycles<String, DefaultEdge> simpleCycles = new JohnsonSimpleCycles<String, DefaultEdge>(
				dependencyGraph);

		for (List<String> cycle : simpleCycles.findSimpleCycles()) {
			int marked = 0;
			for (String shapeName : cycle) {
				List<Object> objects = new ArrayList<Object>();
				eAllContents().forEachRemaining(objects::add);
				for (Object obj : objects.stream().filter(obj -> (obj instanceof ShapeExpression))
						.collect(Collectors.toList())) {
					ShapeExpression exp = (ShapeExpression) obj;
					if (exp.getType() == PropertyType.NOT_CONSTRAINT_COMPONENT && exp.contains(shapeName))
						marked++;
				}
			}

			if (marked % 2 == 1)
				oddCycles.add(new BasicEList<String>(cycle));
		}

		return oddCycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOddCycles(EList<EList<String>> newOddCycles) {
		EList<EList<String>> oldOddCycles = oddCycles;
		oddCycles = newOddCycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MagicSHACLPackage.SHAPES_GRAPH__ODD_CYCLES,
					oldOddCycles, oddCycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getAllShapeNames() {
		EList<Node> shapeNames = new BasicEList<Node>();
		for (ShapeConstraint c : getShapeConstraints()) {
			shapeNames.add(c.getShapeName());
			shapeNames.addAll(c.getAllShapeNamesOfExpression());
		}

		return shapeNames;
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
		case MagicSHACLPackage.SHAPES_GRAPH__ODD_CYCLES:
			return getOddCycles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
		case MagicSHACLPackage.SHAPES_GRAPH__ODD_CYCLES:
			setOddCycles((EList<EList<String>>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
		case MagicSHACLPackage.SHAPES_GRAPH__ODD_CYCLES:
			setOddCycles((EList<EList<String>>) null);
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
		case MagicSHACLPackage.SHAPES_GRAPH__ODD_CYCLES:
			return oddCycles != null;
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
		case MagicSHACLPackage.SHAPES_GRAPH___GET_ALL_SHAPE_NAMES:
			return getAllShapeNames();
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
		result.append(" (oddCycles: ");
		result.append(oddCycles);
		result.append(')');
		return result.toString();
	}

} //ShapesGraphImpl
