package com.citis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.citi.util.TestUtil;
import com.citis.base.TestBase;

public class LoginPage extends TestBase {

	// PageFactory or OR
	// All Locator
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[@class=\"btn btn-success block full-width\"]")
	WebElement loginBtn;

	@FindBy(xpath = "//img[@class=\"logo\"]")
	WebElement TechFiosLogo;

	// PageFactory
	public LoginPage() {
		PageFactory.initElements(driver, this);// this mean corrent class object

	}
	// All Action

	public String VerifyTitleofloginPage() {
		TestUtil.captureScreenShot(driver, "tt");
		return driver.getTitle();
	}

	public boolean verifyLogo() {

		return TechFiosLogo.isDisplayed();

	}

	public HomePage login1(String un, String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		TestUtil.captureScreenShot(driver, "HomePage");
		return new HomePage();

	}

}
