package com.demoapp.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoapp.drivers.DriverFactory;

public class TextField_Page {

	protected WebDriver pagedriver;

	public TextField_Page() {
		pagedriver = DriverFactory.getDriver();
		PageFactory.initElements(pagedriver, this);
	}

	@FindBy(xpath = "//input[@id='name']")
	private WebElement name_tbx;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailId_tbx;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password_tbx;
	@FindBy(xpath = "//button[normalize-space()='Register']")
	private WebElement register_btn;
	@FindBy(xpath = "//a[@class='poppins text-[12px] font-sans font-bold text-slate-500 relative top-3 hover:text-slate-700 cursor-pointer underline']")
	private WebElement loginNow_link;
	@FindBy(xpath = "//li[normalize-space()='With placeholder']")
	private WebElement withPlaceholder;
	@FindBy(xpath = "//li[normalize-space()='Without placeholder']")
	private WebElement withoutPlaceholder;
	@FindBy(xpath = "//li[normalize-space()='With ToolTip']")
	private WebElement withToolTip;
	@FindBy(xpath = "//li[normalize-space()='Multiline Text Area']")
	private WebElement multilineTextArea;
	@FindBy(xpath = "//li[normalize-space()='Disabled']")
	private WebElement disabled;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailId_tbx_2;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password_tbx_2;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement login_btn;
	@FindBy(xpath = "//a[@class='text-[12px] font-sans font-bold text-slate-500 relative top-3 hover:text-slate-700 cursor-pointer poppins underline']")
	private WebElement registerNow_link;

	@FindBy(xpath = "//article[@class='form_content absolute left-[16.2%] bg-[#e3e8e7] top-[1.3%] ml-[1.5%] h-[72.5%] w-[64.5%] flex gap-3']//div[@role='status'][normalize-space()='Registered successfully']")
	private WebElement registeredSuccessfully_txt;

	@FindBy(xpath = "//article[@class='form_content absolute left-[16.2%] bg-[#e3e8e7] top-[1.3%] ml-[1.5%] h-[72.5%] w-[64.5%] flex gap-3']//div[@class='go2072408551']")
	private WebElement SigninSuccessful_txt;

	// ------------ Getters ----------------------

	public WebDriver getPagedriver() {
		return pagedriver;

	}

	public WebElement getRegisteredSuccessfully_txt() {
		return registeredSuccessfully_txt;
	}

	public WebElement getSigninSuccessful_txt() {
		return SigninSuccessful_txt;
	}

	public WebElement getRegister_btn() {
		return register_btn;
	}

	public WebElement getWithPlaceholder() {
		return withPlaceholder;
	}

	public WebElement getWithoutPlaceholder() {
		return withoutPlaceholder;
	}

	public WebElement getWithToolTip() {
		return withToolTip;
	}

	public WebElement getMultilineTextArea() {
		return multilineTextArea;
	}

	public WebElement getDisabled() {
		return disabled;
	}

	public WebElement getName_tbx() {
		return name_tbx;
	}

	public WebElement getEmailId_tbx() {
		return emailId_tbx;
	}

	public WebElement getPassword_tbx() {
		return password_tbx;
	}

	public WebElement getLoginNow_link() {
		return loginNow_link;
	}

	public WebElement getEmailId_tbx_2() {
		return emailId_tbx_2;
	}

	public WebElement getPassword_tbx_2() {
		return password_tbx_2;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public WebElement getRegisterNow_link() {
		return registerNow_link;
	}

	// ------------ Action Methods -------------------------

	public void registerNewUser(String name, String email, String password) {
		name_tbx.clear();
		name_tbx.sendKeys(name);
		emailId_tbx.clear();
		emailId_tbx.sendKeys(email);
		password_tbx.clear();
		password_tbx.sendKeys(password);
		register_btn.click();
	}

	public void loginWith_Registred_Email_Password(String email, String password) {
		emailId_tbx_2.clear();
		emailId_tbx_2.sendKeys(email);
		password_tbx_2.clear();
		password_tbx_2.sendKeys(password);
		login_btn.click();
	}

}
