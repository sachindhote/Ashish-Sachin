package Listners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listners extends TestListenerAdapter{
	
		public void onTestStart(ITestResult tr) {
		System.out.println("Test Started "+tr.getName());
	}

	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Passed "+tr.getName());
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failed "+tr.getName());
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test skipped "+tr.getName());
	}
}
