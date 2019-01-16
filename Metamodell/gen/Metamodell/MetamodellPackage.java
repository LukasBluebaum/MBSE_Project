/**
 */
package Metamodell;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * TODO: Add documentation for Blup
 * <!-- end-model-doc -->
 * @see Metamodell.MetamodellFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodellPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Metamodell";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Metamodell/model/Metamodell.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Metamodell";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodellPackage eINSTANCE = Metamodell.impl.MetamodellPackageImpl.init();

	/**
	 * The meta object id for the '{@link Metamodell.impl.Vector3fImpl <em>Vector3f</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.impl.Vector3fImpl
	 * @see Metamodell.impl.MetamodellPackageImpl#getVector3f()
	 * @generated
	 */
	int VECTOR3F = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F__Z = 2;

	/**
	 * The number of structural features of the '<em>Vector3f</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vector3f</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodell.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.impl.FacetImpl
	 * @see Metamodell.impl.MetamodellPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 1;

	/**
	 * The feature id for the '<em><b>Solid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__SOLID = 0;

	/**
	 * The feature id for the '<em><b>Normal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__NORMAL = 1;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__EDGES = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__COLOR = 3;

	/**
	 * The feature id for the '<em><b>Area</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__AREA = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__X = 5;

	/**
	 * The feature id for the '<em><b>Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__Y = 6;

	/**
	 * The feature id for the '<em><b>Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET__Z = 7;

	/**
	 * The number of structural features of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodell.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.impl.EdgeImpl
	 * @see Metamodell.impl.MetamodellPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>P</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__P = 0;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DEGREE = 1;

	/**
	 * The feature id for the '<em><b>F</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__F = 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodell.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.impl.AreaImpl
	 * @see Metamodell.impl.MetamodellPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 3;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__FACETS = 0;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodell.impl.SolidImpl <em>Solid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.impl.SolidImpl
	 * @see Metamodell.impl.MetamodellPackageImpl#getSolid()
	 * @generated
	 */
	int SOLID = 4;

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
	 * The feature id for the '<em><b>Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID__AREA = 2;

	/**
	 * The number of structural features of the '<em>Solid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Solid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodell.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodell.impl.ColorImpl
	 * @see Metamodell.impl.MetamodellPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 5;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__R = 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__G = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__B = 2;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link Metamodell.Vector3f <em>Vector3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector3f</em>'.
	 * @see Metamodell.Vector3f
	 * @generated
	 */
	EClass getVector3f();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.Vector3f#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see Metamodell.Vector3f#getX()
	 * @see #getVector3f()
	 * @generated
	 */
	EAttribute getVector3f_X();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.Vector3f#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see Metamodell.Vector3f#getY()
	 * @see #getVector3f()
	 * @generated
	 */
	EAttribute getVector3f_Y();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.Vector3f#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see Metamodell.Vector3f#getZ()
	 * @see #getVector3f()
	 * @generated
	 */
	EAttribute getVector3f_Z();

	/**
	 * Returns the meta object for class '{@link Metamodell.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see Metamodell.Facet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for the reference '{@link Metamodell.Facet#getSolid <em>Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solid</em>'.
	 * @see Metamodell.Facet#getSolid()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Solid();

	/**
	 * Returns the meta object for the reference '{@link Metamodell.Facet#getNormal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Normal</em>'.
	 * @see Metamodell.Facet#getNormal()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Normal();

	/**
	 * Returns the meta object for the reference list '{@link Metamodell.Facet#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see Metamodell.Facet#getEdges()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Edges();

	/**
	 * Returns the meta object for the reference '{@link Metamodell.Facet#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Color</em>'.
	 * @see Metamodell.Facet#getColor()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Color();

	/**
	 * Returns the meta object for the container reference '{@link Metamodell.Facet#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Area</em>'.
	 * @see Metamodell.Facet#getArea()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Area();

	/**
	 * Returns the meta object for the reference '{@link Metamodell.Facet#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X</em>'.
	 * @see Metamodell.Facet#getX()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_X();

	/**
	 * Returns the meta object for the reference '{@link Metamodell.Facet#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Y</em>'.
	 * @see Metamodell.Facet#getY()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Y();

	/**
	 * Returns the meta object for the reference '{@link Metamodell.Facet#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Z</em>'.
	 * @see Metamodell.Facet#getZ()
	 * @see #getFacet()
	 * @generated
	 */
	EReference getFacet_Z();

	/**
	 * Returns the meta object for class '{@link Metamodell.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see Metamodell.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference list '{@link Metamodell.Edge#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>P</em>'.
	 * @see Metamodell.Edge#getP()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_P();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.Edge#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see Metamodell.Edge#getDegree()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Degree();

	/**
	 * Returns the meta object for the reference list '{@link Metamodell.Edge#getF <em>F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>F</em>'.
	 * @see Metamodell.Edge#getF()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_F();

	/**
	 * Returns the meta object for class '{@link Metamodell.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see Metamodell.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodell.Area#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see Metamodell.Area#getFacets()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Facets();

	/**
	 * Returns the meta object for class '{@link Metamodell.Solid <em>Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solid</em>'.
	 * @see Metamodell.Solid
	 * @generated
	 */
	EClass getSolid();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.Solid#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Metamodell.Solid#getName()
	 * @see #getSolid()
	 * @generated
	 */
	EAttribute getSolid_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodell.Solid#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see Metamodell.Solid#getFacets()
	 * @see #getSolid()
	 * @generated
	 */
	EReference getSolid_Facets();

	/**
	 * Returns the meta object for the reference list '{@link Metamodell.Solid#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Area</em>'.
	 * @see Metamodell.Solid#getArea()
	 * @see #getSolid()
	 * @generated
	 */
	EReference getSolid_Area();

	/**
	 * Returns the meta object for class '{@link Metamodell.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see Metamodell.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.Color#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see Metamodell.Color#getR()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_R();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.Color#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see Metamodell.Color#getG()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_G();

	/**
	 * Returns the meta object for the attribute '{@link Metamodell.Color#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see Metamodell.Color#getB()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_B();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodellFactory getMetamodellFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Metamodell.impl.Vector3fImpl <em>Vector3f</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.impl.Vector3fImpl
		 * @see Metamodell.impl.MetamodellPackageImpl#getVector3f()
		 * @generated
		 */
		EClass VECTOR3F = eINSTANCE.getVector3f();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3F__X = eINSTANCE.getVector3f_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3F__Y = eINSTANCE.getVector3f_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3F__Z = eINSTANCE.getVector3f_Z();

		/**
		 * The meta object literal for the '{@link Metamodell.impl.FacetImpl <em>Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.impl.FacetImpl
		 * @see Metamodell.impl.MetamodellPackageImpl#getFacet()
		 * @generated
		 */
		EClass FACET = eINSTANCE.getFacet();

		/**
		 * The meta object literal for the '<em><b>Solid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__SOLID = eINSTANCE.getFacet_Solid();

		/**
		 * The meta object literal for the '<em><b>Normal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__NORMAL = eINSTANCE.getFacet_Normal();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__EDGES = eINSTANCE.getFacet_Edges();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__COLOR = eINSTANCE.getFacet_Color();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__AREA = eINSTANCE.getFacet_Area();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__X = eINSTANCE.getFacet_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__Y = eINSTANCE.getFacet_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACET__Z = eINSTANCE.getFacet_Z();

		/**
		 * The meta object literal for the '{@link Metamodell.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.impl.EdgeImpl
		 * @see Metamodell.impl.MetamodellPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__P = eINSTANCE.getEdge_P();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__DEGREE = eINSTANCE.getEdge_Degree();

		/**
		 * The meta object literal for the '<em><b>F</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__F = eINSTANCE.getEdge_F();

		/**
		 * The meta object literal for the '{@link Metamodell.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.impl.AreaImpl
		 * @see Metamodell.impl.MetamodellPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__FACETS = eINSTANCE.getArea_Facets();

		/**
		 * The meta object literal for the '{@link Metamodell.impl.SolidImpl <em>Solid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.impl.SolidImpl
		 * @see Metamodell.impl.MetamodellPackageImpl#getSolid()
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
		 * The meta object literal for the '<em><b>Area</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLID__AREA = eINSTANCE.getSolid_Area();

		/**
		 * The meta object literal for the '{@link Metamodell.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodell.impl.ColorImpl
		 * @see Metamodell.impl.MetamodellPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__R = eINSTANCE.getColor_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__G = eINSTANCE.getColor_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__B = eINSTANCE.getColor_B();

	}

} //MetamodellPackage
