package org.xtext.example.mydsl.api;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.Solid;

import com.google.inject.Injector;

public class RunParser {
	private final static Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	
	private URI fileURI;
	
	public RunParser(String filePath) throws IOException {
		fileURI = URI.createFileURI(filePath);
	}
	
	public Optional<Solid> parse() {
		// Obtain a resource set from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		// Load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(fileURI, true);
		// Validation
		IResourceValidator validator = ((XtextResource) resource).getResourceServiceProvider().getResourceValidator();
		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		for (Issue issue : issues) {
			System.err.println(issue.getMessage());
		}

		if (issues.isEmpty())
			return Optional.of((Solid) resource.getContents().get(0));
		
		return Optional.empty();
	}
	
	public static void main(String[] args) throws IOException {		
		RunParser r = new RunParser("test.stl");
		Optional<Solid> solid = r.parse();
		System.out.println("Name: " + solid.get().getName());
		System.out.println("Number of facets: " + solid.get().getFacets().size());
	}
}
