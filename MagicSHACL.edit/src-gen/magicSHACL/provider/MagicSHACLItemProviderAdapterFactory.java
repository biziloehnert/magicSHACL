/**
 */
package magicSHACL.provider;

import java.util.ArrayList;
import java.util.Collection;

import magicSHACL.util.MagicSHACLAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MagicSHACLItemProviderAdapterFactory extends MagicSHACLAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagicSHACLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.DataGraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataGraphItemProvider dataGraphItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.DataGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataGraphAdapter() {
		if (dataGraphItemProvider == null) {
			dataGraphItemProvider = new DataGraphItemProvider(this);
		}

		return dataGraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.Triples} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriplesItemProvider triplesItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.Triples}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriplesAdapter() {
		if (triplesItemProvider == null) {
			triplesItemProvider = new TriplesItemProvider(this);
		}

		return triplesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.Graph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphItemProvider graphItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.Graph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphAdapter() {
		if (graphItemProvider == null) {
			graphItemProvider = new GraphItemProvider(this);
		}

		return graphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.Namespace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceItemProvider namespaceItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.Namespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamespaceAdapter() {
		if (namespaceItemProvider == null) {
			namespaceItemProvider = new NamespaceItemProvider(this);
		}

		return namespaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.Subject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectItemProvider subjectItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubjectAdapter() {
		if (subjectItemProvider == null) {
			subjectItemProvider = new SubjectItemProvider(this);
		}

		return subjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.Predicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateItemProvider predicateItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.Predicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateAdapter() {
		if (predicateItemProvider == null) {
			predicateItemProvider = new PredicateItemProvider(this);
		}

		return predicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.Object} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectItemProvider objectItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectAdapter() {
		if (objectItemProvider == null) {
			objectItemProvider = new ObjectItemProvider(this);
		}

		return objectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.PredicateObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateObjectItemProvider predicateObjectItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.PredicateObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateObjectAdapter() {
		if (predicateObjectItemProvider == null) {
			predicateObjectItemProvider = new PredicateObjectItemProvider(this);
		}

		return predicateObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.ShapeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeConstraintItemProvider shapeConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.ShapeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShapeConstraintAdapter() {
		if (shapeConstraintItemProvider == null) {
			shapeConstraintItemProvider = new ShapeConstraintItemProvider(this);
		}

		return shapeConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.ShapesGraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapesGraphItemProvider shapesGraphItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.ShapesGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShapesGraphAdapter() {
		if (shapesGraphItemProvider == null) {
			shapesGraphItemProvider = new ShapesGraphItemProvider(this);
		}

		return shapesGraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.ShapeName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeNameItemProvider shapeNameItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.ShapeName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShapeNameAdapter() {
		if (shapeNameItemProvider == null) {
			shapeNameItemProvider = new ShapeNameItemProvider(this);
		}

		return shapeNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.Value} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueItemProvider valueItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueAdapter() {
		if (valueItemProvider == null) {
			valueItemProvider = new ValueItemProvider(this);
		}

		return valueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.PropertyValues} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyValuesItemProvider propertyValuesItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.PropertyValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyValuesAdapter() {
		if (propertyValuesItemProvider == null) {
			propertyValuesItemProvider = new PropertyValuesItemProvider(this);
		}

		return propertyValuesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link magicSHACL.ShapeExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeExpressionItemProvider shapeExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link magicSHACL.ShapeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShapeExpressionAdapter() {
		if (shapeExpressionItemProvider == null) {
			shapeExpressionItemProvider = new ShapeExpressionItemProvider(this);
		}

		return shapeExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (dataGraphItemProvider != null)
			dataGraphItemProvider.dispose();
		if (triplesItemProvider != null)
			triplesItemProvider.dispose();
		if (graphItemProvider != null)
			graphItemProvider.dispose();
		if (namespaceItemProvider != null)
			namespaceItemProvider.dispose();
		if (subjectItemProvider != null)
			subjectItemProvider.dispose();
		if (predicateItemProvider != null)
			predicateItemProvider.dispose();
		if (objectItemProvider != null)
			objectItemProvider.dispose();
		if (predicateObjectItemProvider != null)
			predicateObjectItemProvider.dispose();
		if (shapeConstraintItemProvider != null)
			shapeConstraintItemProvider.dispose();
		if (shapesGraphItemProvider != null)
			shapesGraphItemProvider.dispose();
		if (shapeExpressionItemProvider != null)
			shapeExpressionItemProvider.dispose();
		if (shapeNameItemProvider != null)
			shapeNameItemProvider.dispose();
		if (propertyItemProvider != null)
			propertyItemProvider.dispose();
		if (valueItemProvider != null)
			valueItemProvider.dispose();
		if (propertyValuesItemProvider != null)
			propertyValuesItemProvider.dispose();
	}

}
