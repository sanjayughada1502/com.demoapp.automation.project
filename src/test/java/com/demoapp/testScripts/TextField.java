package com.demoapp.testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoapp.testBase.TestBase;
import com.demoapp.utilities.EmailGenerator;
import com.demoapp.utilities.RandomNameGenerator;
import com.demoapp.utilities.RandomString;
import com.demoapp.webPages.DemoApp_HomePage;
import com.demoapp.webPages.TextField_Page;

public class TextField extends TestBase {

	@Test(priority = 1, groups = { "Smoke", "Functional" })
	public void TF01_Verify_Registration_Of_New_User() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		TextField_Page tf = new TextField_Page();
		String name = RandomNameGenerator.generateAdvertiserName();
		String email = EmailGenerator.generateEmail();
		String password = RandomString.generateRandomString(6);
		tf.registerNewUser(name, email, password);
		SoftAssert assert1 = new SoftAssert();
		assert1.assertTrue(tf.getRegisteredSuccessfully_txt().isDisplayed());
	}

	@Test(priority = 2, groups = { "Smoke", "Functional" })
	public void TF02_Verify_Login_With_Valid_Credentials() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		TextField_Page tf = new TextField_Page();
		String name = RandomNameGenerator.generateAdvertiserName();
		String email = EmailGenerator.generateEmail();
		String password = RandomString.generateRandomString(6);
		tf.registerNewUser(name, email, password);
		SoftAssert assert1 = new SoftAssert();
		assert1.assertTrue(tf.getRegisteredSuccessfully_txt().isDisplayed());
		tf.loginWith_Registred_Email_Password(email, password);
		assert1.assertTrue(tf.getSigninSuccessful_txt().isDisplayed());
	}

	@Test(priority = 3, groups = { "Smoke", "Functional" })
	public void TF03_Verify_Login_With_Invalid_Credentials() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getTextField_Menu().click();
		TextField_Page tf = new TextField_Page();
		String name = RandomNameGenerator.generateAdvertiserName();
		String email = EmailGenerator.generateEmail();
		String password = RandomString.generateRandomString(6);
		tf.registerNewUser(name, email, password);
		SoftAssert assert1 = new SoftAssert();
		assert1.assertTrue(tf.getRegisteredSuccessfully_txt().isDisplayed());
		tf.loginWith_Registred_Email_Password(email, "KHSvo8726487");
		assert1.assertFalse(tf.getSigninSuccessful_txt().isDisplayed());
	}
}
