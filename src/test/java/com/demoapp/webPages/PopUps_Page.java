package com.demoapp.webPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoapp.drivers.DriverFactory;

public class PopUps_Page {

	protected WebDriver pagedriver;

	public PopUps_Page() {
		pagedriver = DriverFactory.getDriver();
		PageFactory.initElements(pagedriver, this);
	}

	@FindBy(linkText = "Confirm")
	private WebElement Confirm_Option;

	@FindBy(linkText = "Prompt")
	private WebElement Prompt_Option;

	@FindBy(xpath = "//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/div/article/section")
	private WebElement Purchase_Items_Tab;

	@FindBy(id = "deleteButton")
	private WebElement delete_btn;

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	private WebElement checkbox_1stRow;

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
	private WebElement checkbox_2stRow;

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[3]")
	private WebElement checkbox_3stRow;

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[4]")
	private WebElement checkbox_4stRow;

	public WebDriver getPagedriver() {
		return pagedriver;
	}

	// Getters
	public WebElement getConfirm_Option() {
		return Confirm_Option;
	}

	public WebElement getPrompt_Option() {
		return Prompt_Option;
	}

	public WebElement getPurchase_Items_Tab() {
		return Purchase_Items_Tab;
	}

	public WebElement getDelete_btn() {
		return delete_btn;
	}

	public WebElement getCheckbox_1stRow() {
		return checkbox_1stRow;
	}

	public WebElement getCheckbox_2stRow() {
		return checkbox_2stRow;
	}

	public WebElement getCheckbox_3stRow() {
		return checkbox_3stRow;
	}

	public WebElement getCheckbox_4stRow() {
		return checkbox_4stRow;
	}

	
	/**
	 * This Method will return the String data from each row of Purchase Lists Table
	 * @return
	 */
	public List<String> getPurchasedtemsTables_rows_Data() {
		List<String> list = new ArrayList<String>();

		List<WebElement> rows = DriverFactory.getDriver()
				.findElements(By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/div/div/table/tbody/tr"));
		for (WebElement row : rows) {
			String data = row.getText();
			list.add(data);
		}
		return list;
	}
	
	public int getPurchasedtemsTables_rows_Count() {
		List<String> list = new ArrayList<String>();

		List<WebElement> rows = DriverFactory.getDriver()
				.findElements(By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/div/div/table/tbody/tr"));
		for (WebElement row : rows) {
			String data = row.getText();
			list.add(data);
		}
		return list.size();
	}
}
