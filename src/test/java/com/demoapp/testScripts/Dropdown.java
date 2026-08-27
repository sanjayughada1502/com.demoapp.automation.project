package com.demoapp.testScripts;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoapp.drivers.DriverFactory;
import com.demoapp.extendreports.ExtentTestManager;
import com.demoapp.listeners.Listerners_Implimentations;
import com.demoapp.testBase.TestBase;
import com.demoapp.webPages.DemoApp_HomePage;
import com.demoapp.webPages.Dropdown_Page;

@Listeners(Listerners_Implimentations.class)
public class Dropdown extends TestBase {

	@Test(priority = 1, groups = { "Smoke", "Functional", "Regression" })
	public void DP01_Select_Values_From_Single_Select_Dropdown() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getDropdown_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Dropdown Menu..");
		Dropdown_Page dp = new Dropdown_Page();
		dp.getSingleSelect_op().click();
		ExtentTestManager.getTest().info("Clicked on Single Select option..");
		ExtentTestManager.getTest().info("Selecting Option from Single Select Drodpwn by Visile Texts");
		dp.fill_Delivery_Details_in_Single_Select_Section("91", "8208124249", true, "India", "Maharashtra", "Thane");
		ExtentTestManager.getTest().info("Selecting Quantity");
		Select select = new Select(dp.getSelectQTY__dpdwn());
		select.selectByValue("2");
		ExtentTestManager.getTest().info("Validating Product Price");
		String string_qty = dp.getProduct_qty().getText();
		String string_rate = dp.getProduct_rate().getText();
		String string_total = dp.getProduct_total().getText();
		int qty = Integer.parseInt(string_qty.replace(",", "").trim());
		int rate = Integer.parseInt(string_rate.replace(",", "").trim());
		int total = Integer.parseInt(string_total.replace(",", "").trim());
		System.out.println(qty);
		System.out.println(rate);
		System.out.println(total);
		Assert.assertTrue(rate == total);
		// ExtentTestManager.getTest().info("Clicking on Continue Button");
		// dp.getContinue_btn().click();

	}

	@Test(priority = 2, groups = { "Smoke", "Functional", "Regression" })
	public void DP02_Select_Values_From_Multi_Select_Dropdown() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getDropdown_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Dropdown Menu..");
		Dropdown_Page dp = new Dropdown_Page();
		dp.getMultiSelect_op().click();
		ExtentTestManager.getTest().info("Clicked on Multi Select option..");
		ExtentTestManager.getTest().info("Selecting Option from Multi Select Drodpwn by Index");
		Select msd = new Select(dp.getMultiSelect_Product_List_dpdwn());

		List<WebElement> alloptions = msd.getOptions();
		List<String> optionList = new ArrayList<String>();

		for (WebElement option : alloptions) {
			optionList.add(option.getText());
		}

		List<WebElement> selectedList = new ArrayList<WebElement>();

		if (msd.isMultiple()) {
			ExtentTestManager.getTest().info("Verfied its a Multiselect Dropdown");
			msd.selectByIndex(0);
			msd.selectByIndex(1);
			msd.selectByIndex(2);
			msd.selectByIndex(3);
			msd.selectByIndex(4);
			selectedList.addAll(msd.getAllSelectedOptions());
			ExtentTestManager.getTest().info("Selected 4 options");
			dp.getAdd_btn().click();
			System.out.println("List Size : " + selectedList.size());
			for (int i = 0; i < selectedList.size(); i++) {
				String opText = selectedList.get(i).getText();
				System.out.println("OpText : " + opText);

				List<WebElement> elemnt = DriverFactory.getDriver()
						.findElements(By.xpath("//tbody/tr/td[contains(text(),'" + opText.substring(0, 12) + "')]"));
				if (elemnt.isEmpty()) {
					ExtentTestManager.getTest().info("Selected Option not available in Product Name Table");
				} else {
					ExtentTestManager.getTest().info(opText + " is Available in Product Name Table");
				}
			}
		} else {
			ExtentTestManager.getTest().info("Its Not a Multiselect Dropdown");
			Assert.fail();
		}
	}
	
	
	@Test(priority = 3, groups = { "Smoke", "Functional", "Regression" })
	public void DP03_Select_Values_By_Searching_In_Dropdown() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getDropdown_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Dropdown Menu..");
		Dropdown_Page dp = new Dropdown_Page();
		dp.getSearchWithSelect_op().click();
		ExtentTestManager.getTest().info("Clicked on search With Select option..");
		
		WebElement selectPhone = dp.getSearch_Phone_Mdpdwn();
		selectPhone.click();
		selectPhone.sendKeys("+91");
		DriverFactory.getDriver().findElement(By.xpath("//div[text()=\"+91\"]")).click();
		dp.getEnterYourNumber_Mdpdwn().sendKeys("8208124249");
		
		ExtentTestManager.getTest().info("Selecting Genger as 'Female'");
		WebElement selectGender = dp.getSelectGender_Mdpdwn();
		selectGender.click();
		selectGender.sendKeys("female");
		DriverFactory.getDriver().findElement(By.xpath("//div[text()=\"female\"]")).click();
		
		ExtentTestManager.getTest().info("Selecting Country as 'India'");
		WebElement selectCountry = dp.getCountry_Mdpdwn();
		selectCountry.click();
		selectCountry.sendKeys("India");
		DriverFactory.getDriver().findElement(By.xpath("//div[text()=\"India\"]")).click();
		
		ExtentTestManager.getTest().info("Selecting State as 'Maharashtra'");
		WebElement selectState = dp.getState_Mdpdwn();
		selectState.click();
		selectState.sendKeys("Maharashtra");
		DriverFactory.getDriver().findElement(By.xpath("//div[text()=\"Maharashtra\"]")).click();
		
		ExtentTestManager.getTest().info("Selecting City as 'Thane'");
		WebElement selectCity = dp.getCity_Mdpdwn();
		selectCity.click();
		selectCity.sendKeys("Thane");
		DriverFactory.getDriver().findElement(By.xpath("//div[text()=\"Thane\"]")).click();
		
		ExtentTestManager.getTest().info("Selecting Qty as '2'");
		WebElement selectQTY = dp.getQty__Mdpdwn();
		selectQTY.click();
		selectQTY.sendKeys("2");
		DriverFactory.getDriver().findElement(By.xpath("//div[text()=\"2\"]")).click();
	}
}
