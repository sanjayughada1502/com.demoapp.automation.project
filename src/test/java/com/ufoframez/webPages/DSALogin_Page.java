package com.ufoframez.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ufoframez.drivers.DriverFactory;

public class DSALogin_Page {

	//--------------- Initialization ---------------

	protected WebDriver driver;

	public DSALogin_Page() {
		driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//---------------Declaration ---------------

	@FindBy(xpath = "//input[@type='email']")
	private WebElement emial_tbx;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password_tbx;

	@FindBy(xpath = "//input[@value='Sign In']")
	private WebElement sign_in_btn;

	@FindBy(linkText = "Forgot Password")
	private WebElement forgetPassword_lnk;

	@FindBy(xpath = "//span[text()='Invalid User/Password!']")
	private WebElement loginError_txt;
	
	
	//---------------Action Methods ---------------
	public void enterEmail(String email) {
		emial_tbx.clear();
		emial_tbx.sendKeys(email);
	}

	public void enterPassword(String password) {
		password_tbx.clear();
		password_tbx.sendKeys(password);
	}

	public void clickSignIn_btn() {
		sign_in_btn.click();
	}

	public void loginAsDSA(String email, String password) {
		emial_tbx.clear();
		emial_tbx.sendKeys(email);
		password_tbx.clear();
		password_tbx.sendKeys(password);
		sign_in_btn.click();
	}

	public void clickForgetPassword() {
		forgetPassword_lnk.click();
	}

	
	// ------------- Getters -----------------
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmial_tbx() {
		return emial_tbx;
	}

	public WebElement getPassword_tbx() {
		return password_tbx;
	}

	public WebElement getSign_in_btn() {
		return sign_in_btn;
	}

	public WebElement getForgetPassword_lnk() {
		return forgetPassword_lnk;
	}

	public WebElement getLoginError_txt() {
		return loginError_txt;
	}
	
	
	
	
}
