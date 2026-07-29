package com.demoapp.extendreports;

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

			extent.setSystemInfo("Tester:", "Sanjayn Ughada");
			extent.setSystemInfo("Framework:", "Selenium Hybrid Framework");
			extent.setSystemInfo("Impact Fnb Site:", "https://demoapps.qspiders.com");

		}

		return extent;
	}
}
