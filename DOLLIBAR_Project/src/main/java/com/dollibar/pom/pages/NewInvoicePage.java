package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewInvoicePage {

	WebDriver driver;
	public NewInvoicePage(WebDriver dricver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='menu_contenu menu_contenu_compta_facture_card']/a")
	private WebElement newinvoiceLink;
	
	@FindBy(xpath = "//div[@class='menu_contenu menu_contenu_compta_facture_list']/a")
	private WebElement invoicelistLink;
	
	@FindBy(xpath = "//span[text()='Select a third party']")
	private WebElement customer;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement customersearchfield;
	
	@FindBy(id = "radio_standard")
	private WebElement type;
	
	@FindBy(xpath = "//img[@class='ui-datepicker-trigger']")
	private WebElement invoicedate;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	private WebElement year;
	
	@FindBy(xpath = "//a[text()='13']")
	private WebElement date;
	
	@FindBy(id = "select2-cond_reglement_id-container")
	private WebElement paymentTerms;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement paymenttermssearch;
	
	@FindBy(id = "select2-selectmode_reglement_id-container")
	private WebElement paymentmethod;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement paymentmethodsearch;
	
	@FindBy(id = "select2-selectfk_account-container")
	private WebElement bankaccount;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement bankaccountsearch;
	
	@FindBy(name = "save")
	private WebElement createdraftbutton;
	public WebElement getNewinvoiceLink() {
		return newinvoiceLink;
	}

	public WebElement getInvoicelistLink() {
		return invoicelistLink;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getCustomersearchfield() {
		return customersearchfield;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getInvoicedate() {
		return invoicedate;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getPaymentTerms() {
		return paymentTerms;
	}

	public WebElement getPaymenttermssearch() {
		return paymenttermssearch;
	}

	public WebElement getPaymentmethod() {
		return paymentmethod;
	}

	public WebElement getPaymentmethodsearch() {
		return paymentmethodsearch;
	}

	public WebElement getBankaccount() {
		return bankaccount;
	}

	public WebElement getBankaccountsearch() {
		return bankaccountsearch;
	}

	public WebElement getCreatedraftbutton() {
		return createdraftbutton;
	}
	
	
	
	
	
	
	
	
	
	
}
