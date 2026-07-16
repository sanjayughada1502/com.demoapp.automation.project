package com.ufoframez.extendreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public synchronized static ExtentReports getExtentReport() {

		if (extent == null) {

			ExtentSparkReporter spark = new ExtentSparkReporter(
					System.getProperty("user.dir") + "/reports/AutomationTestReport.html");

			extent = new ExtentReports();

			extent.attachReporter(spark);

			extent.setSystemInfo("Tester:", "Sanjay");
			extent.setSystemInfo("Framework:", "Selenium TestNG");
			extent.setSystemInfo("Impact Fnb Site:", "testtheatrebusiness.impactexchange.com");

		}

		return extent;
	}
}
