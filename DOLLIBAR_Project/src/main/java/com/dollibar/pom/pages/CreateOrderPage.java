package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrderPage {
	
	WebDriver driver;
	public CreateOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "ref_client")
	private WebElement refcustomer;
	
	@FindBy(xpath = "//span[text()='Select a third party']")
	private WebElement customer;
	
	@FindBy(id = "select2-availability_id-container")
	private WebElement availabilitydealy;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement availabilitydelaysearch;
	
	@FindBy(id = "select2-cond_reglement_id-container")
	private WebElement paymentterms;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement paytmenttermssearch;
	
	@FindBy(id = "select2-selectmode_reglement_id-container")
	private WebElement paymentmethod;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement paytmentmethodsearch;
	
	@FindBy(id = "select2-selectshipping_method_id-container")
	private WebElement shippingmethod;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement shippingmethodsearch;
	
	@FindBy(name = "save")
	private WebElement createdraftbutton;
	public WebElement getRefcustomer() {
		return refcustomer;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getAvailabilitydealy() {
		return availabilitydealy;
	}

	public WebElement getAvailabilitydelaysearch() {
		return availabilitydelaysearch;
	}

	public WebElement getPaymentterms() {
		return paymentterms;
	}

	public WebElement getPaytmenttermssearch() {
		return paytmenttermssearch;
	}

	public WebElement getPaymentmethod() {
		return paymentmethod;
	}

	public WebElement getPaytmentmethodsearch() {
		return paytmentmethodsearch;
	}

	public WebElement getShippingmethod() {
		return shippingmethod;
	}

	public WebElement getShippingmethodsearch() {
		return shippingmethodsearch;
	}

	public WebElement getCreatedraftbutton() {
		return createdraftbutton;
	}
	
	

	

}
