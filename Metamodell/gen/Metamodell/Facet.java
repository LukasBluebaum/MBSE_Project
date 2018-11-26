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
 *   <li>{@link Metamodell.Facet#getNormal <em>Normal</em>}</li>
 *   <li>{@link Metamodell.Facet#getEdges <em>Edges</em>}</li>
 *   <li>{@link Metamodell.Facet#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.MetamodellPackage#getFacet()
 * @model
 * @generated
 */
public interface Facet extends EObject {
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
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Facet
