/**
 */
package Metamodell.impl;

import Metamodell.Facet;
import Metamodell.MetamodellPackage;
import Metamodell.Solid;
import Metamodell.Vector3f;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Metamodell.impl.FacetImpl#getNormal <em>Normal</em>}</li>
 *   <li>{@link Metamodell.impl.FacetImpl#getSolid <em>Solid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetImpl extends EObjectImpl implements Facet {
	/**
	 * The cached value of the '{@link #getNormal() <em>Normal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal()
	 * @generated
	 * @ordered
	 */
	protected Vector3f normal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodellPackage.Literals.FACET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f getNormal() {
		return normal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormal(Vector3f newNormal, NotificationChain msgs) {
		Vector3f oldNormal = normal;
		normal = newNormal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodellPackage.FACET__NORMAL, oldNormal, newNormal);
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
	public void setNormal(Vector3f newNormal) {
		if (newNormal != normal) {
			NotificationChain msgs = null;
			if (normal != null)
				msgs = ((InternalEObject) normal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodellPackage.FACET__NORMAL, null, msgs);
			if (newNormal != null)
				msgs = ((InternalEObject) newNormal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodellPackage.FACET__NORMAL, null, msgs);
			msgs = basicSetNormal(newNormal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.FACET__NORMAL, newNormal,
					newNormal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solid getSolid() {
		if (eContainerFeatureID() != MetamodellPackage.FACET__SOLID)
			return null;
		return (Solid) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolid(Solid newSolid, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSolid, MetamodellPackage.FACET__SOLID, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolid(Solid newSolid) {
		if (newSolid != eInternalContainer()
				|| (eContainerFeatureID() != MetamodellPackage.FACET__SOLID && newSolid != null)) {
			if (EcoreUtil.isAncestor(this, newSolid))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSolid != null)
				msgs = ((InternalEObject) newSolid).eInverseAdd(this, MetamodellPackage.SOLID__FACETS, Solid.class,
						msgs);
			msgs = basicSetSolid(newSolid, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.FACET__SOLID, newSolid, newSolid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodellPackage.FACET__SOLID:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSolid((Solid) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodellPackage.FACET__NORMAL:
			return basicSetNormal(null, msgs);
		case MetamodellPackage.FACET__SOLID:
			return basicSetSolid(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case MetamodellPackage.FACET__SOLID:
			return eInternalContainer().eInverseRemove(this, MetamodellPackage.SOLID__FACETS, Solid.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodellPackage.FACET__NORMAL:
			return getNormal();
		case MetamodellPackage.FACET__SOLID:
			return getSolid();
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
		case MetamodellPackage.FACET__NORMAL:
			setNormal((Vector3f) newValue);
			return;
		case MetamodellPackage.FACET__SOLID:
			setSolid((Solid) newValue);
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
		case MetamodellPackage.FACET__NORMAL:
			setNormal((Vector3f) null);
			return;
		case MetamodellPackage.FACET__SOLID:
			setSolid((Solid) null);
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
		case MetamodellPackage.FACET__NORMAL:
			return normal != null;
		case MetamodellPackage.FACET__SOLID:
			return getSolid() != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FacetImpl
