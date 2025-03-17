package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMPage {
	WebDriver driver;
	public HRMPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath = "//a[@title='New employee']")
		private WebElement newEmployeeLink;
		
		@FindBy(xpath = "//div[@class='menu_contenu menu_contenu_holiday_card']/a")
		private WebElement newleaveLink;
		
		
		
		
		public WebElement getNewleaveLink() {
			return newleaveLink;
		}




		public WebElement getNewEmployeeLink() {
			return newEmployeeLink;
		}



		
		
}
