/* Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.sct.generator.cpp.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.yakindu.sct.generator.c.gtest.GTest;
import org.yakindu.sct.generator.c.gtest.GTestRunner;
import org.yakindu.sct.generator.c.gtest.GTestHelper;
import org.yakindu.sct.generator.c.gtest.GTestHelper.Compiler;

@GTest(
	statechartBundle = "org.yakindu.sct.test.models",
	sourceFile = "gtests/OutEventLifeCycleTest/OutEventLifeCycleTest.cc",
	program = "gtests/OutEventLifeCycleTest/OutEventLifeCycle",
	model = "testmodels/SCTUnit/OutEventLifeCycle.sct",
	additionalFilesToCopy = {
		"gtests/OutEventLifeCycleTest/sc_runner.h",
		"gtests/OutEventLifeCycleTest/sc_runner.cpp"
	},
	additionalFilesToCompile = {
		"OutEventLifeCycle.cpp",
		"sc_runner.cpp"
	}
)
@RunWith(GTestRunner.class)
public class OutEventLifeCycleTest {
protected final GTestHelper helper = new GTestHelper(this, Compiler.GPLUSPLUS);

	@Before
	public void setUp() {
		helper.generate();
		helper.compile();
	}

}
