package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bs_baseclass.base_class;

public class HomePage extends base_class {

		@FindBy(xpath = "//span[text()='Friends']")
		WebElement friendEle;
		
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		public void switchToFriedPage() {
			friendEle.click();
		}
	}


