package Testcases;

import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

public class TestRunner {
	private static final String FunctionalityTests = null;

	public static void main(String[] args) {
		
		JUnitCore junitCore = new JUnitCore();
		
		Request request = Request.method(FunctionalityTests.class, "dragAndDropTest");
		
		Result result = junitCore.run(request);
		
	}
}
