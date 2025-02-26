  package com.dollibar.ObjectRepositoryUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * author ramesh
 * 
 */
public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="user_name")
	private WebElement useredit;
	
	@FindBy(name="user_password")
	private WebElement passedit; 
	
	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	public WebElement getUser() {
		return useredit;
	}

	public WebElement getPass() {
		return passedit;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void logintoapp(String username,String password)
	{
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		useredit.sendKeys(username);
		passedit.sendKeys(password);
		loginbutton.click();
	}
	
	
	
}
