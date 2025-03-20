package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage {
	
	WebDriver driver;
	public VendorPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name")
	private WebElement thirdpartyname;
	
	@FindBy(id = "select2-customerprospect-container")
	private WebElement prospect;
	
	//@FindBy    

}
