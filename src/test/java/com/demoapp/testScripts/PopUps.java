package com.demoapp.testScripts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoapp.drivers.DriverFactory;
import com.demoapp.extendreports.ExtentTestManager;
import com.demoapp.listeners.Listerners_Implimentations;
import com.demoapp.testBase.TestBase;
import com.demoapp.webPages.DemoApp_HomePage;
import com.demoapp.webPages.PopUps_Page;

@Listeners(Listerners_Implimentations.class)
public class PopUps extends TestBase {

	@Test(priority = 1, groups = { "Smoke" })
	public void PO001_Verify_JavaScript_Popup_Alert_For_Item_Deletion() {
		// Write a Script to Handle JavaScript Popup
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getPopups_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens PopUps Menu");
		home.getJavascript_menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens JavaScript Menu");
		PopUps_Page page = new PopUps_Page();
		page.getConfirm_Option().click();
		ExtentTestManager.getTest().info("Clicked on Confirm Option");
		SoftAssert asserts = new SoftAssert();
		ExtentTestManager.getTest().info("Validating if Purchase Item Tab Displayed");
		asserts.assertTrue(page.getPurchase_Items_Tab().isDisplayed());
		ExtentTestManager.getTest().info("Selecting 1st Item from List");
		page.getCheckbox_1stRow().click();
		page.getDelete_btn().click();
		ExtentTestManager.getTest().info("Clicked on Delete Button");
		ExtentTestManager.getTest().info("Validating if Alert Displayed");
		try {
			Alert alert = DriverFactory.getDriver().switchTo().alert();

			String alertText = alert.getText();

			if (alertText.equals("Are you sure you want to delete?")) {
				System.out.println("Alert displayed with correct message");
			}

			asserts.assertTrue(alert != null);
			alert.dismiss();

		} catch (Exception e) {
			System.out.println("Alert is NOT displayed");
			asserts.fail();
		}

		asserts.assertAll();
	}

	@Test(priority = 2, groups = { "Functional" })
	public void PO002_Verify_Item_Deletion() {
		// Item Should be deleted from Purchase Items List
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getPopups_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens PopUps Menu");
		home.getJavascript_menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens JavaScript Menu");
		PopUps_Page page = new PopUps_Page();
		page.getConfirm_Option().click();
		ExtentTestManager.getTest().info("Clicked on Confirm Option");
		SoftAssert asserts = new SoftAssert();
		ExtentTestManager.getTest().info("Validating if Purchase Item Tab Displayed");
		asserts.assertTrue(page.getPurchase_Items_Tab().isDisplayed());
		int initialRowCount = page.getPurchasedtemsTables_rows_Count();
		ExtentTestManager.getTest().info("Selecting 1st Item from List");
		page.getCheckbox_1stRow().click();
		page.getDelete_btn().click();
		ExtentTestManager.getTest().info("Clicked on Delete Button");
		ExtentTestManager.getTest().info("Validating if Alert Displayed");
		try {
			Alert alert = DriverFactory.getDriver().switchTo().alert();

			String alertText = alert.getText();

			if (alertText.equals("Are you sure you want to delete?")) {
				System.out.println("Alert displayed with correct message");
			}

			asserts.assertTrue(alert != null);
			alert.accept();

		} catch (Exception e) {
			System.out.println("Alert is NOT displayed");
			asserts.fail();
		}
		int currentRowCount = page.getPurchasedtemsTables_rows_Count();
		asserts.assertTrue(initialRowCount > currentRowCount);
		asserts.assertAll();
	}
	
	@Test(priority = 3, groups = { "Functional" })
	public void PO003_Handling_of_Prompt_Popup_for_Item_Deletion() {
		// Item Should be deleted from Purchase Items List
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getPopups_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens PopUps Menu");
		home.getJavascript_menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens JavaScript Menu");
		PopUps_Page page = new PopUps_Page();
		page.getPrompt_Option().click();
		ExtentTestManager.getTest().info("Clicked on Confirm Option");
		SoftAssert asserts = new SoftAssert();
		ExtentTestManager.getTest().info("Validating if Purchase Item Tab Displayed");
		asserts.assertTrue(page.getPurchase_Items_Tab().isDisplayed());
		int initialRowCount = page.getPurchasedtemsTables_rows_Count();
		ExtentTestManager.getTest().info("Selecting 1st Item from List");
		page.getCheckbox_1stRow().click();
		page.getDelete_btn().click();
		ExtentTestManager.getTest().info("Clicked on Delete Button");
		ExtentTestManager.getTest().info("Validating if Alert Displayed");
		try {
			Alert alert = DriverFactory.getDriver().switchTo().alert();

			String alertText = alert.getText();

			if (alertText.equals("Enter a comment.")) {
				System.out.println("Alert displayed with correct message");
				alert.sendKeys("Delete Item");
			}

			asserts.assertTrue(alert != null);
			alert.accept();

		} catch (Exception e) {
			System.out.println("Alert is NOT displayed");
			asserts.fail();
		}
		int currentRowCount = page.getPurchasedtemsTables_rows_Count();
		asserts.assertTrue(initialRowCount > currentRowCount);
		asserts.assertAll();
	}
	
	@Test(priority = 4, groups = { "Functional" })
	public void PO004_Handling_of_Hidden_Division_Popup() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getPopups_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens PopUps Menu");
		home.getHiddenDivision_menu().click();
		ExtentTestManager.getTest().info("Clicked on Mens Hidden division Menu");
		//Pending to Create Script
	}
}
