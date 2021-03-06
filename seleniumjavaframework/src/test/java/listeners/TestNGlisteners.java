package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlisteners implements ITestListener, ISuiteListener {

	public void onTestStart(ITestResult result) {
		System.out.println("********** test started :"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("********** test successful :"+result.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("********** test failed :"+result.getName());
		
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("********** test skipped :"+result.getName());
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	public void onStart(ITestContext context) {
		
	}
	public void onFinish(ITestContext context) {
		System.out.println("********** tests completed :"+context.getName());
		
	}
	public void onStart(ISuite suite) {
		
	}
	public void onFinish(ISuite suite) {
		
	}
}
