package com.demoapp.testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoapp.drivers.DriverFactory;
import com.demoapp.extendreports.ExtentTestManager;
import com.demoapp.listeners.Listerners_Implimentations;
import com.demoapp.testBase.TestBase;
import com.demoapp.utilities.GetDataFromExcelSheet;
import com.demoapp.webPages.DemoApp_HomePage;
import com.demoapp.webPages.WebTable_Page;

@Listeners(Listerners_Implimentations.class)
public class WebTable extends TestBase {

	@Test(priority = 1, groups = { "Smoke" })
	public void WT001_Verify_WebTable_is_displayed() {
		// Table should be visible with correct headers and data

		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getWebTable_Menu().click();
		ExtentTestManager.getTest().info("Clicked on WebTable Menu");
		WebTable_Page page = new WebTable_Page();
		page.getStaticWebTable().click();
		ExtentTestManager.getTest().info("Clicked on Static Web Table Option Menu");
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.getPurchasedItems_Tab()));

		SoftAssert asserts = new SoftAssert();
		ExtentTestManager.getTest().info("Getting Table Headers Name");
		List<String> tableHeaders = page.getPurchasedItemsTables_headerNames();
		for (String header : tableHeaders) {
			logger.info("Header Name :" + header);
			logger.info("Validating weather Header is Blank");
			asserts.assertFalse(header.isBlank());
			// asserts.assertFalse(header.contains("Item name") ||header.contains("Rating")
			// ||header.contains("Quantity")||header.contains("Discount")||header.contains("Price"));
		}
		ExtentTestManager.getTest().info("Getting Table Raws Data");
		List<String> tableData = page.getPurchasedItemsTables_rows_Data();
		for (String data : tableData) {
			logger.info("Row Data : " + data);
			logger.info("Validating weather Row Data is Blank");
			asserts.assertFalse(data.isBlank());
		}
		ExtentTestManager.getTest().info("Web Table visible with correct headers and data..");
		asserts.assertAll();
	}

	@Test(priority = 2, groups = { "Smoke" })
	public void WT002_Verify_total_number_of_rows() {
		// Actual row count should match the expected count
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getWebTable_Menu().click();
		ExtentTestManager.getTest().info("Clicked on WebTable Menu");
		WebTable_Page page = new WebTable_Page();
		page.getStaticWebTable().click();
		ExtentTestManager.getTest().info("Clicked on Static Web Table Option Menu");
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.getPurchasedItems_Tab()));

		SoftAssert asserts = new SoftAssert();
		ExtentTestManager.getTest().info("Getting Table Row Count");
		int rowCount = page.getPurchasedItemsTables_rowCount();
		logger.info("Row Count is :" + rowCount);
		// System.out.println("Row Count is :" + rowCount);
		ExtentTestManager.getTest().info("Verifiying Table Row Count with expected Row Count");
		asserts.assertTrue(rowCount == 4);
		asserts.assertAll();
	}

	@Test(priority = 3, groups = { "Smoke" })
	public void WT003_Verify_total_number_of_columns() {
		// Actual row count should match the expected count
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getWebTable_Menu().click();
		ExtentTestManager.getTest().info("Clicked on WebTable Menu");
		WebTable_Page page = new WebTable_Page();
		page.getStaticWebTable().click();
		ExtentTestManager.getTest().info("Clicked on Static Web Table Option Menu");
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.getPurchasedItems_Tab()));

		SoftAssert asserts = new SoftAssert();
		ExtentTestManager.getTest().info("Getting Table Column Count");
		int columnCount = page.getPurchasedItemsTables_columnCount();
		logger.info("Row Count is :" + columnCount);
		// System.out.println("Row Count is :" + rowCount);
		ExtentTestManager.getTest().info("Verifiying Table Column Count with expected Column Count");
		asserts.assertTrue(columnCount == 5);
		asserts.assertAll();
	}

	@Test(priority = 4, groups = { "Smoke" })
	public void WT004_Verify_data_in_a_specific_row() {
		// Expected data should be displayed in the selected row
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getWebTable_Menu().click();
		ExtentTestManager.getTest().info("Clicked on WebTable Menu");
		WebTable_Page page = new WebTable_Page();
		page.getStaticWebTable().click();
		ExtentTestManager.getTest().info("Clicked on Static Web Table Option Menu");
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.getPurchasedItems_Tab()));

		SoftAssert asserts = new SoftAssert();
		ExtentTestManager.getTest().info("Getting Table Row data");
		List<String> rowData = page.getPurchasedItemsTables_rows_Data();
		for (int i = 0; i < rowData.size(); i++) {
			switch (i) {
			case 0:
				// rowData.get(i).toString().contains("Levis Shirt");
				ExtentTestManager.getTest().info("Validating Row 1 Data");
				String value1 = rowData.get(i);
				String expectedRowdata = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx", "WebTable", 1, 2);
				asserts.assertTrue(value1.contains(expectedRowdata));
				continue;
			case 1:
				// rowData.get(i).toString().contains("Levis Shirt");
				ExtentTestManager.getTest().info("Validating Row 2 Data");
				String value2 = rowData.get(i);
				String expectedRowdata2 = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx", "WebTable", 2, 2);
				asserts.assertTrue(value2.contains(expectedRowdata2));
				continue;
			case 2:
				// rowData.get(i).toString().contains("Levis Shirt");
				ExtentTestManager.getTest().info("Validating Row 3 Data");
				String value3 = rowData.get(i);
				String expectedRowdata3 = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx", "WebTable", 3, 2);
				asserts.assertTrue(value3.contains(expectedRowdata3));
				continue;
			case 3:
				// rowData.get(i).toString().contains("Levis Shirt");
				ExtentTestManager.getTest().info("Validating Row 4 Data");
				String value4 = rowData.get(i);
				String expectedRowdata4 = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx", "WebTable", 4, 2);
				asserts.assertTrue(value4.contains(expectedRowdata4));
				continue;
			}

			break;
		}
		asserts.assertAll();
	}
	
	
	@Test(priority = 5, groups = { "Smoke" , "Functional"})
	public void WT005_Verify_Item_Price_in_Table() {
		// Item Price should be as Expected as per the Excel Sheet
		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getWebTable_Menu().click();
		ExtentTestManager.getTest().info("Clicked on WebTable Menu");
		WebTable_Page page = new WebTable_Page();
		page.getStaticWebTable().click();
		ExtentTestManager.getTest().info("Clicked on Static Web Table Option Menu");
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.getPurchasedItems_Tab()));
		SoftAssert asserts = new SoftAssert();
		ExtentTestManager.getTest().info("Getting Item Price From WebTable");
		List<String> item_prices = page.getItemPrice_from_webTable();
		int row = 1;
		for(String value : item_prices) {
			System.out.println(value);
			logger.info("Fetching Expected Price from Excel Sheet");
			String expectedRowdata = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx", "WebTable", row, 3);
			System.out.println(expectedRowdata);
			ExtentTestManager.getTest().info("Validating Actual and Expected Price");
			asserts.assertEquals(value, expectedRowdata);
			row++;
		}
	}
}
