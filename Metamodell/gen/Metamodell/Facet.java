/**
 */
package Metamodell;

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
 *   <li>{@link Metamodell.Facet#getNormal <em>Normal</em>}</li>
 *   <li>{@link Metamodell.Facet#getSolid <em>Solid</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.MetamodellPackage#getFacet()
 * @model
 * @generated
 */
public interface Facet extends EObject {
	/**
	 * Returns the value of the '<em><b>Normal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal</em>' containment reference.
	 * @see #setNormal(Vector3f)
	 * @see Metamodell.MetamodellPackage#getFacet_Normal()
	 * @model containment="true"
	 * @generated
	 */
	Vector3f getNormal();

	/**
	 * Sets the value of the '{@link Metamodell.Facet#getNormal <em>Normal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal</em>' containment reference.
	 * @see #getNormal()
	 * @generated
	 */
	void setNormal(Vector3f value);

	/**
	 * Returns the value of the '<em><b>Solid</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Metamodell.Solid#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solid</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solid</em>' container reference.
	 * @see #setSolid(Solid)
	 * @see Metamodell.MetamodellPackage#getFacet_Solid()
	 * @see Metamodell.Solid#getFacets
	 * @model opposite="facets" required="true" transient="false"
	 * @generated
	 */
	Solid getSolid();

	/**
	 * Sets the value of the '{@link Metamodell.Facet#getSolid <em>Solid</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid</em>' container reference.
	 * @see #getSolid()
	 * @generated
	 */
	void setSolid(Solid value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Facet
