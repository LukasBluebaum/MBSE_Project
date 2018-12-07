/**
 */
package Metamodell.util;

import Metamodell.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Metamodell.MetamodellPackage
 * @generated
 */
public class MetamodellAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodellPackage modelPackage;
	
	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodellAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = MetamodellPackage.eINSTANCE;
		}
	}
	
	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}
	
	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodellSwitch<Adapter> modelSwitch = new MetamodellSwitch<Adapter>()
	{
		@Override
		public Adapter caseVector3f(Vector3f object)
		{
			return createVector3fAdapter();
		}
		
		@Override
		public Adapter caseFacet(Facet object)
		{
			return createFacetAdapter();
		}
		
		@Override
		public Adapter caseEdge(Edge object)
		{
			return createEdgeAdapter();
		}
		
		@Override
		public Adapter caseArea(Area object)
		{
			return createAreaAdapter();
		}
		
		@Override
		public Adapter caseSolid(Solid object)
		{
			return createSolidAdapter();
		}
		
		@Override
		public Adapter caseColor(Color object)
		{
			return createColorAdapter();
		}
		
		@Override
		public Adapter defaultCase(EObject object)
		{
			return createEObjectAdapter();
		}
	};
	
	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject) target);
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.Vector3f <em>Vector3f</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.Vector3f
	 * @generated
	 */
	public Adapter createVector3fAdapter()
	{
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.Facet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.Facet
	 * @generated
	 */
	public Adapter createFacetAdapter()
	{
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter()
	{
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.Area
	 * @generated
	 */
	public Adapter createAreaAdapter()
	{
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.Solid <em>Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.Solid
	 * @generated
	 */
	public Adapter createSolidAdapter()
	{
		return null;
	}
	
	/**
	 * Creates a new adapter for an object of class '{@link Metamodell.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodell.Color
	 * @generated
	 */
	public Adapter createColorAdapter()
	{
		return null;
	}
	
	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}
	
} //MetamodellAdapterFactory
