package com.demoapp.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demoapp.drivers.DriverFactory;

public class Dropdown_Page {

	protected WebDriver pagedriver;

	public Dropdown_Page() {
		pagedriver = DriverFactory.getDriver();
		PageFactory.initElements(pagedriver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Single Select']")
	private WebElement singleSelect_op;
	@FindBy(xpath = "//a[normalize-space()='Multi Select']")
	private WebElement multiSelect_op;
	@FindBy(xpath = "//a[normalize-space()='Search With Select']")
	private WebElement searchWithSelect_op;
	@FindBy(xpath = "//a[normalize-space()='Disabled']")
	private WebElement disabled_op;

	@FindBy(xpath = "//select[@id='country_code']")
	private WebElement counteryCode_dpdwn;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement number_tbx;
	@FindBy(xpath = "//input[@id='male']")
	private WebElement male_radio;
	@FindBy(xpath = "//input[@id='female']")
	private WebElement female_radio;
	@FindBy(xpath = "//input[@id='other']")
	private WebElement other_radio;
	@FindBy(xpath = "//select[@id='select3']")
	private WebElement selectCountry_dpdwn;
	@FindBy(xpath = "//select[@id='select5']")
	private WebElement selectState_dpdwn;
	
	@FindBy(xpath = "(//select[contains(@class,'border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150')])[3]")
	private WebElement selectCity_dpdwn;


	@FindBy(xpath = "//select[@id='select7']")
	private WebElement selectQTY__dpdwn;
	@FindBy(xpath = "//button[@id='continuebtn']")
	private WebElement continue_btn;

	@FindBy(xpath = "//p[normalize-space()='Number is required']")
	private WebElement numberIsRequired;
	@FindBy(xpath = "//p[normalize-space()='Gender is required']")
	private WebElement genderIsRequired;
	@FindBy(xpath = "//p[normalize-space()='Country is required']")
	private WebElement countryIsRequired;
	@FindBy(xpath = "//p[normalize-space()='State is required']")
	private WebElement stateIsRequired;

	@FindBy(xpath = "//p[contains(@class,'pe-6')]")
	private WebElement product_qty;
	@FindBy(xpath = "(//p[@class='ps-2'])[2]")
	private WebElement product_rate;
	@FindBy(xpath = "(//p[contains(@class,'font-bold')])[2]")
	private WebElement product_total;

	@FindBy(xpath = "//select[@id='select-multiple-native']")
	private WebElement MultiSelect_Product_List_dpdwn;
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement add_btn;

	@FindBy(xpath = "//div[contains(@class,'css-t3ipsp-control')]//div[contains(@class,'css-19bb58m')]")
	private WebElement Search_Phone_Mdpdwn;
	@FindBy(xpath = "//input[@id='selectPhone']")
	private WebElement enterYourNumber_Mdpdwn;
	@FindBy(xpath = "//div[@class=' css-t3ipsp-control']//div[@class=' css-19bb58m']")
	private WebElement selectGender_Mdpdwn;
	@FindBy(xpath = "//div[contains(@class,'css-t3ipsp-control')]//div[contains(@class,'css-19bb58m')]")
	private WebElement Country_Mdpdwn;
	@FindBy(xpath = "//div[contains(@class,'css-t3ipsp-control')]//div[contains(@class,'css-hlgwow')]")
	private WebElement State_Mdpdwn;
	@FindBy(xpath = "//div[contains(@class,'css-t3ipsp-control')]//div[contains(@class,'css-19bb58m')]")
	private WebElement City_Mdpdwn;
	@FindBy(xpath = "//div[contains(@class,'css-t3ipsp-control')]//div[contains(@class,'css-hlgwow')]")
	private WebElement Qty__Mdpdwn;

	public WebDriver getPagedriver() {
		return pagedriver;
	}

	public WebElement getSingleSelect_op() {
		return singleSelect_op;
	}

	public WebElement getMultiSelect_op() {
		return multiSelect_op;
	}

	public WebElement getSearchWithSelect_op() {
		return searchWithSelect_op;
	}

	public WebElement getDisabled_op() {
		return disabled_op;
	}

	public WebElement getCounteryCode_dpdwn() {
		return counteryCode_dpdwn;
	}

	public WebElement getNumber_dpdwn() {
		return number_tbx;
	}

	public WebElement getMale_radio() {
		return male_radio;
	}

	public WebElement getFemale_radio() {
		return female_radio;
	}

	public WebElement getOther_radio() {
		return other_radio;
	}

	public WebElement getSelectCountry_dpdwn() {
		return selectCountry_dpdwn;
	}

	public WebElement getSelectState_dpdwn() {
		return selectState_dpdwn;
	}

	public WebElement getSelectCity_dpdwn() {
		return selectCity_dpdwn;
	}

	public WebElement getSelectQTY__dpdwn() {
		return selectQTY__dpdwn;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

	public WebElement getNumberIsRequired() {
		return numberIsRequired;
	}

	public WebElement getGenderIsRequired() {
		return genderIsRequired;
	}

	public WebElement getCountryIsRequired() {
		return countryIsRequired;
	}

	public WebElement getStateIsRequired() {
		return stateIsRequired;
	}

	public WebElement getProduct_qty() {
		return product_qty;
	}

	public WebElement getProduct_rate() {
		return product_rate;
	}

	public WebElement getProduct_total() {
		return product_total;
	}

	public WebElement getMultiSelect_Product_List_dpdwn() {
		return MultiSelect_Product_List_dpdwn;
	}

	public WebElement getAdd_btn() {
		return add_btn;
	}

	public WebElement getSearch_Phone_Mdpdwn() {
		return Search_Phone_Mdpdwn;
	}

	public WebElement getEnterYourNumber_Mdpdwn() {
		return enterYourNumber_Mdpdwn;
	}

	public WebElement getSelectGender_Mdpdwn() {
		return selectGender_Mdpdwn;
	}

	public WebElement getCountry_Mdpdwn() {
		return Country_Mdpdwn;
	}

	public WebElement getState_Mdpdwn() {
		return State_Mdpdwn;
	}

	public WebElement getCity_Mdpdwn() {
		return City_Mdpdwn;
	}

	public WebElement getQty__Mdpdwn() {
		return Qty__Mdpdwn;
	}

	// ------------- Action Methods -------------------
	/**
	 * This action Method will select the mentioned details in dropdown by
	 * 'VisibleText'
	 * 
	 * @param code
	 * @param phone
	 * @param isMale
	 * @param country
	 * @param state
	 * @param city
	 */
	public void fill_Delivery_Details_in_Single_Select_Section(String code, String phone, boolean isMale,
			String country, String state, String city) {

		Select counterycode = new Select(counteryCode_dpdwn);
		counterycode.selectByContainsVisibleText(code);

		// number_tbx
		number_tbx.sendKeys(phone);
		// male_radio
		if (isMale == true) {
			male_radio.click();
		} else if (isMale == false) {
			female_radio.click();
		} else {
			other_radio.click();
		}

		Select countrydp = new Select(selectCountry_dpdwn);
		countrydp.selectByContainsVisibleText(country);

		Select statedp = new Select(selectState_dpdwn);
		statedp.selectByContainsVisibleText(state);

		Select citydp = new Select(selectCity_dpdwn);
		citydp.selectByContainsVisibleText(city);

	}

}
