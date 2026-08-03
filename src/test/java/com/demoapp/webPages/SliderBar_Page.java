package com.demoapp.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoapp.drivers.DriverFactory;

public class SliderBar_Page {

	protected WebDriver pagedriver;

	public SliderBar_Page() {
		pagedriver = DriverFactory.getDriver();
		PageFactory.initElements(pagedriver, this);
	}

	@FindBy(id = "slide")
	private WebElement slidebar_tbx;

	public WebDriver getPagedriver() {
		return pagedriver;
	}

	public WebElement getSlidebar_tbx() {
		return slidebar_tbx;
	}
	
	
	
}
