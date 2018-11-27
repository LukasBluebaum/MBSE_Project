package controller;

import Metamodell.*;
import org.eclipse.emf.common.util.EList;

public class Controller {
	
	
	public void computeDegree(Edge e) {
		EList facets = e.getF();
		if(facets.size() == 2) {
			Facet f1 = (Facet) facets.get(0);
			Facet f2 = (Facet) facets.get(1);
			
			double scalar = f1.getNormal().getX() * f2.getNormal().getX() + 
							f1.getNormal().getY() * f2.getNormal().getY() + 
							f1.getNormal().getZ() * f2.getNormal().getZ();
			double mult =  Math.sqrt(f1.getNormal().getX()*f1.getNormal().getX() +
						   f1.getNormal().getY()*f1.getNormal().getY() +
						   f1.getNormal().getZ()*f1.getNormal().getZ())*
						   Math.sqrt(f2.getNormal().getX()*f2.getNormal().getX() +
						   f2.getNormal().getY()*f2.getNormal().getY() +
						   f2.getNormal().getZ()*f2.getNormal().getZ());
							
			
			e.setDegree(Math.acos(scalar/mult));
		}
		
		
		
	}

}
