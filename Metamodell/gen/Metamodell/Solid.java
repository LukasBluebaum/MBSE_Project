/**
 */
package Metamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.Solid#getName <em>Name</em>}</li>
 *   <li>{@link Metamodell.Solid#getFacets <em>Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.MetamodellPackage#getSolid()
 * @model
 * @generated
 */
public interface Solid extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Metamodell.MetamodellPackage#getSolid_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Metamodell.Solid#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Facets</b></em>' reference list.
	 * The list contents are of type {@link Metamodell.Facet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facets</em>' reference list.
	 * @see Metamodell.MetamodellPackage#getSolid_Facets()
	 * @model
	 * @generated
	 */
	EList<Facet> getFacets();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Solid
