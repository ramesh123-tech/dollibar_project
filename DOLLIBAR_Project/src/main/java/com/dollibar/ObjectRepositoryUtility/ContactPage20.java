package com.dollibar.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage20 {
	WebDriver driver;
	public ContactPage20(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	WebElement addcontactbutton;
	
	public WebElement getAddcontactbutton() {
		return addcontactbutton;
	}
	
	public void navigateaddbutton() {
		
		addcontactbutton.click();
	}
	
	
}
