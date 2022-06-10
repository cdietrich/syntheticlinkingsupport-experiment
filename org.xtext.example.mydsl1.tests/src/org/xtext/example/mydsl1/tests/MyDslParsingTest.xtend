/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl1.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl1.myDsl.Model
import org.eclipse.xtext.testing.validation.ValidationTestHelper

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Inject
	extension ValidationTestHelper h
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			interface A
			interface B
			interface C
			interface D
			spec S1 A,B
			spec S2 C
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		result.assertNoErrors
		for (spec : result.specs) {
			println(spec.usedInterfaces.map[name].join(", "))
		}
	}
}