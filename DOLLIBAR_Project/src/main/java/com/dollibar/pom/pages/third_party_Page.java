package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class third_party_Page {
	WebDriver driver;
	public third_party_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//a[text()='New Third Party']")
	private WebElement newthirdpartylink;
	
	@FindBy(xpath = "//a[@title='List of Prospects']")
	private WebElement listofprospectslink;
	
	@FindBy(xpath = "//a[@title='New Prospect']")
	private WebElement newprospectlink;
	
	@FindBy(xpath = "//a[@title='List of Customers']")
	private WebElement listofcustomerslink;
	
	
	@FindBy(xpath = "//a[@title='New Customer']")
	private WebElement newcustomerlink;
	
	@FindBy(xpath = "//a[@title='List of Vendors']")
	private WebElement listofvendorslink;
	
	@FindBy(xpath = "//a[@title='New Vendor']")
	private WebElement newvendorlink;
	
	@FindBy(xpath = "//a[@title='New Contact/Address'and @class='vsmenu']")
	private WebElement contactaddressLink;
	
	
	
	public WebElement getContactaddressLink() {
		return contactaddressLink;
	}

	public void setContactaddressLink(WebElement contactaddressLink) {
		this.contactaddressLink = contactaddressLink;
	}

	public WebElement getThirdpartylink() {
		return newthirdpartylink;
	}

	public WebElement getListofprospectslink() {
		return listofprospectslink;
	}

	public WebElement getNewprospectlink() {
		return newprospectlink;
	}

	public WebElement getListofcustomerslink() {
		return listofcustomerslink;
	}

	public WebElement getNewcustomerlink() {
		return newcustomerlink;
	}

	public WebElement getListofvendorslink() {
		return listofvendorslink;
	}

	public WebElement getNewvendorlink() {
		return newvendorlink;
	}
	
	
}
