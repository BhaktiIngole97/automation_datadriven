package Lisner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import bs_baseclass.base_class;

public class Test_listener extends base_class implements ITestListener {
	public String name;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " : onTestStart");
		extent.attachReporter(spark);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " : onTestSucess");
		name = result.getMethod().getMethodName();
		ExtentTest test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Bhakti");
		test.pass("Test method pass...");
		takeScreenShot(name);
		extent.flush();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		name = result.getMethod().getMethodName();
		ExtentTest test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Bhakti");
		test.fail("Test method failed...");
		takeScreenShot(name);
		extent.flush();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentTest test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Bhakti");
		test.skip("Test method skipped...");
		extent.flush();

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
