package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewEmployeePage {
	WebDriver driver;
	public NewEmployeePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "lastname")
	private WebElement lastedtname;
	
	@FindBy(id = "firstname")
	private WebElement firstnameedit;
	
	@FindBy(id = "login")
	private WebElement loginedit;
	
	@FindBy(id = "select2-fk_user-container")
	private WebElement superviser;
	
	@FindBy(id = "address")
	private WebElement addressedit;
	
	@FindBy(id = "town")
	private WebElement city;
	
	@FindBy(name = "email")
	private WebElement emailedt;
	
	@FindBy(name = "job")
	private WebElement jobpositionedt;
	
	@FindBy(name = "save")
	private WebElement savebutton;
	
	
	@FindBy(xpath = "//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']")
	private WebElement headermsg;
	
	@FindBy(xpath = "//a[text()='×']")
	private WebElement userhasnopermissionbutton;
	
	
	
	
	
	
	public WebElement getSuperviser() {
		return superviser;
	}

	public WebElement getUserhasnopermissionbutton() {
		return userhasnopermissionbutton;
	}

	public WebElement getHeadermsg() {
		return headermsg;
	}

	public WebElement getLastedtname() {
		return lastedtname;
	}

	public WebElement getFirstnameedit() {
		return firstnameedit;
	}

	public WebElement getLoginedit() {
		return loginedit;
	}

	public WebElement getAddressedit() {
		return addressedit;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getEmailedt() {
		return emailedt;
	}

	public WebElement getJobpositionedt() {
		return jobpositionedt;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	

}
