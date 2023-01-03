package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bs_baseclass.base_class;

public class LoginPage extends base_class {

	@FindBy(name = "email")
	WebElement emailid;

	@FindBy(name = "pass")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;

	@FindBy(xpath = "//button[contains(text(),'SignUp')]")
	WebElement signupbtn;
	
	@FindBy(linkText = "Forgotten password?")
	WebElement forgotpwd;
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	WebElement createAcc;
	
	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String email, String pwd) {
		emailid.sendKeys(email);
		password.sendKeys(pwd);
		loginbtn.click();
	}
	
	public void multipleLogin(String email, String pwd) {
		emailid.sendKeys(email);
		password.sendKeys(pwd);
		loginbtn.click();
		
	}
	public void forgotPassword() {
		forgotpwd.click();
		
	}
	 public void switchToCreateAcc() {
		 createAcc.click();
	 }

}
