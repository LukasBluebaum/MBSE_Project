/**
 */
package Metamodell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Metamodell.Edge#getA <em>A</em>}</li>
 *   <li>{@link Metamodell.Edge#getB <em>B</em>}</li>
 *   <li>{@link Metamodell.Edge#getF <em>F</em>}</li>
 * </ul>
 * </p>
 *
 * @see Metamodell.MetamodellPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference.
	 * @see #setA(Vector3f)
	 * @see Metamodell.MetamodellPackage#getEdge_A()
	 * @model
	 * @generated
	 */
	Vector3f getA();

	/**
	 * Sets the value of the '{@link Metamodell.Edge#getA <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(Vector3f value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference.
	 * @see #setB(Vector3f)
	 * @see Metamodell.MetamodellPackage#getEdge_B()
	 * @model
	 * @generated
	 */
	Vector3f getB();

	/**
	 * Sets the value of the '{@link Metamodell.Edge#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(Vector3f value);

	/**
	 * Returns the value of the '<em><b>F</b></em>' reference list.
	 * The list contents are of type {@link Metamodell.Facet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>F</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F</em>' reference list.
	 * @see Metamodell.MetamodellPackage#getEdge_F()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Facet> getF();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Edge
