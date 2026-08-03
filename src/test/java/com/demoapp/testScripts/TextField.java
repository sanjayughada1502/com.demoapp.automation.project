package com.demoapp.testScripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoapp.drivers.DriverFactory;
import com.demoapp.extendreports.ExtentTestManager;
import com.demoapp.listeners.Listerners_Implimentations;
import com.demoapp.testBase.TestBase;
import com.demoapp.utilities.EmailGenerator;
import com.demoapp.utilities.RandomNameGenerator;
import com.demoapp.utilities.RandomString;
import com.demoapp.webPages.DemoApp_HomePage;
import com.demoapp.webPages.TextField_Page;

@Listeners(Listerners_Implimentations.class)
public class TextField extends TestBase {

	// -------- With PlaceHolder Section --------------
	@Test(priority = 1, groups = { "Smoke", "Functional", "Regression", "Login" })
	public void TF01_Verify_Registration_Of_New_User() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens TexField Menu");
		TextField_Page tf = new TextField_Page();
		String name = RandomNameGenerator.generateAdvertiserName();
		String email = EmailGenerator.generateEmail();
		String password = RandomString.generateRandomString(6);
		ExtentTestManager.getTest().info("Entering Random Name, Email and Password...");
		tf.registerNewUser(name, email, password);
		SoftAssert assert1 = new SoftAssert();
		ExtentTestManager.getTest().info("Validating Registration...");
		assert1.assertTrue(tf.getRegisteredSuccessfully_txt().isDisplayed());
		assert1.assertAll();
	}

	@Test(priority = 2, groups = { "Smoke", "Functional", "Login" })
	public void TF02_Verify_Login_With_Valid_Credentials() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens TexField Menu");
		TextField_Page tf = new TextField_Page();
		String name = RandomNameGenerator.generateAdvertiserName();
		String email = EmailGenerator.generateEmail();
		String password = RandomString.generateRandomString(6);
		ExtentTestManager.getTest().info("Entering Random Name, Email and Password...");
		tf.registerNewUser(name, email, password);
		SoftAssert assert1 = new SoftAssert();
		ExtentTestManager.getTest().info("Validating Registration Successful Message displayed");
		assert1.assertTrue(tf.getRegisteredSuccessfully_txt().isDisplayed());
		tf.loginWith_Registred_Email_Password(email, password);
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(5));
		wait.until((ExpectedConditions.invisibilityOf(tf.getRegisteredSuccessfully_txt())));
		ExtentTestManager.getTest().info("Validating Sign In Successful Message displayed");
		assert1.assertTrue(tf.getSigninSuccessful_txt().isDisplayed());
		assert1.assertAll();
	}

	@Test(priority = 3, groups = { "Smoke", "Functional", "Login" })
	public void TF03_Verify_Login_With_Invalid_Credentials() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens TexField Menu");
		TextField_Page tf = new TextField_Page();
		String name = RandomNameGenerator.generateAdvertiserName();
		String email = EmailGenerator.generateEmail();
		String password = RandomString.generateRandomString(6);
		ExtentTestManager.getTest().info("Entering Random Name, Email and Invalid Password...");
		tf.registerNewUser(name, email, password);
		SoftAssert assert1 = new SoftAssert();
		assert1.assertTrue(tf.getRegisteredSuccessfully_txt().isDisplayed());
		tf.loginWith_Registred_Email_Password(email, "KHSvo8726487");
		ExtentTestManager.getTest().info("Verifiing Login with Invalid Password...");
		assert1.assertFalse(tf.getSigninSuccessful_txt().isDisplayed(), "Invalid Password Should Not Be Accepted.");
		assert1.assertAll();
	}

	// ----------------------- WithoutPlaceHolder Section
	// ----------------------------------
	@Test(priority = 4, groups = { "Smoke", "Functional", "Login" })
	public void TF04_Verify_Login_With_Valid_Credentials_WithOut_Placeholders() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens TexField Menu");
		TextField_Page tf = new TextField_Page();
		tf.getWithoutPlaceholder().click();
		String name = RandomNameGenerator.generateAdvertiserName();
		String email = EmailGenerator.generateEmail();
		String password = RandomString.generateRandomString(6);
		ExtentTestManager.getTest().info("Entering Random Name, Email and Password...");
		tf.registerNewUser(name, email, password);
		SoftAssert assert1 = new SoftAssert();
		ExtentTestManager.getTest().info("Validating Registration Successful Message displayed");
		assert1.assertTrue(tf.getRegisteredSuccessfully_txt().isDisplayed());
		tf.loginWith_Registred_Email_Password(email, password);
		ExtentTestManager.getTest().info("Validating Sign In Successful Message displayed");
		assert1.assertTrue(tf.getSigninSuccessful_txt().isDisplayed());
		assert1.assertAll();
	}

	@Test(priority = 5, groups = { "Smoke", "Functional", "Login" })
	public void TF05_Verify_Login_With_Valid_Credentials_With_ToolTip() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens TexField Menu");
		TextField_Page tf = new TextField_Page();
		tf.getWithToolTip().click();
		ExtentTestManager.getTest().info("Getting ToolTip");
		SoftAssert assert1 = new SoftAssert();
		ExtentTestManager.getTest().info("Validationg ToolTip Displayed for Name textbox");
		assert1.assertTrue(tf.getName_tooltip().isDisplayed());
		ExtentTestManager.getTest().info("Validationg ToolTip Displayed for Password textbox");
		assert1.assertTrue(tf.getPassword_tooltip().isDisplayed());
		assert1.assertAll();
	}

	@Test(priority = 6, groups = { "Negative", "Exploratory" })
	public void TF06_Verify_Login_With_Valid_Credentials_With_ToolTip() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens TexField Menu");
		TextField_Page tf = new TextField_Page();
		String name = RandomNameGenerator.generateAdvertiserName();
		String email = EmailGenerator.generateEmail();
		String password = RandomString.generateRandomString(6);
		tf.getDisabled().click();
		ExtentTestManager.getTest().info("Removing attribute 'disabled' using JavaScriptExecutor...");
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
		js.executeScript("document.getElementById('name').removeAttribute('disabled');");
		js.executeScript("document.getElementById('email').removeAttribute('disabled');");
		js.executeScript("document.getElementById('password').removeAttribute('disabled');");
		ExtentTestManager.getTest().info("Entering Random Name, Email and Password...");
		tf.registerNewUser(name, email, password);
		SoftAssert assert1 = new SoftAssert();
		ExtentTestManager.getTest().info("Validating Registration Successful Message displayed");
		assert1.assertTrue(tf.getRegisteredSuccessfully_txt().isDisplayed());
	}

	@Test(priority = 7, groups = { "Negative", "Exploratory", "SQLInjection" })
	public void TF07_Verify_SQLInjection_In_Name_Field() {

		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens TexField Menu");
		TextField_Page tf = new TextField_Page();
		String sqlInjection = "' OR '1'='1";
		String email = EmailGenerator.generateEmail();
		String password = RandomString.generateRandomString(8);
		ExtentTestManager.getTest().info("Validating Registration by Entering SQL Injections in Name TextdField");
		tf.registerNewUser(sqlInjection, email, password);
		SoftAssert sa = new SoftAssert();
		sa.assertFalse(tf.getRegisteredSuccessfully_txt().isDisplayed(),
				"Registration should not succeed with SQL Injection.");
		sa.assertAll();
	}

}
