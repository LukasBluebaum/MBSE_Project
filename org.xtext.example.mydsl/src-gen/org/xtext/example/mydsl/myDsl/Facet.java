/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Facet#getNormal <em>Normal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Facet#getV1 <em>V1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Facet#getV2 <em>V2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Facet#getV3 <em>V3</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFacet()
 * @model
 * @generated
 */
public interface Facet extends EObject
{
  /**
   * Returns the value of the '<em><b>Normal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Normal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Normal</em>' containment reference.
   * @see #setNormal(Normalvector)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFacet_Normal()
   * @model containment="true"
   * @generated
   */
  Normalvector getNormal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Facet#getNormal <em>Normal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Normal</em>' containment reference.
   * @see #getNormal()
   * @generated
   */
  void setNormal(Normalvector value);

  /**
   * Returns the value of the '<em><b>V1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V1</em>' containment reference.
   * @see #setV1(Vector)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFacet_V1()
   * @model containment="true"
   * @generated
   */
  Vector getV1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Facet#getV1 <em>V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V1</em>' containment reference.
   * @see #getV1()
   * @generated
   */
  void setV1(Vector value);

  /**
   * Returns the value of the '<em><b>V2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V2</em>' containment reference.
   * @see #setV2(Vector)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFacet_V2()
   * @model containment="true"
   * @generated
   */
  Vector getV2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Facet#getV2 <em>V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V2</em>' containment reference.
   * @see #getV2()
   * @generated
   */
  void setV2(Vector value);

  /**
   * Returns the value of the '<em><b>V3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V3</em>' containment reference.
   * @see #setV3(Vector)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFacet_V3()
   * @model containment="true"
   * @generated
   */
  Vector getV3();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Facet#getV3 <em>V3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V3</em>' containment reference.
   * @see #getV3()
   * @generated
   */
  void setV3(Vector value);

} // Facet