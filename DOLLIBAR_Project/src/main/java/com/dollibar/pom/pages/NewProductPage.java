package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProductPage {

	WebDriver driver;
	
	public NewProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='New product']")
	private WebElement newproductLink;
	
	
	@FindBy(xpath = "//a[@title='Products']/../..//a[text()='List']")
	private WebElement listLink;
	
	
	@FindBy(id = "ref")
	private WebElement productref;
	
	@FindBy(name = "label")
	private WebElement label;
	
	@FindBy(xpath = "//span[@id='select2-statut-container']")
	private WebElement statussell;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement statussellsearchfield;
	
	
	@FindBy(xpath = "//span[@id='select2-statut_buy-container']")
	private WebElement statuspurchase;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement statuspurchasesearchfield;
	
	@FindBy(name = "add")
	private WebElement createbutton;
	
	

	public WebElement getStatussellsearchfield() {
		return statussellsearchfield;
	}

	public WebElement getStatuspurchasesearchfield() {
		return statuspurchasesearchfield;
	}

	public WebElement getNewproductLink() {
		return newproductLink;
	}

	public WebElement getListLink() {
		return listLink;
	}

	public WebElement getProductref() {
		return productref;
	}

	public WebElement getLabel() {
		return label;
	}

	public WebElement getStatussell() {
		return statussell;
	}

	public WebElement getStatuspurchase() {
		return statuspurchase;
	}

	public WebElement getCreatebutton() {
		return createbutton;
	}
	
	
	
	public void navigatetoproductpage()
	{
		productref.click();
		label.click();
		statussell.click();
		statuspurchase.click();
		
		createbutton.click();
		
	}
	
	
	
}
