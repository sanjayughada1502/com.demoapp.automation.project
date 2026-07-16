package com.ufoframez.testScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ufoframez.drivers.DriverFactory;
import com.ufoframez.extendreports.ExtentTestManager;
import com.ufoframez.listeners.Listerners_Implimentations;
import com.ufoframez.testBase.TestBase;
import com.ufoframez.utilities.PropertyUtilities;
import com.ufoframez.webPages.DSALogin_Page;

@Listeners(Listerners_Implimentations.class)
public class Login extends TestBase {

	@Test(priority = 1, groups = { "Smoke", "Functional", " Regression" })
	public void LT01_Verify_Valid_DSALogin() throws IOException {
		DSALogin_Page loginPage = new DSALogin_Page();
		PropertyUtilities pu = new PropertyUtilities();
		String email = pu.getData("NONEMP_UNR_UN");
		String password = pu.getData("NONEMP_UNR_PW");
		loginPage.loginAsDSA(email, password);
		ExtentTestManager.getTest().info("Logged in with " + email + "& **********");
		// Waiting untill the popup is appeared

		try {
			WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			ExtentTestManager.getTest().info("Alert Text: " + alert.getText());
			// Accept the alert
			alert.accept();
			// OR dismiss the alert
			// alert.dismiss();
		} catch (NoAlertPresentException e) {
			ExtentTestManager.getTest().info("No alert appeared within 10 seconds.");
		}
		ExtentTestManager.getTest().info("Logged In Successfully");
		String title = DriverFactory.getDriver().getTitle();
		Assert.assertTrue(title.contains("Spot Booking List"),
				"Page title does not contain 'temptest'. Actual title: " + title);
	}

	@Test(groups = { "Smoke", "Functional", " Regression" })
	public void LT02_Verify_Invalid_DSALogin() throws IOException {
		DSALogin_Page loginPage = new DSALogin_Page();
		PropertyUtilities pu = new PropertyUtilities();
		String email = pu.getData("NONEMP_UNR_UN");
		String password = "@te$tP@ssw0rd";
		ExtentTestManager.getTest().info("Trying to logged in with " + email + "& **********");
		loginPage.loginAsDSA(email, password);
		
		try {
			Assert.assertTrue(loginPage.getLoginError_txt().isDisplayed());
		} catch (Exception e) {
			ExtentTestManager.getTest().info("Error Message Not Displayed..");
		}
	}
}
