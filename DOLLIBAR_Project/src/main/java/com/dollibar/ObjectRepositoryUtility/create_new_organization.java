package com.dollibar.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class create_new_organization
{
	WebDriver driver;
	public create_new_organization(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	WebElement organizationname;
	
	@FindBy(name = "industry")
	WebElement industrydropdown;
	
	@FindBy(name = "accounttype")
	WebElement typedropdown;
	
	
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])")
	WebElement savebutton;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	WebElement header;
	
	
	
	
	public WebElement getIndustrydropdown() {
		return industrydropdown;
	}

	public WebElement getTypedropdown() {
		return typedropdown;
	}

	public WebElement getHeader() {
		return header;
	}

	public void setHeader(WebElement header) {
		this.header = header;
	}

	public WebElement getOrganizationname() {
		return organizationname;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	public void navigatetoorgname(String name)
	{
		organizationname.sendKeys(name);
	}
	
	
	public void industrydrop()
	{
	Select s=new Select(industrydropdown);
	s.selectByVisibleText("Energy");
	}
	public void typedrop()
	{
		Select s=new Select(typedropdown);
		s.selectByVisibleText("Investor");
	}
	

}
