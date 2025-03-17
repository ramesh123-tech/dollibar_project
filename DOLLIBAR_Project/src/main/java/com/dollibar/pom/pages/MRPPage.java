package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MRPPage {

	WebDriver driver;
	public MRPPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='New bill of materials']")
	private WebElement newbillofmaterialLink;
	
	@FindBy(xpath = "//div[@class='menu_contenu menu_contenu_bom_bom_list']/a")
	private WebElement listLink;
	
	@FindBy(xpath = "//a[@title='New Manufacturing Order']")
	private WebElement NewmanufacturingorderLink;
	
	@FindBy(xpath = "//a[@title='Add new workstation']")
	private WebElement AddNewworkstationLink;
	public WebElement getNewbillofmaterialLink() {
		return newbillofmaterialLink;
	}

	public WebElement getListLink() {
		return listLink;
	}

	public WebElement getNewmanufacturingorderLink() {
		return NewmanufacturingorderLink;
	}

	public WebElement getAddNewworkstationLink() {
		return AddNewworkstationLink;
	}
	
	
	
	
}
