package com.instalanes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	private WebDriver driver;

	public SignupPage(WebDriver driver) {
//		DriverFactory df = new DriverFactory();
//		df.initializeDriver("browser");
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "outlined-firstName")
	WebElement fsNme;

	@FindBy(id = "outlined-lastName")
	WebElement lsNme;

	@FindBy(id = "outlined-select-role")
	WebElement orgSele;

	@FindBy(xpath = "//li[text()='Logistic service provider']")
	WebElement orgSeleOp;

	@FindBy(xpath = "//div[contains(@class,'css-19vq1m8')]//div[contains(@role,'button')]")
	WebElement codeDrp;
	// @FindBy(xpath="//div[@class='MuiInputBase-root MuiOutlinedInput-root
	// MuiInputBase-colorPrimary MuiInputBase-sizeSmall css-19vq1m8']")
	// WebElement codeDrp;

	@FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-14ssgay']")
	WebElement codeOpt;

	@FindBy(id = "outlined-phone")
	WebElement phNum;

	@FindBy(id = "outlined-email")
	WebElement emailTxt;

	@FindBy(id = "outlined-password")
	WebElement passTxt;

	@FindBy(id = "mui-2")
	WebElement sigBttn;

	@FindBy(xpath = "//input[@type='password']")
	WebElement btnLgot;

	public void setFrstName(String Firstname) {
		fsNme.sendKeys(Firstname);
	}

	public void setLstName(String Lastname) {
		lsNme.sendKeys(Lastname);
	}

	public void dpOrg() {
		orgSele.click();
	}

	public void dpOrgSel() {
		orgSeleOp.click();
	}

	public void codeDp() {
		codeDrp.click();
	}

	public void codeDpSel() {
		codeOpt.click();

	}

	public void phNum(String number) {
		phNum.sendKeys(number);
	}

	public void emailTxt(String email) {
		emailTxt.sendKeys(email);
	}

	public void passTxt(String password) {
		passTxt.sendKeys(password);
	}

	public void signup() {
		sigBttn.click();
	}

	public void logOut() {
		btnLgot.click();
	}

}
