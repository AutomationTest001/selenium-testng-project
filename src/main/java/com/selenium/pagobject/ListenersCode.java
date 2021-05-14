package com.selenium.pagobject;

import org.testng.ITestListener;
import org.testng.ITestResult;

import sun.jvm.hotspot.runtime.Thread;

public class ListenersCode implements ITestListener {

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test Case Passed : " + result.getMethod().getDescription());
		
		try {
			TestBase.takeScreenShotListenerClass(result, "passed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Test Case Failed : " + result.getName());
	
		try {
			TestBase.takeScreenShotListenerClass(result, "failed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test Case Skipped : " + result.getName());

		
	}

}
