package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	private WebElement memberstab;
	
	@FindBy(xpath = "//span[text()='Third-parties']")
	private WebElement thirdpartytab;
	
	@FindBy(xpath = "//span[text()='Products | Services']")
	private WebElement productstab;
	
	@FindBy(xpath = "//span[text()='MRP']")
	private WebElement mrptab;
	
	@FindBy(xpath = "//span[text()='Commerce']")
	private WebElement commercetab;
	
	@FindBy(xpath = "//span[text()='Billing | Payment']")
	private WebElement billingtab;
	
	
	@FindBy(xpath = "//span[text()='Banks | Cash']")
	private WebElement bankstab;
	
	@FindBy(id = "mainmenua_hrm")
	private WebElement hrmtab;
	
	@FindBy(xpath = "//span[@class='hidden-xs maxwidth200 atoploginusername hideonsmartphone paddingleft']")
	private WebElement adminbutton;
	
	@FindBy(xpath = "//span[@class='hideonsmartphone']")
	private WebElement logoutbutton;
	
	
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
	public void logout()
	
	{
		adminbutton.click();
		
		Actions act=new Actions(driver);
		act.moveToElement(logoutbutton).click();
		
	}
	
	
	

}
