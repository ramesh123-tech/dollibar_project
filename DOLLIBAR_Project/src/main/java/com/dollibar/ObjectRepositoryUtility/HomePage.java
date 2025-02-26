package com.dollibar.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver driver;
		public HomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText = "Organizations")
		private WebElement orglinkbutton;
		
		
		@FindBy(linkText = "Campaigns")
		private WebElement campaignlink;
		
		@FindBy(linkText = "Contacts")
		private WebElement contactlink;
		
		@FindBy(linkText = "More")
		private WebElement Morelink;
		
		
		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
		private WebElement adminimg;
		
		@FindBy(linkText = "Sign Out")
		private WebElement SignOut;
				

		
		
		
		
		
		public WebElement getContactlink() {
			return contactlink;
		}

		//public void setContactlink(WebElement contactlink) {
		//	this.contactlink = contactlink;
		//}

		public WebElement getAdminimg() {
			return adminimg;
		}

		public WebElement getSignOut() {
			return SignOut;
		}

		public WebElement getOrglinkbutton() {
			return orglinkbutton;
		}

		public void setOrglinkbutton(WebElement orglinkbutton) {
			this.orglinkbutton = orglinkbutton;
		}
		
		
		
		public void navigatetocampaignpage()
		{
			Actions act=new Actions(driver);
			act.moveToElement(Morelink).perform();
			campaignlink.click();
		}
		
		public void logout()
		{
			Actions act=new Actions(driver);
			act.moveToElement(adminimg).perform();
			SignOut.click();
		}
		
}
