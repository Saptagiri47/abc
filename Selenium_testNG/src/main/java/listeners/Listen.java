package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener {
	public void onStart(ITestResult result) {
		System.out.println("Test execution started...!");
	  }
	public void onTestStart(ITestResult result) {
		System.out.println("Testing at every start of TC");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("success");
	  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped");
	  }
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure");
	  }
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		onTestFailure(result);
		System.out.println("onTestFailedButWithinSuccessPercentage");
	  }
	public void onFinish(ITestResult result) {
	    System.out.println("Finished..!");
	  }
}
