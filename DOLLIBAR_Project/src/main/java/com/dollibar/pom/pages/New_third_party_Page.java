package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_third_party_Page {
	WebDriver driver;
	public New_third_party_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "name")
	private WebElement thirdpartyname;
	
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single flat']")
	private WebElement prospect;
	
	@FindBy(id = "select2-customerprospect-result-6asd-2")
	private WebElement prospectdrop;
	
	@FindBy(id = "select2-fournisseur-container")
	private WebElement vendor;
	
	@FindBy(id = "select2-fournisseur-result-n1b5-1")
	private WebElement Yes;
	
	@FindBy(id = "select2-fournisseur-result-jz5a-0")
	private WebElement No;
	
	@FindBy(name = "save")
	private WebElement createthirdpartybutton;
	public WebElement getThirdpartyname() {
		return thirdpartyname;
	}

	public WebElement getProspect() {
		return prospect;
	}

	public WebElement getProspectdrop() {
		return prospectdrop;
	}

	public WebElement getVendor() {
		return vendor;
	}

	public WebElement getYes() {
		return Yes;
	}

	public WebElement getNo() {
		return No;
	}

	public WebElement getCreatethirdpartybutton() {
		return createthirdpartybutton;
	}
	
	

}
