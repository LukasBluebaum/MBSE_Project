package org.emoflon.ibex.tgg.run.stlimportexport;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.stlimportexport.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		_SchemaBasedAutoRegistration.register(strategy);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("STLImportExport");
		options.projectPath("STLImportExport");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
