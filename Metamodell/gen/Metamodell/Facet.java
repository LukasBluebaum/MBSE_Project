/**
 */
package Metamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.Facet#getSolid <em>Solid</em>}</li>
 *   <li>{@link Metamodell.Facet#getNormal <em>Normal</em>}</li>
 *   <li>{@link Metamodell.Facet#getEdges <em>Edges</em>}</li>
 *   <li>{@link Metamodell.Facet#getColor <em>Color</em>}</li>
 *   <li>{@link Metamodell.Facet#getArea <em>Area</em>}</li>
 *   <li>{@link Metamodell.Facet#getX <em>X</em>}</li>
 *   <li>{@link Metamodell.Facet#getY <em>Y</em>}</li>
 *   <li>{@link Metamodell.Facet#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.MetamodellPackage#getFacet()
 * @model
 * @generated
 */
public interface Facet extends EObject {
	/**
	 * Returns the value of the '<em><b>Solid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solid</em>' reference.
	 * @see #setSolid(Solid)
	 * @see Metamodell.MetamodellPackage#getFacet_Solid()
	 * @model
	 * @generated
	 */
	Solid getSolid();

	/**
	 * Sets the value of the '{@link Metamodell.Facet#getSolid <em>Solid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid</em>' reference.
	 * @see #getSolid()
	 * @generated
	 */
	void setSolid(Solid value);

	/**
	 * Returns the value of the '<em><b>Normal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal</em>' reference.
	 * @see #setNormal(Vector3f)
	 * @see Metamodell.MetamodellPackage#getFacet_Normal()
	 * @model
	 * @generated
	 */
	Vector3f getNormal();

	/**
	 * Sets the value of the '{@link Metamodell.Facet#getNormal <em>Normal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal</em>' reference.
	 * @see #getNormal()
	 * @generated
	 */
	void setNormal(Vector3f value);

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link Metamodell.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see Metamodell.MetamodellPackage#getFacet_Edges()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' reference.
	 * @see #setColor(Color)
	 * @see Metamodell.MetamodellPackage#getFacet_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link Metamodell.Facet#getColor <em>Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Metamodell.Area#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' container reference.
	 * @see #setArea(Area)
	 * @see Metamodell.MetamodellPackage#getFacet_Area()
	 * @see Metamodell.Area#getFacets
	 * @model opposite="facets" transient="false"
	 * @generated
	 */
	Area getArea();

	/**
	 * Sets the value of the '{@link Metamodell.Facet#getArea <em>Area</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' container reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(Area value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' reference.
	 * @see #setX(Vector3f)
	 * @see Metamodell.MetamodellPackage#getFacet_X()
	 * @model
	 * @generated
	 */
	Vector3f getX();

	/**
	 * Sets the value of the '{@link Metamodell.Facet#getX <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Vector3f value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' reference.
	 * @see #setY(Vector3f)
	 * @see Metamodell.MetamodellPackage#getFacet_Y()
	 * @model
	 * @generated
	 */
	Vector3f getY();

	/**
	 * Sets the value of the '{@link Metamodell.Facet#getY <em>Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(Vector3f value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' reference.
	 * @see #setZ(Vector3f)
	 * @see Metamodell.MetamodellPackage#getFacet_Z()
	 * @model
	 * @generated
	 */
	Vector3f getZ();

	/**
	 * Sets the value of the '{@link Metamodell.Facet#getZ <em>Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(Vector3f value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Facet
