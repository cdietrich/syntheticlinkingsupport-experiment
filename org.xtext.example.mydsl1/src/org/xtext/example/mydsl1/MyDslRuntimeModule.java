/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl1;

import org.eclipse.xtext.linking.ILinker;
import org.xtext.example.mydsl1.scoping.MyDslLazyLinker;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class MyDslRuntimeModule extends AbstractMyDslRuntimeModule {
	
	@Override
	public Class<? extends ILinker> bindILinker() {
		return MyDslLazyLinker.class;
	}
	
}