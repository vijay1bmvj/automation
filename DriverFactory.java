package com.instalanes.factory;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public WebDriver initializeDriver(String browser) {
		WebDriver driver;
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//driver.get("https://frontendnewopt.vercel.app/login");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		// Add more cases for other browsers (e.g., Safari, Edge)
		default:
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}

		return driver;
	}
}
