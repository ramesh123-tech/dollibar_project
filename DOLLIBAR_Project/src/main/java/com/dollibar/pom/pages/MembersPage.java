package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MembersPage {
	WebDriver driver;
	public MembersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='New member']")
	WebElement newmemberlink;
	
	@FindBy(xpath = "//a[@title='Draft members']")
	WebElement draftmemberslink;
	
	@FindBy(xpath = "//a[@title='List']")
	WebElement listlink;
	
	@FindBy(xpath = "//a[@title='//a[@title='Validated members']']")
	WebElement validatedmemberslink;
	
	
	@FindBy(xpath = "//a[@title='Terminated members']")
	WebElement terminatedmemberslink;
	public WebElement getNewmemberlink() {
		return newmemberlink;
	}


	public WebElement getDraftmemberslink() {
		return draftmemberslink;
	}


	public WebElement getListlink() {
		return listlink;
	}


	public WebElement getValidatedmemberslink() {
		return validatedmemberslink;
	}


	public WebElement getTerminatedmemberslink() {
		return terminatedmemberslink;
	}
	
	


	
	
	
	

}
