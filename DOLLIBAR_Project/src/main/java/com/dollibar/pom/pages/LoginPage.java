package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dollibar.WebDriverUtility.WebDriverUtility;

public class LoginPage{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement useredit;
	
	@FindBy(id = "password")
	WebElement passedit;
	
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbutton;
	public WebElement getUseredit() {
		return useredit;
	}

	public WebElement getPassedit() {
		return passedit;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void LogintoApp(String USERNAME,String PASSWORD)
	{
		useredit.sendKeys(USERNAME);
		passedit.sendKeys(PASSWORD);
		loginbutton.click();
		
	}

}
