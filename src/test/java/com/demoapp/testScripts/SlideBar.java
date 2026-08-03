package com.demoapp.testScripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoapp.drivers.DriverFactory;
import com.demoapp.extendreports.ExtentTestManager;
import com.demoapp.listeners.Listerners_Implimentations;
import com.demoapp.testBase.TestBase;
import com.demoapp.webPages.DemoApp_HomePage;
import com.demoapp.webPages.SliderBar_Page;

@Listeners(Listerners_Implimentations.class)
public class SlideBar extends TestBase {

	@Test(priority = 1)
	public void SB01_Move_Slidebar_Using_Actions_Class() throws InterruptedException {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getSlider_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Slider Menu");
		SliderBar_Page sp = new SliderBar_Page();
		WebElement slidebar = sp.getSlidebar_tbx();
		Actions actions = new Actions(DriverFactory.getDriver());
		actions.dragAndDropBy(slidebar, 100, 0).perform();
		ExtentTestManager.getTest().info("Moved Slider by 100 xOffset");
		String value = slidebar.getAttribute("value");
		Assert.assertEquals(value, "4500");
		ExtentTestManager.getTest().info("Verified Sliderbar Value : " + value);
		//Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void SB02_Move_Slidebar_Using_Click_and_Hold() throws InterruptedException {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getSlider_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Slider Menu");
		SliderBar_Page sp = new SliderBar_Page();
		WebElement slidebar = sp.getSlidebar_tbx();
		Actions actions = new Actions(DriverFactory.getDriver());
		actions.clickAndHold(slidebar).moveByOffset(25, 0).release().perform();
		ExtentTestManager.getTest().info("Moved Slider using Clic and Hold Action Method");
		//Thread.sleep(3000);
		String value = slidebar.getAttribute("value");
		Assert.assertEquals(value, "3000");
		ExtentTestManager.getTest().info("Verified Sliderbar Value : " + value);
	}

	@Test(priority = 3)
	public void SB03_Move_Slidebar_Using_Keyboard_Keys() throws InterruptedException {
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getSlider_Menu().click();
		ExtentTestManager.getTest().info("Clicked on Slider Menu");
		SliderBar_Page sp = new SliderBar_Page();
		WebElement slidebar = sp.getSlidebar_tbx();
		slidebar.click();
		ExtentTestManager.getTest().info("Clicked on Sliderbar");
		slidebar.sendKeys(Keys.ARROW_RIGHT);
		ExtentTestManager.getTest().info("Movied by RIGHT Arrow Key");
		//Thread.sleep(2000);
		slidebar.sendKeys(Keys.ARROW_RIGHT);
		ExtentTestManager.getTest().info("Movied by RIGHT Arrow Key");
		//Thread.sleep(2000);
		slidebar.sendKeys(Keys.ARROW_RIGHT);
		ExtentTestManager.getTest().info("Movied by RIGHT Arrow Key");
		//Thread.sleep(2000);
		slidebar.sendKeys(Keys.ARROW_RIGHT);
		ExtentTestManager.getTest().info("Movied by RIGHT Arrow Key");
		//Thread.sleep(2000);
		String value = slidebar.getAttribute("value");
		Assert.assertEquals(value, "6000");
		ExtentTestManager.getTest().info("Verified Sliderbar Value : " + value);
	}

}
