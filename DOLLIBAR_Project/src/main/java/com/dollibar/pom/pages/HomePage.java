package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='mainmenu members topmenuimage']")
	WebElement memberstab;
	
	@FindBy(xpath = "//span[text()='Third-parties']")
	WebElement thirdpartytab;
	
	@FindBy(xpath = "//span[text()='Products | Services']")
	WebElement productstab;
	
	@FindBy(xpath = "//span[text()='MRP']")
	WebElement mrptab;
	
	@FindBy(xpath = "//span[text()='Commerce']")
	WebElement commercetab;
	
	@FindBy(xpath = "//span[text()='Billing | Payment']")
	WebElement billingtab;
	
	
	@FindBy(xpath = "//span[text()='Banks | Cash']")
	WebElement bankstab;
	
	@FindBy(id = "mainmenua_hrm")
	WebElement hrmtab;
	public WebElement getMemberstab() {
		return memberstab;
	}

	public WebElement getThirdpartytab() {
		return thirdpartytab;
	}

	public WebElement getProductstab() {
		return productstab;
	}

	public WebElement getMrptab() {
		return mrptab;
	}

	public WebElement getCommercetab() {
		return commercetab;
	}

	public WebElement getBillingtab() {
		return billingtab;
	}

	public WebElement getBankstab() {
		return bankstab;
	}

	public WebElement getHrmtab() {
		return hrmtab;
	}
	public void navigatetolinks()
	{
		hrmtab.click();
		bankstab.click();
		billingtab.click();
		commercetab.click();
		mrptab.click();
		productstab.click();
		thirdpartytab.click();
		memberstab.click();
		
		}
	
	
	

}
