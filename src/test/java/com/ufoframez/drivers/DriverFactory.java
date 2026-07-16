package com.ufoframez.drivers;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	private DriverFactory() {
	}

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	/**
	 * Returns Driver Instance for Current Thread
	 */
	public static WebDriver getDriver() {

		if (driver.get() == null) {
			throw new RuntimeException("Driver is not initialized. Call initDriver() first.");
		}
		return driver.get();
	}

	/**
	 * Initialize Browser
	 * @return 
	 */
	public static WebDriver initDriver(String browser) {

		WebDriver webDriver;

		switch (browser.toLowerCase()) {

		case "chrome":

			ChromeOptions options = new ChromeOptions();
			// Disable notifications using preferences
			Map<String, Object> prefs = new HashMap<>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			options.setExperimentalOption("prefs", prefs);

			webDriver = new ChromeDriver(options);
			break;
			

		case "chrome-headless":

			ChromeOptions headlessChrome = new ChromeOptions();

			headlessChrome.addArguments("--headless=new");
			headlessChrome.addArguments("--disable-gpu");
			headlessChrome.addArguments("--window-size=1920,1080");

			webDriver = new ChromeDriver(headlessChrome);

			break;

		case "edge":

			EdgeOptions edgeOptions = new EdgeOptions();

			webDriver = new EdgeDriver(edgeOptions);

			break;

		case "firefox":

			FirefoxOptions firefoxOptions = new FirefoxOptions();

			webDriver = new FirefoxDriver(firefoxOptions);

			break;

		default:

			throw new RuntimeException("Invalid Browser : " + browser);
		}

		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.set(webDriver);
		return webDriver;
	}

	/**
	 * Quit Driver
	 */
	public static void quitDriver() {

		if (driver.get() != null) {

			driver.get().quit();

			driver.remove();
		}
	}
}