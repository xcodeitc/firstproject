package com.citis.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.citi.util.TestUtil;
import com.citis.base.TestBase;
import com.citis.pages.HomePage;
import com.citis.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;

	public LoginPageTest() {
		super();
	}

	// initialization
	@BeforeMethod
	public void setUp() {
		initialization1();
		loginpage = new LoginPage();
		testutil = new TestUtil();
	}

	@Test(priority = 1)
	public void loginPageTitle() {
		//TestUtil.captureScreenShot(driver, "hhh");
		String title = loginpage.VerifyTitleofloginPage();
		Assert.assertEquals(title, "Login - TechFios Test Application - Billing");

	}

	@Test(priority = 2)

	public void LogoimmageTest() {
		
		boolean logo = loginpage.verifyLogo();
		Assert.assertTrue(logo);

	}

	@Test(priority = 3)

	public void loginTest() {
		homepage = loginpage.login1(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
