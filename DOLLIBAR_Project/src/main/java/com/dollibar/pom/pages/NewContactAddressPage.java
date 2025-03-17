package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewContactAddressPage {
	
	WebDriver driver;
	public NewContactAddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "add")
	private WebElement addbutton;
	
	@FindBy(xpath = "//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']")
	private WebElement headermsg;

	@FindBy(id = "lastname")
	private WebElement lasteditname;
	
	@FindBy(id = "firstname")
	private WebElement firsteditname;
	
	@FindBy(id = "title")
	private WebElement jobposition;
	
	@FindBy(id = "address")
	private WebElement addresstextfield;
	
	
	
	
	public WebElement getHeadermsg() {
		return headermsg;
	}

	public WebElement getAddbutton() {
		return addbutton;
	}

	public WebElement getLasteditname() {
		return lasteditname;
	}

	public WebElement getFirsteditname() {
		return firsteditname;
	}

	public WebElement getJobposition() {
		return jobposition;
	}

	public WebElement getAddresstextfield() {
		return addresstextfield;
	}
	
	

}
