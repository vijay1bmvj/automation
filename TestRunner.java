package com.instalanes.testrunner;
//import org.openqa.selenium.WebDriver;
//
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
//
//import com.instalanes.factory.DriverFactory;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "src/test/resources/features", 
glue = {"com.instalanes.stepdefinitions"}, dryRun = false, plugin = {
		"pretty",
		"html:/instalanes/test-output/cucumber-reports/CucumberReport.html" },tags = "@sm" , monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
//	WebDriver driver;
//	@Parameters({"browser"})
//	@BeforeTest
//	public void beforeTest(String browser) {
//		DriverFactory driverFactory = new DriverFactory();
//		driverFactory.initializeDriver(browser);
//		
//	
//	}
// 
//
//	
//@AfterTest
//public void tearDown() {
//	WebDriver driver = this.driver;
//	driver.quit();
//}
}




