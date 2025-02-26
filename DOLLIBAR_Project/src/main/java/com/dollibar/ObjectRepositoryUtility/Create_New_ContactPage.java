package com.dollibar.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dollibar.WebDriverUtility.JavaUtility;




public class Create_New_ContactPage {
	WebDriver driver;
	JavaUtility j=new JavaUtility();
	public Create_New_ContactPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "lastname")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	WebElement contactsavebutton;
	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getContactsavebutton() {
		return contactsavebutton;
	}
	
	public void createlastname(String name)
	{
		
	lastname.sendKeys(name);
		
		contactsavebutton.click();
		
	}
}
