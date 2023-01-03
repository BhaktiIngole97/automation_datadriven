package com.fb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fb.qa.pages.LoginPage;
import com.fb.qa.utility.TestUtil;

import bs_baseclass.base_class;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LoginPageTest extends base_class {
	public static LoginPage loginpage;

	public static String sheetname = "Book1";

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		intialization();
		loginpage = new LoginPage();
//		getTest = new GetTestData();
	}

	@DataProvider
	public Object[][] getLoginTestData() {
		Object data[][] = TestUtil.getTestData(sheetname);
		return data;
	}

	@Test(dataProvider = "getLoginTestData")
	@Description("multiple user login...")
	@Severity(SeverityLevel.CRITICAL)
	@Feature("login : 2")
	@Story("Muliple facebook user login... ")
	public void multipleLoginTest(String username, String password) {
		loginpage.multipleLogin(username, password);
	}

	@Test
	@Description("single user login...")
	@Severity(SeverityLevel.CRITICAL)
	@Feature("login : 2")
	@Story("Indivisual facebook user login... ")

	public void loginTest() throws InterruptedException {
		loginpage.login(prop.getProperty("email"), prop.getProperty("password"));

	}

	@Test
	@Description("crate user account...")
	@Severity(SeverityLevel.CRITICAL)
	@Feature("create account : 1")
	@Story("creating facebook user account... ")

	public void createAccTest() {
		loginpage.switchToCreateAcc();
	}

	@Test
	@Description("forget user password...")
	@Severity(SeverityLevel.CRITICAL)
	@Feature("forget pass : 1")
	@Story("forgeting facebook user account pass... ")

	public void switchToForgetPass() {
		loginpage.forgotPassword();

	}

}
