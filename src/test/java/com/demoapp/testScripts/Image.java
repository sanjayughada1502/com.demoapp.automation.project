package com.demoapp.testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoapp.drivers.DriverFactory;
import com.demoapp.extendreports.ExtentTestManager;
import com.demoapp.listeners.Listerners_Implimentations;
import com.demoapp.testBase.TestBase;
import com.demoapp.webPages.DemoApp_HomePage;
import com.demoapp.webPages.Image_Page;

@Listeners(Listerners_Implimentations.class)
public class Image extends TestBase {

	@Test
	public void IM01_Verify_width_and_height_of_an_image() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getImage_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Image Menu");
		Image_Page ip = new Image_Page();
		// ip.getDefault_op().click();
		ExtentTestManager.getTest().info("Getting Image Width and Height");
		String width = ip.getMain_image().getCssValue("width");
		String height = ip.getMain_image().getCssValue("height");
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
	}

	@Test(groups = "Functional")
	public void IM02_Verify_Weather_Image_Is_Clickable() {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getImage_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Image Menu");
		Image_Page ip = new Image_Page();
		ip.getClickableImage_op().click();
		ExtentTestManager.getTest().info("Clicked on Clickable_Image Option");
		// Mens
		ip.getMensClothing_img().click();
		ExtentTestManager.getTest().info("Clicked on Mens Clothing Image");
		String currentURL = DriverFactory.getDriver().getCurrentUrl();
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(currentURL.contains("menClothing"));
		System.out.println(ip.getMensClothing_header().getText());
		ip.getBack_to_clickable_op_page().click();
		ExtentTestManager.getTest().info("Clicked on Back Button");
		// Women
		ip.getWomensClothing_img().click();
		ExtentTestManager.getTest().info("Clicked on Womens Clothing Image");
		String currentURL1 = DriverFactory.getDriver().getCurrentUrl();
		sa.assertTrue(currentURL1.contains("womenClothing"));
		System.out.println(ip.getWomensClothing_header().getText());
		ip.getBack_to_clickable_op_page().click();
		ExtentTestManager.getTest().info("Clicked on Back Button");
		// Kids
		ip.getKidsClothing_img().click();
		ExtentTestManager.getTest().info("Clicked on Kid's Clothing Image");
		String currentURL2 = DriverFactory.getDriver().getCurrentUrl();
		sa.assertTrue(currentURL2.contains("kidClothing"));
		System.out.println(ip.getKidsClothing_header().getText());
		ip.getBack_to_clickable_op_page().click();
		ExtentTestManager.getTest().info("Clicked on Back Button");
		// Electronic
		ip.getElectronics_img().click();
		ExtentTestManager.getTest().info("Clicked on Electronics Image");
		String currentURL3 = DriverFactory.getDriver().getCurrentUrl();
		sa.assertTrue(currentURL3.contains("watches"));
		System.out.println(ip.getElectronics_header().getText());
		ip.getBack_to_clickable_op_page().click();
		ExtentTestManager.getTest().info("Clicked on Back Button");
		//
		sa.assertAll();
	}
}
