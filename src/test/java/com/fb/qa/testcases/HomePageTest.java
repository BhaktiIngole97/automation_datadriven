package com.fb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;

import bs_baseclass.base_class;

public class HomePageTest extends base_class {
	LoginPage loginPage;
	public HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		intialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}

	@Test
	public void friendPageTest() {
		
			
			loginPage.login(prop.getProperty("email"), prop.getProperty("password"));

		homePage.switchToFriedPage();
	}
}


