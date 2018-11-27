/**
 */
package Metamodell.impl;

import Metamodell.Color;
import Metamodell.Edge;
import Metamodell.Facet;
import Metamodell.MetamodellPackage;
import Metamodell.Solid;
import Metamodell.Vector3f;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link Metamodell.impl.FacetImpl#getSolid <em>Solid</em>}</li>
 *   <li>{@link Metamodell.impl.FacetImpl#getNormal <em>Normal</em>}</li>
 *   <li>{@link Metamodell.impl.FacetImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link Metamodell.impl.FacetImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetImpl extends EObjectImpl implements Facet {
	/**
	 * The cached value of the '{@link #getNormal() <em>Normal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal()
	 * @generated
	 * @ordered
	 */
	protected Vector3f normal;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color;

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
	public Vector3f getNormal() {
		if (normal != null && normal.eIsProxy()) {
			InternalEObject oldNormal = (InternalEObject) normal;
			normal = (Vector3f) eResolveProxy(oldNormal);
			if (normal != oldNormal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodellPackage.FACET__NORMAL,
							oldNormal, normal));
			}
		}
		return normal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f basicGetNormal() {
		return normal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormal(Vector3f newNormal) {
		Vector3f oldNormal = normal;
		normal = newNormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.FACET__NORMAL, oldNormal, normal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectResolvingEList<Edge>(Edge.class, this, MetamodellPackage.FACET__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		if (color != null && color.eIsProxy()) {
			InternalEObject oldColor = (InternalEObject) color;
			color = (Color) eResolveProxy(oldColor);
			if (color != oldColor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodellPackage.FACET__COLOR, oldColor,
							color));
			}
		}
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color basicGetColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.FACET__COLOR, oldColor, color));
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
		case MetamodellPackage.FACET__SOLID:
			return getSolid();
		case MetamodellPackage.FACET__NORMAL:
			if (resolve)
				return getNormal();
			return basicGetNormal();
		case MetamodellPackage.FACET__EDGES:
			return getEdges();
		case MetamodellPackage.FACET__COLOR:
			if (resolve)
				return getColor();
			return basicGetColor();
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
		case MetamodellPackage.FACET__SOLID:
			setSolid((Solid) newValue);
			return;
		case MetamodellPackage.FACET__NORMAL:
			setNormal((Vector3f) newValue);
			return;
		case MetamodellPackage.FACET__EDGES:
			getEdges().clear();
			getEdges().addAll((Collection<? extends Edge>) newValue);
			return;
		case MetamodellPackage.FACET__COLOR:
			setColor((Color) newValue);
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
		case MetamodellPackage.FACET__SOLID:
			setSolid((Solid) null);
			return;
		case MetamodellPackage.FACET__NORMAL:
			setNormal((Vector3f) null);
			return;
		case MetamodellPackage.FACET__EDGES:
			getEdges().clear();
			return;
		case MetamodellPackage.FACET__COLOR:
			setColor((Color) null);
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
		case MetamodellPackage.FACET__SOLID:
			return getSolid() != null;
		case MetamodellPackage.FACET__NORMAL:
			return normal != null;
		case MetamodellPackage.FACET__EDGES:
			return edges != null && !edges.isEmpty();
		case MetamodellPackage.FACET__COLOR:
			return color != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FacetImpl
