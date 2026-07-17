package com.demoapp.testBase;

import java.io.IOException;
import java.sql.SQLException;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import com.demoapp.drivers.DriverFactory;
import com.demoapp.listeners.Listerners_Implimentations;
import com.demoapp.utilities.PropertyUtilities;

@Listeners(Listerners_Implimentations.class)
public class TestBase {

	protected WebDriver basedriver;
	protected static Logger logger;

	@BeforeSuite
	public void connectDatabase() throws SQLException {
		logger = LogManager.getLogger(this.getClass());
		logger.info("Connecting to Database....");
		// Database Connection Logic
		// DBManager.connect();
//		Connection con = DBManager.getConnection();
//		Statement stmt = con.createStatement();
//		stmt.execute("")
		logger.info("Database Connected Successfully");
	}

	@AfterSuite
	public void closeDatabase() {
		logger.info("Closing Database Connection....");
		// DBManager.disconnect();
		logger.info("Database Connection Closed");
	}

	@BeforeMethod
	public void setUp() throws IOException {
		PropertyUtilities propertyUtilities = new PropertyUtilities();
		String browser = propertyUtilities.getData("browser");
		logger.info("Getting browser name from Properties files");
		DriverFactory.initDriver(browser);
		DriverFactory.getDriver().manage().window().maximize();
		logger.info("Maximizing Browser window");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = propertyUtilities.getData("dsaurl");
		logger.info("getting url from properties");
		logger.info("Navigating to URL");
		DriverFactory.getDriver().get(url); // In case of Admin  use "Navigate to URL"

	}

	@AfterMethod
	public void tearDown() throws IOException {
		logger.info("Logging out from UFO Framez Site");
		if (DriverFactory.getDriver() != null) {
			logger.info("closing Chrome browser");
//			DriverFactory.getDriver().quit();
			DriverFactory.quitDriver();
		}
	}

}
