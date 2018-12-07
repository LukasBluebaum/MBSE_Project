/**
 */
package Metamodell.impl;

import Metamodell.Area;
import Metamodell.Color;
import Metamodell.Edge;
import Metamodell.Facet;
import Metamodell.MetamodellFactory;
import Metamodell.MetamodellPackage;
import Metamodell.Solid;
import Metamodell.Vector3f;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodellPackageImpl extends EPackageImpl implements MetamodellPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vector3fEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;
	
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Metamodell.MetamodellPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetamodellPackageImpl()
	{
		super(eNS_URI, MetamodellFactory.eINSTANCE);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;
	
	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetamodellPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetamodellPackage init()
	{
		if (isInited)
			return (MetamodellPackage) EPackage.Registry.INSTANCE.getEPackage(MetamodellPackage.eNS_URI);
		
		// Obtain or create and register package
		Object registeredMetamodellPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetamodellPackageImpl theMetamodellPackage = registeredMetamodellPackage instanceof MetamodellPackageImpl ? (MetamodellPackageImpl) registeredMetamodellPackage : new MetamodellPackageImpl();
		
		isInited = true;
		
		// Create package meta-data objects
		theMetamodellPackage.createPackageContents();
		
		// Initialize created meta-data
		theMetamodellPackage.initializePackageContents();
		
		// Mark meta-data to indicate it can't be changed
		theMetamodellPackage.freeze();
		
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetamodellPackage.eNS_URI, theMetamodellPackage);
		return theMetamodellPackage;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector3f()
	{
		return vector3fEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector3f_X()
	{
		return (EAttribute) vector3fEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector3f_Y()
	{
		return (EAttribute) vector3fEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector3f_Z()
	{
		return (EAttribute) vector3fEClass.getEStructuralFeatures().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacet()
	{
		return facetEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacet_Solid()
	{
		return (EReference) facetEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacet_Normal()
	{
		return (EReference) facetEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacet_Edges()
	{
		return (EReference) facetEClass.getEStructuralFeatures().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacet_Color()
	{
		return (EReference) facetEClass.getEStructuralFeatures().get(3);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacet_Area()
	{
		return (EReference) facetEClass.getEStructuralFeatures().get(4);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge()
	{
		return edgeEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_P()
	{
		return (EReference) edgeEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Degree()
	{
		return (EAttribute) edgeEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_F()
	{
		return (EReference) edgeEClass.getEStructuralFeatures().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea()
	{
		return areaEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Facets()
	{
		return (EReference) areaEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolid()
	{
		return solidEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolid_Name()
	{
		return (EAttribute) solidEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolid_Facets()
	{
		return (EReference) solidEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolid_Area()
	{
		return (EReference) solidEClass.getEStructuralFeatures().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor()
	{
		return colorEClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_R()
	{
		return (EAttribute) colorEClass.getEStructuralFeatures().get(0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_G()
	{
		return (EAttribute) colorEClass.getEStructuralFeatures().get(1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_B()
	{
		return (EAttribute) colorEClass.getEStructuralFeatures().get(2);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodellFactory getMetamodellFactory()
	{
		return (MetamodellFactory) getEFactoryInstance();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;
	
	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated)
			return;
		isCreated = true;
		
		// Create classes and their features
		vector3fEClass = createEClass(VECTOR3F);
		createEAttribute(vector3fEClass, VECTOR3F__X);
		createEAttribute(vector3fEClass, VECTOR3F__Y);
		createEAttribute(vector3fEClass, VECTOR3F__Z);
		
		facetEClass = createEClass(FACET);
		createEReference(facetEClass, FACET__SOLID);
		createEReference(facetEClass, FACET__NORMAL);
		createEReference(facetEClass, FACET__EDGES);
		createEReference(facetEClass, FACET__COLOR);
		createEReference(facetEClass, FACET__AREA);
		
		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__P);
		createEAttribute(edgeEClass, EDGE__DEGREE);
		createEReference(edgeEClass, EDGE__F);
		
		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__FACETS);
		
		solidEClass = createEClass(SOLID);
		createEAttribute(solidEClass, SOLID__NAME);
		createEReference(solidEClass, SOLID__FACETS);
		createEReference(solidEClass, SOLID__AREA);
		
		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__R);
		createEAttribute(colorEClass, COLOR__G);
		createEAttribute(colorEClass, COLOR__B);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;
	
	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized)
			return;
		isInitialized = true;
		
		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);
		
		// Create type parameters
		
		// Set bounds for type parameters
		
		// Add supertypes to classes
		
		// Initialize classes, features, and operations; add parameters
		initEClass(vector3fEClass, Vector3f.class, "Vector3f", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVector3f_X(), ecorePackage.getEFloat(), "x", null, 0, 1, Vector3f.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector3f_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, Vector3f.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector3f_Z(), ecorePackage.getEFloat(), "z", null, 0, 1, Vector3f.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(facetEClass, Facet.class, "Facet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacet_Solid(), this.getSolid(), this.getSolid_Facets(), "solid", null, 1, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacet_Normal(), this.getVector3f(), null, "normal", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacet_Edges(), this.getEdge(), null, "edges", null, 3, 3, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacet_Color(), this.getColor(), null, "color", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacet_Area(), this.getArea(), null, "area", null, 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_P(), this.getVector3f(), null, "p", null, 2, 2, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Degree(), ecorePackage.getEDouble(), "degree", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_F(), this.getFacet(), null, "f", null, 1, 2, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_Facets(), this.getFacet(), this.getFacet_Area(), "facets", null, 0, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(solidEClass, Solid.class, "Solid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolid_Name(), ecorePackage.getEString(), "name", null, 0, 1, Solid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolid_Facets(), this.getFacet(), this.getFacet_Solid(), "facets", null, 0, -1, Solid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolid_Area(), this.getArea(), null, "area", null, 0, -1, Solid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_R(), ecorePackage.getEInt(), "r", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_G(), ecorePackage.getEInt(), "g", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_B(), ecorePackage.getEInt(), "b", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		// Create resource
		createResource(eNS_URI);
	}
	
} //MetamodellPackageImpl
