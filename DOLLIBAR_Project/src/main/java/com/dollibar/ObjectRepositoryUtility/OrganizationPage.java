package com.dollibar.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	WebDriver driver;
	public OrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@title='Create Organization...']")
	WebElement addbutton;
	public WebElement getAddbutton() {
		return addbutton;
	}

	public void setAddbutton(WebElement addbutton) {
		this.addbutton = addbutton;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	
}
