package controller;

import Metamodell.*;
import Metamodell.impl.AreaImpl;
import Metamodell.impl.MetamodellFactoryImpl;
import Metamodell.impl.MetamodellPackageImpl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Controller
{
	
	public void computeDegree(Edge e)
	{
		System.out.println("\t" + this.getClass().getSimpleName() + ".computeDegree(Edge" + e + ")");
		EList<Facet> facets = e.getF();
		if (facets.size() == 2)
		{
			Facet f1 = (Facet) facets.get(0);
			Facet f2 = (Facet) facets.get(1);
			double scalar = f1.getNormal().getX() * f2.getNormal().getX() + f1.getNormal().getY() * f2.getNormal().getY() + f1.getNormal().getZ() * f2.getNormal().getZ();
			double mult = Math.sqrt(f1.getNormal().getX() * f1.getNormal().getX() + f1.getNormal().getY() * f1.getNormal().getY() + f1.getNormal().getZ() * f1.getNormal().getZ()) * Math.sqrt(f2.getNormal().getX() * f2.getNormal().getX() + f2.getNormal().getY() * f2.getNormal().getY() + f2.getNormal().getZ() * f2.getNormal().getZ());
			e.setDegree((float) Math.acos(scalar / mult));
		}
	}
	
	public void createAreas(final Solid s)
	{
		MetamodellPackageImpl.init();
		Queue<Facet> queue = new LinkedList<Facet>();
		Set<Facet> marked = new HashSet<Facet>();
		queue.add(s.getFacets().get(0));
		HashMap<EqVec, HashMap<Facet, List<Facet>>> areas = new HashMap<EqVec, HashMap<Facet, List<Facet>>>(); 
		while(!queue.isEmpty())
		{
			Facet current = queue.poll();
			EqVec normalVector = new EqVec(current.getNormal());
			// Iterate through all neighbours
			for(Edge e : current.getEdges())
			{
				List<Facet> neighbours = e.getF();
				for(Facet neighbour : neighbours)
				{
					EqVec n = new EqVec(neighbour.getNormal());
					if(normalVector.equals(n))
					{
						HashMap<Facet, List<Facet>> tmp = areas.get(normalVector);
						if(tmp == null)
						{
							tmp = new HashMap<Facet, List<Facet>>();
							areas.put(normalVector, tmp);
						}
					}
					else if(!marked.contains(neighbour))
					{
						queue.add(neighbour);
					}
				}
			}
			//
			
		}
	}
	
	public void createIndependendAreas(Solid s)
	{
		MetamodellPackageImpl.init();
		
		EList<Facet> q = s.getFacets();
		HashMap<EqVec, EList<Facet>> normalGroups = new HashMap<EqVec, EList<Facet>>();
		// 1. Group by Normal-Vector
		for (Facet f : q)
		{
			// Get the normal
			Vector3f n = f.getNormal();
			// Convert to Vector3f "implementation" that overrides the equals(Object)-method
			EqVec ev = new EqVec(n);
			EList<Facet> list = normalGroups.get(ev);
			// No Area found
			if (list == null)
			{
				list = new BasicEList<Facet>();
				normalGroups.put(ev, list);
			}
			// Put into area
			list.add(f);
		}
		EList<Area> result = new BasicEList<Area>();
		// 2. Create Areas
		for (EList<Facet> list : normalGroups.values())
		{
			// Create Area for each list
			AreaImpl a = (AreaImpl) MetamodellFactoryImpl.init().createArea();
			a.getFacets().addAll(list);
			result.add(a);
			for (Facet f : list)
			{
				f.setArea(a);
			}
		}
//		s.eSet(MetamodellPackage.SOLID__AREA, result);
		System.out.println(getClass().getSimpleName() + ".createAreas(Solid " + s + ")");
		System.out.println("\tcreated " + result.size() + " Area-Objects");
	}
	
	private static class EqVec
	{
		private final Vector3f v;
		
		public EqVec(final Vector3f v)
		{
			float l = (float) Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY()) + (v.getZ() * v.getZ()));
			if (l != 0)
			{
				this.v = MetamodellFactoryImpl.init().createVector3f();
				v.setX(v.getX() / l);
				v.setY(v.getY() / l);
				v.setZ(v.getZ() / l);
			}
			else
			{
				this.v = MetamodellFactoryImpl.init().createVector3f();
				v.setX(0);
				v.setY(0);
				v.setZ(0);
			}
		}
		
		private boolean eq(final Vector3f ov)
		{
			return v.getX() == ov.getX() && v.getY() == ov.getY() && v.getZ() == ov.getZ();
		}
		
		@Override
		public boolean equals(Object o)
		{
			if (o instanceof EqVec)
			{
				EqVec eqv = (EqVec) o;
				return eq(eqv.v);
			}
			return false;
		}
	}
	
}
