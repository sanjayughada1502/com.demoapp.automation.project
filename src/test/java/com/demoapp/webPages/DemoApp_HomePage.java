package com.demoapp.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoapp.drivers.DriverFactory;

public class DemoApp_HomePage {

	protected WebDriver pagedriver;

	public DemoApp_HomePage() {
		pagedriver = DriverFactory.getDriver();
		PageFactory.initElements(pagedriver, this);
	}

	// Demo App Left Hand Side Main Menus

	@FindBy(xpath = "//section[normalize-space()='Web Elements']")
	private WebElement webElements_Menu;
	@FindBy(xpath = "//section[normalize-space()='Text Field']")
	private WebElement textField_Menu;
	@FindBy(xpath = "//section[normalize-space()='Button']")
	private WebElement button_Menu;
	@FindBy(xpath = "//a[normalize-space()='']")
	private WebElement link_Menu;
	@FindBy(xpath = "//section[normalize-space()='Check Box']")
	private WebElement checkBox_Menu;
	@FindBy(xpath = "//section[normalize-space()='Radio Button']")
	private WebElement radioButton_Menu;

	@FindBy(xpath = "//section[normalize-space()='Image']")
	private WebElement image_Menu;
	
	@FindBy(xpath = "//section[normalize-space()='Toggle']")
	private WebElement toggle_Menu;
	@FindBy(xpath = "//section[normalize-space()='Slider']")
	private WebElement slider_Menu;
	@FindBy(xpath = "//section[normalize-space()='Dropdown']")
	private WebElement dropdown_Menu;
	@FindBy(xpath = "//section[normalize-space()='Web Table']")
	private WebElement webTable_Menu;
	@FindBy(xpath = "//section[normalize-space()='FormValidation']")
	private WebElement formValidation_Menu;
	@FindBy(xpath = "//section[normalize-space()='Captcha']")
	private WebElement captcha_Menu;
	@FindBy(xpath = "//section[normalize-space()='Audio']")
	private WebElement audio_Menu;
	@FindBy(xpath = "//section[normalize-space()='Video']")
	private WebElement video_Menu;
	@FindBy(xpath = "//section[normalize-space()='X Path']")
	private WebElement xPath_Menu;
	@FindBy(xpath = "//section[normalize-space()='Popups']")
	private WebElement popups_Menu;
	@FindBy(xpath = "//section[normalize-space()='Date & Time Picker']")
	private WebElement dateTimePicker_Menu;
	@FindBy(xpath = "//section[normalize-space()='Scroll']")
	private WebElement scroll_Menu;
	@FindBy(xpath = "//section[normalize-space()='Synchronization']")
	private WebElement synchronization_Menu;
	@FindBy(xpath = "//body/div/div/div/div/aside/div/div/div/ul/li[7]")
	private WebElement frames_Menu;
	@FindBy(xpath = "//section[normalize-space()='Mouse Actions']")
	private WebElement mouseActions_Menu;
	@FindBy(xpath = "//section[normalize-space()='Keyboard Actions']")
	private WebElement keyboardActions_Menu;
	@FindBy(xpath = "//section[normalize-space()='Shadow Root Elements']")
	private WebElement shadowRootElements_Menu;
	@FindBy(xpath = "//section[normalize-space()='Others']")
	private WebElement others_Menu;

	// Xpath sub-Menus

	@FindBy(xpath = "//section[normalize-space()='Login 1.0']")
	private WebElement login1_menu;
	@FindBy(xpath = "//section[normalize-space()='Login 2.0']")
	private WebElement login2_menu;
	@FindBy(xpath = "//section[normalize-space()='Login 3.0']")
	private WebElement login3_menu;
	@FindBy(xpath = "//section[normalize-space()='Single Elements']")
	private WebElement singleElements_menu;
	@FindBy(xpath = "//section[normalize-space()='Duplicate Elements']")
	private WebElement duplicateElements_menu;
	@FindBy(xpath = "//section[normalize-space()='Ecommerce']")
	private WebElement ecommerce_menu;

	// Popups Sub-Menus

	@FindBy(xpath = "//section[normalize-space()='Javascript']")
	private WebElement javascript_menu;
	@FindBy(xpath = "//section[normalize-space()='Hidden division']")
	private WebElement hiddenDivision_menu;
	@FindBy(xpath = "//section[normalize-space()='Browser Windows']")
	private WebElement browserWindows_menu;
	@FindBy(xpath = "//section[normalize-space()='Authentication']")
	private WebElement authentication_menu;
	@FindBy(xpath = "//section[normalize-space()='File Uploads']")
	private WebElement fileUploads_menu;
	@FindBy(xpath = "//section[normalize-space()='Notifications']")
	private WebElement notifications_menu;
	@FindBy(xpath = "//section[normalize-space()='Download']")
	private WebElement download_menu;

	// DateTime Picker Sub- Menus

	@FindBy(xpath = "//section[normalize-space()='Date Picker']")
	private WebElement datePicker_menu;
	@FindBy(xpath = "//section[normalize-space()='Time Picker']")
	private WebElement timePicker_menu;

	// Scroll Sub-Menus

	@FindBy(xpath = "//a[contains(@class,'pe-1 py-1 font-semibold flex items-center justify-between w-full text-sm whitespace-nowrap ps-3 flex-wrap hover:no-underline active:no-underline focus:no-underline text-black')]")
	private WebElement scroll_menu;

	// Synchronization Sub- menus

	@FindBy(xpath = "//section[normalize-space()='Progress Bar']")
	private WebElement progressBar_menu;
	@FindBy(xpath = "//section[normalize-space()='Page Loading']")
	private WebElement pageLoading_menu;

	// Framez Sub-Menus

	@FindBy(xpath = "//section[contains(@class,'poppins text-[14px]')]")
	private WebElement iframes_menu;

	// Mouse action Sub-Menus

	@FindBy(xpath = "//section[normalize-space()='Drag & Drop']")
	private WebElement dragDrop_menu;
	@FindBy(xpath = "//section[normalize-space()='Mouse Hover']")
	private WebElement mouseHover_menu;
	@FindBy(xpath = "//section[normalize-space()='Click & Hold']")
	private WebElement clickHold_menu;

	// KeyBoard Action Sub-Menus

	@FindBy(xpath = "//section[normalize-space()='Keyboard']")
	private WebElement keyboard_menu;
	@FindBy(xpath = "//section[normalize-space()='Virtual Keyboard']")
	private WebElement virtualKeyboard_menu;

	// Shadow Root Elements Sub-Menus

	@FindBy(xpath = "//section[contains(@class,'poppins text-[14px]')]")
	private WebElement shadowRoot_menu;

	// Other Sub-Menus

	@FindBy(xpath = "//section[normalize-space()='Stale Element']")
	private WebElement staleElement_menu;
	@FindBy(xpath = "//section[normalize-space()='Print']")
	private WebElement print_menu;
	@FindBy(xpath = "//section[normalize-space()='Auto Complete']")
	private WebElement autoComplete_menu;
	@FindBy(xpath = "//section[normalize-space()='Accordion']")
	private WebElement accordion_menu;
	@FindBy(xpath = "//section[normalize-space()='Dynamic Data']")
	private WebElement dynamicData_menu;

	// ----------------- Getters --------------------

	public WebDriver getPagedriver() {
		return pagedriver;
	}

	public WebElement getWebElements_Menu() {
		return webElements_Menu;
	}

	public WebElement getTextField_Menu() {
		return textField_Menu;
	}

	public WebElement getButton_Menu() {
		return button_Menu;
	}

	public WebElement getLink_Menu() {
		return link_Menu;
	}

	public WebElement getCheckBox_Menu() {
		return checkBox_Menu;
	}

	public WebElement getRadioButton_Menu() {
		return radioButton_Menu;
	}

	public WebElement getImage_Menu() {
		return image_Menu;
	}

	public WebElement getToggle_Menu() {
		return toggle_Menu;
	}

	public WebElement getSlider_Menu() {
		return slider_Menu;
	}

	public WebElement getDropdown_Menu() {
		return dropdown_Menu;
	}

	public WebElement getWebTable_Menu() {
		return webTable_Menu;
	}

	public WebElement getFormValidation_Menu() {
		return formValidation_Menu;
	}

	public WebElement getCaptcha_Menu() {
		return captcha_Menu;
	}

	public WebElement getAudio_Menu() {
		return audio_Menu;
	}

	public WebElement getVideo_Menu() {
		return video_Menu;
	}

	public WebElement getxPath_Menu() {
		return xPath_Menu;
	}

	public WebElement getPopups_Menu() {
		return popups_Menu;
	}

	public WebElement getDateTimePicker_Menu() {
		return dateTimePicker_Menu;
	}

	public WebElement getScroll_Menu() {
		return scroll_Menu;
	}

	public WebElement getSynchronization_Menu() {
		return synchronization_Menu;
	}

	public WebElement getFrames_Menu() {
		return frames_Menu;
	}

	public WebElement getMouseActions_Menu() {
		return mouseActions_Menu;
	}

	public WebElement getKeyboardActions_Menu() {
		return keyboardActions_Menu;
	}

	public WebElement getShadowRootElements_Menu() {
		return shadowRootElements_Menu;
	}

	public WebElement getOthers_Menu() {
		return others_Menu;
	}

	public WebElement getLogin1_menu() {
		return login1_menu;
	}

	public WebElement getLogin2_menu() {
		return login2_menu;
	}

	public WebElement getLogin3_menu() {
		return login3_menu;
	}

	public WebElement getSingleElements_menu() {
		return singleElements_menu;
	}

	public WebElement getDuplicateElements_menu() {
		return duplicateElements_menu;
	}

	public WebElement getEcommerce_menu() {
		return ecommerce_menu;
	}

	public WebElement getJavascript_menu() {
		return javascript_menu;
	}

	public WebElement getHiddenDivision_menu() {
		return hiddenDivision_menu;
	}

	public WebElement getBrowserWindows_menu() {
		return browserWindows_menu;
	}

	public WebElement getAuthentication_menu() {
		return authentication_menu;
	}

	public WebElement getFileUploads_menu() {
		return fileUploads_menu;
	}

	public WebElement getNotifications_menu() {
		return notifications_menu;
	}

	public WebElement getDownload_menu() {
		return download_menu;
	}

	public WebElement getDatePicker_menu() {
		return datePicker_menu;
	}

	public WebElement getTimePicker_menu() {
		return timePicker_menu;
	}

	public WebElement getScroll_menu() {
		return scroll_menu;
	}

	public WebElement getProgressBar_menu() {
		return progressBar_menu;
	}

	public WebElement getPageLoading_menu() {
		return pageLoading_menu;
	}

	public WebElement getIframes_menu() {
		return iframes_menu;
	}

	public WebElement getDragDrop_menu() {
		return dragDrop_menu;
	}

	public WebElement getMouseHover_menu() {
		return mouseHover_menu;
	}

	public WebElement getClickHold_menu() {
		return clickHold_menu;
	}

	public WebElement getKeyboard_menu() {
		return keyboard_menu;
	}

	public WebElement getVirtualKeyboard_menu() {
		return virtualKeyboard_menu;
	}

	public WebElement getShadowRoot_menu() {
		return shadowRoot_menu;
	}

	public WebElement getStaleElement_menu() {
		return staleElement_menu;
	}

	public WebElement getPrint_menu() {
		return print_menu;
	}

	public WebElement getAutoComplete_menu() {
		return autoComplete_menu;
	}

	public WebElement getAccordion_menu() {
		return accordion_menu;
	}

	public WebElement getDynamicData_menu() {
		return dynamicData_menu;
	}

}
