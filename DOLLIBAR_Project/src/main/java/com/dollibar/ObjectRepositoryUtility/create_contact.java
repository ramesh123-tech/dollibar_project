package com.dollibar.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_contact {
		
	WebDriver driver;
	public create_contact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	WebElement contactaddbutn;
	
	@FindBy(name ="lastname")
	WebElement lastname;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	WebElement lastnamesavebutton;
	
	@FindBy(xpath ="//span[@class='dvHeaderText']")
	WebElement contactheader;
	
	
	
	
	
	
	public WebElement getContactheader() {
		return contactheader;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getLastnamesavebutton() {
		return lastnamesavebutton;
	}

	public WebElement getContactaddbutn() {
		return contactaddbutn;
	}
	
	public void creatlastname(String name)
	{
		contactaddbutn.click();
		lastname.sendKeys(name);
		lastnamesavebutton.click();
	}
	

}
