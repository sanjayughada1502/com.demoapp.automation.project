package com.demoapp.testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
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
				String expectedRowdata = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx",
						"WebTable", 1, 2);
				asserts.assertTrue(value1.contains(expectedRowdata));
				continue;
			case 1:
				// rowData.get(i).toString().contains("Levis Shirt");
				ExtentTestManager.getTest().info("Validating Row 2 Data");
				String value2 = rowData.get(i);
				String expectedRowdata2 = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx",
						"WebTable", 2, 2);
				asserts.assertTrue(value2.contains(expectedRowdata2));
				continue;
			case 2:
				// rowData.get(i).toString().contains("Levis Shirt");
				ExtentTestManager.getTest().info("Validating Row 3 Data");
				String value3 = rowData.get(i);
				String expectedRowdata3 = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx",
						"WebTable", 3, 2);
				asserts.assertTrue(value3.contains(expectedRowdata3));
				continue;
			case 3:
				// rowData.get(i).toString().contains("Levis Shirt");
				ExtentTestManager.getTest().info("Validating Row 4 Data");
				String value4 = rowData.get(i);
				String expectedRowdata4 = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx",
						"WebTable", 4, 2);
				asserts.assertTrue(value4.contains(expectedRowdata4));
				continue;
			}

			break;
		}
		asserts.assertAll();
	}

	@Test(priority = 5, groups = { "Smoke", "Functional" })
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
		for (String value : item_prices) {
			System.out.println(value);
			logger.info("Fetching Expected Price from Excel Sheet");
			String expectedRowdata = GetDataFromExcelSheet.getCellData("./test-data/demoapp-test-data.xlsx", "WebTable",
					row, 3);
			System.out.println(expectedRowdata);
			ExtentTestManager.getTest().info("Validating Actual and Expected Price");
			asserts.assertEquals(value, expectedRowdata);
			row++;
		}
	}

	@Test(priority = 6, groups = { "Functional", "Regression" })
	public void WT006_Verify_Dynamic_Item_Price_in_Table() {

		DemoApp_HomePage home = new DemoApp_HomePage();
		home.getWebTable_Menu().click();
		ExtentTestManager.getTest().info("Clicked on WebTable Menu");
		WebTable_Page page = new WebTable_Page();
		page.getDynamicWebTable().click();
		ExtentTestManager.getTest().info("Clicked on Dynamic Web Table Option Menu");
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(page.getFaverate_Items_Tab()));
		SoftAssert asserts = new SoftAssert();
		ExtentTestManager.getTest().info("Getting Dynamic Item Price From WebTable");
		String previous_levis_shirt_price = page.getDynamic_Levis_Shirt_price_txt().getText();
		String previous_Samsang_price = page.getDynamic_Samsung_Galaxy_price_txt().getText();
		String previous_Apple_iphone_price = page.getDynamic_Apple_iPhone_price_txt().getText();
		String previous_HPEnvy_price = page.getDynamic_HP_Envy_price_txt().getText();
		System.out.println("Current Levis Shirt Price" + page.getDynamic_Levis_Shirt_price_txt().getText());
		System.out.println("Current Samsung Galaxy Price" + page.getDynamic_Samsung_Galaxy_price_txt().getText());
		System.out.println("Current Apple Iphone Price" + page.getDynamic_Apple_iPhone_price_txt().getText());
		System.out.println("Current HP Envy Price" + page.getDynamic_HP_Envy_price_txt().getText());
		asserts.assertFalse(page.getDynamic_Levis_Shirt_price_txt().getText().isEmpty(), "Levis Shirt Price is Empty");
		asserts.assertFalse(page.getDynamic_Samsung_Galaxy_price_txt().getText().isEmpty(),
				"Samsung Galaxy Price is Empty");
		asserts.assertFalse(page.getDynamic_Apple_iPhone_price_txt().getText().isEmpty(),
				"Apple Iphone Price is Empty");
		asserts.assertFalse(page.getDynamic_HP_Envy_price_txt().getText().isEmpty(), "HP Envy Price is Empty");

//		String current_levis_shirt_price = page.getDynamic_Levis_Shirt_price_txt().getText();
//		String current_samsung_price = page.getDynamic_Samsung_Galaxy_price_txt().getText();
//		String current_apple_iphone_price = page.getDynamic_Apple_iPhone_price_txt().getText();
//		String current_HP_Envy_price = page.getDynamic_HP_Envy_price_txt().getText();
		/* * Wait until at least one price changes. * Maximum wait = 5 seconds. */
		long startTime = System.currentTimeMillis();
		long timeout = 5000;
		boolean priceChanged = false;
		while (System.currentTimeMillis() - startTime < timeout) {
			// IMPORTANT: // Read the current values INSIDE the loop.
			String currentLevisShirtPrice = page.getDynamic_Levis_Shirt_price_txt().getText();
			String currentSamsungPrice = page.getDynamic_Samsung_Galaxy_price_txt().getText();
			String currentAppleIphonePrice = page.getDynamic_Apple_iPhone_price_txt().getText();
			String currentHPEnvyPrice = page.getDynamic_HP_Envy_price_txt().getText();
			// Check Levis price
			if (!currentLevisShirtPrice.equals(previous_levis_shirt_price)) {
				System.out.println("Dynamic Levis Shirt Price: " + currentLevisShirtPrice);
				ExtentTestManager.getTest().info("Levis Shirt price changed from " + previous_levis_shirt_price + " to "
						+ currentLevisShirtPrice);
				priceChanged = true;
			}
			// Check Samsung price
			if (!currentSamsungPrice.equals(previous_Samsang_price)) {
				System.out.println("Dynamic Samsung Price: " + currentSamsungPrice);
				ExtentTestManager.getTest().info(
						"Samsung Galaxy price changed from " + previous_Samsang_price + " to " + currentSamsungPrice);
				priceChanged = true;
			}
			// Check Apple price
			if (!currentAppleIphonePrice.equals(previous_Apple_iphone_price)) {
				System.out.println("Dynamic Apple Iphone Price: " + currentAppleIphonePrice);
				ExtentTestManager.getTest().info("Apple Iphone price changed from " + previous_Apple_iphone_price
						+ " to " + currentAppleIphonePrice);
				priceChanged = true;
			}
			// Check HP price
			if (!currentHPEnvyPrice.equals(previous_HPEnvy_price)) {
				System.out.println("Dynamic HP Envy Price: " + currentHPEnvyPrice);
				ExtentTestManager.getTest()
						.info("HP Envy price changed from " + previous_HPEnvy_price + " to " + currentHPEnvyPrice);
				priceChanged = true;
			}
			// Stop loop when any price changes
			if (priceChanged) {
				break;
			}
		}
		asserts.assertTrue(priceChanged, "None of the item prices changed within 5 seconds");
		asserts.assertAll();
	}
}
