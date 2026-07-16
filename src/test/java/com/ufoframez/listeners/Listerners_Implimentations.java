package com.ufoframez.listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.google.common.io.Files;

import com.ufoframez.drivers.DriverFactory;
import com.ufoframez.extendreports.ExtentManager;
import com.ufoframez.extendreports.ExtentTestManager;

public class Listerners_Implimentations implements ITestListener {

	public static ExtentReports extent = ExtentManager.getExtentReport();

	@Override
	public void onTestStart(ITestResult result) {

		String testName = result.getTestClass().getRealClass().getSimpleName() + " :: "
				+ result.getMethod().getMethodName();
		ExtentTest extentTest = extent.createTest(testName);
		ExtentTestManager.setTest(extentTest);
		ExtentTestManager.getTest().info("Test Execution Started");
		System.out.println("Extent Test Created : " + testName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// ExtentTestManager.getTest().pass("Test Cases Successed");
		ExtentTestManager.getTest().pass("Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("\n====================================");
		System.out.println("FAILED TEST : " + result.getMethod().getMethodName());
		
		//Getting Current DateTime:
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy HH:mm:ss");
		String dateTime = now.format(formatter);
		//System.out.println(dateTime);
		
		
		if (result.getThrowable() != null) {
			result.getThrowable().printStackTrace();
			TakesScreenshot ts = (TakesScreenshot) DriverFactory.getDriver();
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(System.getProperty("user.dir") + "/screenshots/" + result.getName() + "_"+dateTime + ".png");
			try {
				Files.copy(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("====================================\n");

		ExtentTest test = ExtentTestManager.getTest();

		if (test != null) {
			test.fail(result.getThrowable());
		} else {
			System.out.println("ExtentTest object is NULL");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentTestManager.getTest().skip("Test Case Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		ExtentTestManager.unload();

	}

}
