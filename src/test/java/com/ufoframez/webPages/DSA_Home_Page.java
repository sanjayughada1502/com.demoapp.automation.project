package com.ufoframez.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ufoframez.drivers.DriverFactory;

public class DSA_Home_Page {

	protected WebDriver driver;

	public DSA_Home_Page() {
		driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[4]/header/nav/a/span")
	private WebElement menuToggle_btn;
	
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[4]/header/nav/div/ul/li[3]/a")
	private WebElement profile_btn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_lblMyBalance\"]")
	private WebElement accountBalance_txt;
	
	@FindBy(xpath = "//*[@id=\"ctl00_lblCreditBalance\"]")
	private WebElement creditPoints_txt;
	
	@FindBy(xpath = "//*[@id=\"Advertiser\"]/a/span")
	private WebElement Advertiser_Menu;
	
	@FindBy(xpath = "//*[@id=\"Manage Advertiser\"]")
	private WebElement Manage_Advertiser_menu;
	
	@FindBy(xpath = "//*[@id=\"Track Visits\"]")
	private WebElement Track_Visit_menu;
	
	@FindBy(xpath = "//*[@id=\"Create Invoice\"]")
	private WebElement Create_Invoice_menu;
	
	@FindBy(xpath = "//*[@id=\"Creative\"]/a/span")
	private WebElement Creative_Menu;
	
	@FindBy(xpath = "//*[@id=\"Create Media\"]")
	private WebElement Create_Media_menu;
	
	@FindBy(xpath = "//*[@id=\"Upload Media Files\"]")
	private WebElement Upload_Media_Files_menu;
	
	@FindBy(xpath = "//*[@id=\"Search Media Files\"]")
	private WebElement Search_Media_Files_menu;
	
	@FindBy(xpath = "//*[@id=\"Campaign\"]/a/span")
	private WebElement Campaign_Menu;
	
	@FindBy(xpath = "//*[@id=\"New Campaign\"]")
	private WebElement New_Campaign_menu;
	
	@FindBy(xpath = "//*[@id=\"Search Campaigns\"]")
	private WebElement Search_Campaign_menu;
	
	@FindBy(xpath = "//*[@id=\"Play Back Logs\"]")
	private WebElement Playback_Logs_menu;
	
	@FindBy(xpath = "//*[@id=\"Terms And Conditions\"]")
	private WebElement Terms_and_Condition_menu;
	
	@FindBy(xpath = "//*[@id=\"Accounts\"]/a/span")
	private WebElement Accounts_Menu;
	
	@FindBy(xpath = "//*[@id=\"Transactions\"]")
	private WebElement Transactions_menu;
	
	@FindBy(xpath = "//*[@id=\"Online Payment\"]")
	private WebElement Online_Payment_menu;
	
	@FindBy(xpath = "//*[@id=\"Weekly Proforma\"]")
	private WebElement Weekly_Performa_menu;
	

	@FindBy(xpath = "//*[@id=\"Reports\"]/a/span")
	private WebElement Reports_Menu;
	
	@FindBy(xpath = "//*[@id=\"Commission Invoice\"]")
	private WebElement Commission_Invoice_menu;
	
	@FindBy(xpath = "//*[@id=\"Campaignwise Ledger Report\"]")
	private WebElement Campaignwise_Ledger_Report_menu;
	
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[4]/header/nav/div/ul/li[3]/ul/li[2]/div[1]/a")
	private WebElement ManageProfile_btn;
	
	@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[4]/header/nav/div/ul/li[3]/ul/li[2]/div[2]/a")
	private WebElement sign_out_btn;
	
	
	// ----------------- Action Methods ------------------
	
	public void logout() {
		profile_btn.click();
		sign_out_btn.click();
	}
	
	
	
	
	
	
	
	
	// ----------------- Getters ------------------
	
	public void clickOn_Element(WebElement element) {
		element.click();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMenuToggle_btn() {
		return menuToggle_btn;
	}

	public WebElement getProfile_btn() {
		return profile_btn;
	}

	public WebElement getAccountBalance_txt() {
		return accountBalance_txt;
	}

	public WebElement getCreditPoints_txt() {
		return creditPoints_txt;
	}

	public WebElement getAdvertiser_Menu() {
		return Advertiser_Menu;
	}

	public WebElement getManage_Advertiser_menu() {
		return Manage_Advertiser_menu;
	}

	public WebElement getTrack_Visit_menu() {
		return Track_Visit_menu;
	}

	public WebElement getCreate_Invoice_menu() {
		return Create_Invoice_menu;
	}

	public WebElement getCreative_Menu() {
		return Creative_Menu;
	}

	public WebElement getCreate_Media_menu() {
		return Create_Media_menu;
	}

	public WebElement getUpload_Media_Files_menu() {
		return Upload_Media_Files_menu;
	}

	public WebElement getSearch_Media_Files_menu() {
		return Search_Media_Files_menu;
	}

	public WebElement getCampaign_Menu() {
		return Campaign_Menu;
	}

	public WebElement getNew_Campaign_menu() {
		return New_Campaign_menu;
	}

	public WebElement getSearch_Campaign_menu() {
		return Search_Campaign_menu;
	}

	public WebElement getPlayback_Logs_menu() {
		return Playback_Logs_menu;
	}

	public WebElement getTerms_and_Condition_menu() {
		return Terms_and_Condition_menu;
	}

	public WebElement getAccounts_Menu() {
		return Accounts_Menu;
	}

	public WebElement getTransactions_menu() {
		return Transactions_menu;
	}

	public WebElement getOnline_Payment_menu() {
		return Online_Payment_menu;
	}

	public WebElement getWeekly_Performa_menu() {
		return Weekly_Performa_menu;
	}

	public WebElement getReports_Menu() {
		return Reports_Menu;
	}

	public WebElement getCommission_Invoice_menu() {
		return Commission_Invoice_menu;
	}

	public WebElement getCampaignwise_Ledger_Report_menu() {
		return Campaignwise_Ledger_Report_menu;
	}

	public WebElement getManageProfile_btn() {
		return ManageProfile_btn;
	}

	public WebElement getSign_out_btn() {
		return sign_out_btn;
	}
	
	
	
}
