package com.fb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.pages.ForgtPwd;
import com.fb.qa.pages.LoginPage;

import bs_baseclass.base_class;

public class ForgetPwdTest extends base_class{
	LoginPage loginPage;
	ForgtPwd forgetPass;

	public ForgetPwdTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		intialization();
		loginPage = new LoginPage();
		forgetPass = new ForgtPwd();
		loginPage.forgotPassword();
	}

	@Test
	public void login() throws InterruptedException {
		forgetPass.loginFromForgtPage(prop.getProperty("email"), prop.getProperty("password"));
//		driver.close();
	}

	
	


}



