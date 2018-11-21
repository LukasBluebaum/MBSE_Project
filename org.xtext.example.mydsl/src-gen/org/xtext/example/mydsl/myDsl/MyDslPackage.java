/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SolidImpl <em>Solid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SolidImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSolid()
   * @generated
   */
  int SOLID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLID__NAME = 0;

  /**
   * The feature id for the '<em><b>Facets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLID__FACETS = 1;

  /**
   * The number of structural features of the '<em>Solid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOLID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FacetImpl <em>Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FacetImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFacet()
   * @generated
   */
  int FACET = 1;

  /**
   * The feature id for the '<em><b>Normal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__NORMAL = 0;

  /**
   * The number of structural features of the '<em>Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VectorImpl <em>Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VectorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVector()
   * @generated
   */
  int VECTOR = 2;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__Y = 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__Z = 2;

  /**
   * The number of structural features of the '<em>Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Solid <em>Solid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Solid</em>'.
   * @see org.xtext.example.mydsl.myDsl.Solid
   * @generated
   */
  EClass getSolid();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Solid#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Solid#getName()
   * @see #getSolid()
   * @generated
   */
  EAttribute getSolid_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Solid#getFacets <em>Facets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Facets</em>'.
   * @see org.xtext.example.mydsl.myDsl.Solid#getFacets()
   * @see #getSolid()
   * @generated
   */
  EReference getSolid_Facets();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Facet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet</em>'.
   * @see org.xtext.example.mydsl.myDsl.Facet
   * @generated
   */
  EClass getFacet();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Facet#getNormal <em>Normal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Normal</em>'.
   * @see org.xtext.example.mydsl.myDsl.Facet#getNormal()
   * @see #getFacet()
   * @generated
   */
  EReference getFacet_Normal();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Vector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector</em>'.
   * @see org.xtext.example.mydsl.myDsl.Vector
   * @generated
   */
  EClass getVector();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Vector#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.example.mydsl.myDsl.Vector#getX()
   * @see #getVector()
   * @generated
   */
  EAttribute getVector_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Vector#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.example.mydsl.myDsl.Vector#getY()
   * @see #getVector()
   * @generated
   */
  EAttribute getVector_Y();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Vector#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see org.xtext.example.mydsl.myDsl.Vector#getZ()
   * @see #getVector()
   * @generated
   */
  EAttribute getVector_Z();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SolidImpl <em>Solid</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SolidImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSolid()
     * @generated
     */
    EClass SOLID = eINSTANCE.getSolid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOLID__NAME = eINSTANCE.getSolid_Name();

    /**
     * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOLID__FACETS = eINSTANCE.getSolid_Facets();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FacetImpl <em>Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FacetImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFacet()
     * @generated
     */
    EClass FACET = eINSTANCE.getFacet();

    /**
     * The meta object literal for the '<em><b>Normal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET__NORMAL = eINSTANCE.getFacet_Normal();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VectorImpl <em>Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VectorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVector()
     * @generated
     */
    EClass VECTOR = eINSTANCE.getVector();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR__X = eINSTANCE.getVector_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR__Y = eINSTANCE.getVector_Y();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR__Z = eINSTANCE.getVector_Z();

  }

} //MyDslPackage
