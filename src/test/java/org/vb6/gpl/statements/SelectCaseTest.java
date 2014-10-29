package org.vb6.gpl.statements;

import java.io.File;

import org.junit.Test;
import org.vb6.runner.VbParseTestRunner;
import org.vb6.runner.impl.VbParseTestRunnerImpl;

public class SelectCaseTest {

	@Test
	public void test() throws Exception {
		final File inputFile = new File("src/test/resources/org/vb6/gpl/statements/SelectCase.cls");
		final VbParseTestRunner runner = new VbParseTestRunnerImpl();
		runner.parseFile(inputFile);
	}
}