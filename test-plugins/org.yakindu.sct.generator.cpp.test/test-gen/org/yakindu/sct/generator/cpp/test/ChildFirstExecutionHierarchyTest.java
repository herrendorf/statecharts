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
	sourceFile = "gtests/ChildFirstExecutionHierarchy/ChildFirstExecutionHierarchyTest.cc",
	program = "gtests/ChildFirstExecutionHierarchy/ChildFirstExecutionHierarchy",
	model = "testmodels/SCTUnit/executionorder/ChildFirstExecutionHierarchy.sct",
	additionalFilesToCopy = {
		"libraryTarget/sc_runner.h",
		"libraryTarget/sc_runner.cpp"
	},
	additionalFilesToCompile = {
		"ChildFirstExecutionHierarchy.cpp",
		"sc_runner.cpp"
	}
)
@RunWith(GTestRunner.class)
public class ChildFirstExecutionHierarchyTest {
protected final GTestHelper helper = new GTestHelper(this, Compiler.GPLUSPLUS);

	@Before
	public void setUp() {
		helper.generate();
		helper.compile();
	}

}
