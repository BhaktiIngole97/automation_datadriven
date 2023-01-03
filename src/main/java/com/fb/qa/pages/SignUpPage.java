package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bs_baseclass.base_class;

public class SignUpPage extends base_class {
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement fname;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lname;

	@FindBy(xpath = "//input[@name='reg_email__']")
	WebElement registerEmail;

	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	WebElement confirmEmail;

	@FindBy(xpath = "//input[@name='reg_passwd__']")
	WebElement registerPasswd;

	@FindBy(xpath = "//select[@name='birthday_day']")
	WebElement birthdayDay;

	@FindBy(xpath = "//select[@name='birthday_month']")
	WebElement birthdayMonth;

	@FindBy(xpath = "//select[@name='birthday_year']")
	WebElement birthdayYear;

	@FindBy(xpath = "//input[@name='sex'][@value=2]")
	WebElement gender;

	@FindBy(xpath = "//button[@name='websubmit']")
	WebElement submitBtn;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public void Signup(String firstname, String lastname, String email, String confirm_email, String reg_passwd,
			String b_day, String b_month, String b_year) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		registerEmail.sendKeys(email);
		confirmEmail.sendKeys(confirm_email);
		registerPasswd.sendKeys(reg_passwd);
		birthdayDay.sendKeys(b_day);
		birthdayMonth.sendKeys(b_month);
		birthdayYear.sendKeys(b_year);
		gender.click();
		submitBtn.click();
		
	}
}
	

