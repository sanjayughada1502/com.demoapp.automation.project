package com.demoapp.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoapp.drivers.DriverFactory;

public class Image_Page {

	protected WebDriver pagedriver;

	public Image_Page() {
		pagedriver = DriverFactory.getDriver();
		PageFactory.initElements(pagedriver, this);
	}

	@FindBy(xpath = "//section[normalize-space()='Image']")
	private WebElement image_Menu;
	@FindBy(xpath = "//a[normalize-space()='Default']")
	private WebElement default_op;
	@FindBy(xpath = "//a[normalize-space()='Clickable Image']")
	private WebElement clickableImage_op;
	@FindBy(xpath = "//a[normalize-space()='Similar Images']")
	private WebElement similarImages_op;
	@FindBy(xpath = "//a[normalize-space()='Without img Tag']")
	private WebElement withoutImgTag_op;
	@FindBy(xpath = "//a[normalize-space()='Broken Image']")
	private WebElement brokenImage_op;

	@FindBy(xpath = "//img[@title='Image tooltip']")
	private WebElement main_image;

	@FindBy(xpath = "//a[@title='Mens Clothing']//p[@class='text-xl text-white flex items-center justify-center opacity-0 group-hover:opacity-100 transition-opacity absolute inset-0 z-[100]']")
	private WebElement mensClothing_img;
	@FindBy(xpath = "//a[contains(@title,'Womens Clothing')]//p[contains(@class,'text-xl text-white flex items-center justify-center opacity-0 group-hover:opacity-100 transition-opacity absolute inset-0 z-[100]')]")
	private WebElement womensClothing_img;
	@FindBy(xpath = "//a[@href=\"/ui/image/kidClothing\"]")
	private WebElement kidsClothing_img;
	@FindBy(xpath = "//p[normalize-space()='Electronics']")
	private WebElement electronics_img;

	@FindBy(xpath = "//h2[contains(text(),'Mens Casual Premium Slim Fit T-Shirts ')]")
	private WebElement mensClothing_header;

	@FindBy(xpath = "//h2[contains(text(),'Rain Jacket Women Windbreaker Striped Climbing Raincoats')]")
	private WebElement womensClothing_header;

	@FindBy(xpath = "//h2[contains(text(),'Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops')]")
	private WebElement kidsClothing_header;

	@FindBy(xpath = "//h2[contains(text(),'Acer SB220Q bi 21.5 inches Full HD (1920 x 1080) IPS Ultra-Thin')]")
	private WebElement electronics_header;

	@FindBy(xpath = "//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/section[2]/section/a/button")
	private WebElement back_to_clickable_op_page;

	public WebElement getMain_image() {
		return main_image;
	}

	public WebElement getMensClothing_img() {
		return mensClothing_img;
	}

	public WebElement getWomensClothing_img() {
		return womensClothing_img;
	}

	public WebElement getKidsClothing() {
		return kidsClothing_img;
	}

	public WebElement getElectronics() {
		return electronics_img;
	}

	public WebDriver getPagedriver() {
		return pagedriver;
	}

	public WebElement getImage_Menu() {
		return image_Menu;
	}

	public WebElement getDefault_op() {
		return default_op;
	}

	public WebElement getClickableImage_op() {
		return clickableImage_op;
	}

	public WebElement getSimilarImages_op() {
		return similarImages_op;
	}

	public WebElement getWithoutImgTag_op() {
		return withoutImgTag_op;
	}

	public WebElement getBrokenImage_op() {
		return brokenImage_op;
	}

	public WebElement getKidsClothing_img() {
		return kidsClothing_img;
	}

	public WebElement getElectronics_img() {
		return electronics_img;
	}

	public WebElement getMensClothing_header() {
		return mensClothing_header;
	}

	public WebElement getWomensClothing_header() {
		return womensClothing_header;
	}

	public WebElement getKidsClothing_header() {
		return kidsClothing_header;
	}

	public WebElement getElectronics_header() {
		return electronics_header;
	}

	public WebElement getBack_to_clickable_op_page() {
		return back_to_clickable_op_page;
	}

	
}
