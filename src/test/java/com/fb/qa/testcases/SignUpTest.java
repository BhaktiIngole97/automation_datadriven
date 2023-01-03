package com.fb.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.pages.LoginPage;
import com.fb.qa.pages.SignUpPage;

import bs_baseclass.base_class;

	public class SignUpTest extends base_class{ 
		public SignUpPage signup;
		public LoginPage login;
		
		public SignUpTest() {
			super();
		}
		
		@BeforeMethod
		public void setup() {
		 intialization();
		 signup = new SignUpPage();
		 
		 login = new LoginPage();
		 login.switchToCreateAcc();
		}
		@Test
		public void signUp() {
			signup.Signup(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"),
					prop.getProperty("confirm_email"), prop.getProperty("password"), prop.getProperty("birthday"),
					prop.getProperty("month"), prop.getProperty("year"));
		}
	}


