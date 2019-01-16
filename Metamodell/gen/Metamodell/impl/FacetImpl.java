/**
 */
package Metamodell.impl;

import Metamodell.Area;
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
 *   <li>{@link Metamodell.impl.FacetImpl#getArea <em>Area</em>}</li>
 *   <li>{@link Metamodell.impl.FacetImpl#getX <em>X</em>}</li>
 *   <li>{@link Metamodell.impl.FacetImpl#getY <em>Y</em>}</li>
 *   <li>{@link Metamodell.impl.FacetImpl#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetImpl extends EObjectImpl implements Facet {
	/**
	 * The cached value of the '{@link #getSolid() <em>Solid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolid()
	 * @generated
	 * @ordered
	 */
	protected Solid solid;

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
	 * The cached value of the '{@link #getX() <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Vector3f x;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Vector3f y;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected Vector3f z;

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
		if (solid != null && solid.eIsProxy()) {
			InternalEObject oldSolid = (InternalEObject) solid;
			solid = (Solid) eResolveProxy(oldSolid);
			if (solid != oldSolid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodellPackage.FACET__SOLID, oldSolid,
							solid));
			}
		}
		return solid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solid basicGetSolid() {
		return solid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolid(Solid newSolid) {
		Solid oldSolid = solid;
		solid = newSolid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.FACET__SOLID, oldSolid, solid));
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
	public Area getArea() {
		if (eContainerFeatureID() != MetamodellPackage.FACET__AREA)
			return null;
		return (Area) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(Area newArea, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newArea, MetamodellPackage.FACET__AREA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(Area newArea) {
		if (newArea != eInternalContainer()
				|| (eContainerFeatureID() != MetamodellPackage.FACET__AREA && newArea != null)) {
			if (EcoreUtil.isAncestor(this, newArea))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newArea != null)
				msgs = ((InternalEObject) newArea).eInverseAdd(this, MetamodellPackage.AREA__FACETS, Area.class, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.FACET__AREA, newArea, newArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f getX() {
		if (x != null && x.eIsProxy()) {
			InternalEObject oldX = (InternalEObject) x;
			x = (Vector3f) eResolveProxy(oldX);
			if (x != oldX) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodellPackage.FACET__X, oldX, x));
			}
		}
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f basicGetX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Vector3f newX) {
		Vector3f oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.FACET__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f getY() {
		if (y != null && y.eIsProxy()) {
			InternalEObject oldY = (InternalEObject) y;
			y = (Vector3f) eResolveProxy(oldY);
			if (y != oldY) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodellPackage.FACET__Y, oldY, y));
			}
		}
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f basicGetY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Vector3f newY) {
		Vector3f oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.FACET__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f getZ() {
		if (z != null && z.eIsProxy()) {
			InternalEObject oldZ = (InternalEObject) z;
			z = (Vector3f) eResolveProxy(oldZ);
			if (z != oldZ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodellPackage.FACET__Z, oldZ, z));
			}
		}
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f basicGetZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(Vector3f newZ) {
		Vector3f oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodellPackage.FACET__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodellPackage.FACET__AREA:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetArea((Area) otherEnd, msgs);
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
		case MetamodellPackage.FACET__AREA:
			return basicSetArea(null, msgs);
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
		case MetamodellPackage.FACET__AREA:
			return eInternalContainer().eInverseRemove(this, MetamodellPackage.AREA__FACETS, Area.class, msgs);
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
			if (resolve)
				return getSolid();
			return basicGetSolid();
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
		case MetamodellPackage.FACET__AREA:
			return getArea();
		case MetamodellPackage.FACET__X:
			if (resolve)
				return getX();
			return basicGetX();
		case MetamodellPackage.FACET__Y:
			if (resolve)
				return getY();
			return basicGetY();
		case MetamodellPackage.FACET__Z:
			if (resolve)
				return getZ();
			return basicGetZ();
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
		case MetamodellPackage.FACET__AREA:
			setArea((Area) newValue);
			return;
		case MetamodellPackage.FACET__X:
			setX((Vector3f) newValue);
			return;
		case MetamodellPackage.FACET__Y:
			setY((Vector3f) newValue);
			return;
		case MetamodellPackage.FACET__Z:
			setZ((Vector3f) newValue);
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
		case MetamodellPackage.FACET__AREA:
			setArea((Area) null);
			return;
		case MetamodellPackage.FACET__X:
			setX((Vector3f) null);
			return;
		case MetamodellPackage.FACET__Y:
			setY((Vector3f) null);
			return;
		case MetamodellPackage.FACET__Z:
			setZ((Vector3f) null);
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
			return solid != null;
		case MetamodellPackage.FACET__NORMAL:
			return normal != null;
		case MetamodellPackage.FACET__EDGES:
			return edges != null && !edges.isEmpty();
		case MetamodellPackage.FACET__COLOR:
			return color != null;
		case MetamodellPackage.FACET__AREA:
			return getArea() != null;
		case MetamodellPackage.FACET__X:
			return x != null;
		case MetamodellPackage.FACET__Y:
			return y != null;
		case MetamodellPackage.FACET__Z:
			return z != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FacetImpl
