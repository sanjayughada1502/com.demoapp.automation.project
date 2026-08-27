package com.demoapp.webPages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoapp.drivers.DriverFactory;

public class WebTable_Page {

	protected WebDriver pagedriver;

	public WebTable_Page() {
		pagedriver = DriverFactory.getDriver();
		PageFactory.initElements(pagedriver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Static Web Table']")
	private WebElement staticWebTable;
	@FindBy(xpath = "//a[normalize-space()='Dynamic Web Table']")
	private WebElement dynamicWebTable;
	@FindBy(xpath = "//a[normalize-space()='Table With Sort']")
	private WebElement tableWithSort;
	@FindBy(xpath = "//a[normalize-space()='Table Pagination']")
	private WebElement tablePagination;
	@FindBy(xpath = "//a[normalize-space()='Table With Checkbox']")
	private WebElement tableWithCheckbox;
	@FindBy(xpath = "//a[normalize-space()='Multiple Table']")
	private WebElement multipleTable;

	@FindBy(xpath = "//a[normalize-space()='Purchased Items']")
	private WebElement purchasedItems_Tab;

	@FindBy(xpath = "//th[normalize-space()='Item name']")
	private WebElement itemName_header;
	@FindBy(xpath = "//th[normalize-space()='Rating']")
	private WebElement rating_header;
	@FindBy(xpath = "//th[normalize-space()='Quantity']")
	private WebElement quantity_header;
	@FindBy(xpath = "//th[normalize-space()='Discount']")
	private WebElement discount_header;
	@FindBy(xpath = "//th[normalize-space()='Price']")
	private WebElement price_header;

	// getters

	public WebDriver getPagedriver() {
		return pagedriver;
	}

	public WebElement getStaticWebTable() {
		return staticWebTable;
	}

	public WebElement getDynamicWebTable() {
		return dynamicWebTable;
	}

	public WebElement getTableWithSort() {
		return tableWithSort;
	}

	public WebElement getTablePagination() {
		return tablePagination;
	}

	public WebElement getTableWithCheckbox() {
		return tableWithCheckbox;
	}

	public WebElement getMultipleTable() {
		return multipleTable;
	}

	public WebElement getPurchasedItems_Tab() {
		return purchasedItems_Tab;
	}

	public WebElement getItemName_header() {
		return itemName_header;
	}

	public WebElement getRating_header() {
		return rating_header;
	}

	public WebElement getQuantity_header() {
		return quantity_header;
	}

	public WebElement getDiscount_header() {
		return discount_header;
	}

	public WebElement getPrice_header() {
		return price_header;
	}

	// Action Methods

	public List<String> getPurchasedItemsTables_headerNames() {

		List<String> headerList = new ArrayList<String>();

		List<WebElement> headers = DriverFactory.getDriver()
				.findElements(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div/table/thead"));
		for (WebElement header : headers) {
			String headerName = header.getText();
			headerList.add(headerName);
		}
		return headerList;
	}

	public int getPurchasedItemsTables_rowCount() {
		List<WebElement> rows = DriverFactory.getDriver()
				.findElements(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div/table/tbody/tr"));
		int rowCount = rows.size();
		return rowCount;
	}

	public int getPurchasedItemsTables_columnCount() {
		List<WebElement> column = DriverFactory.getDriver()
				.findElements(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div/table/thead/tr/th"));
		int columnCount = column.size();
		return columnCount;
	}

	public List<String> getPurchasedItemsTables_rows_Data() {
		List<String> raws_data = new ArrayList<String>();

		List<WebElement> rows = DriverFactory.getDriver()
				.findElements(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div/table/tbody/tr"));
		for (WebElement row : rows) {
			String data = row.getText();
			raws_data.add(data);
		}
		return raws_data;
	}

	public List<String> getItemPrice_from_webTable() {
		List<String> rowdata = getPurchasedItemsTables_rows_Data();
		List<String> prices = new ArrayList<>();

		for (int i = 1; i <= rowdata.size(); i++) {

			String text = DriverFactory.getDriver().findElement(By
					.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div/table/tbody/tr[" + i + "]/td[4]"))
					.getText();
			prices.add(text);

		}
		return prices;
	}

}
