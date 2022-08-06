package Testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersInTestNG implements ITestListener {

	public void onFinish(ITestContext Result) {
		
	}
	public void onStart(ITestContext Redult) {
		System.out.println("Your test case execution started");
	
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
	}
	public void onTestFalure(ITestResult Result) {
		System.out.println("The name of the testcase failed is:"+Result.getName());
	}
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is:"+Result.getName());	
		}
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName()+"test case started");
	}
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is:"+Result.getName());
	}
}
