package com.demoapp.testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

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
		//ExtentTestManager.getTest().info("Clicking on Continue Button");
		//dp.getContinue_btn().click();
		
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
		
		
	}
}
