package com.dollibar.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dollibar.WebDriverUtility.WebDriverUtility;

public class NewLeaveRequest_Page {
	WebDriver driver;
	public  NewLeaveRequest_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(id = "select2-type-container")
		private WebElement type;
		
		@FindBy(xpath = "//input[@class='select2-search__field']")
		private WebElement typesearch;
		
		@FindBy(xpath = "//div[@class='nowraponall inline-block divfordateinput']/input[@id='date_debut_']/following-sibling::img")
		private WebElement startdatecalendor;
		
		@FindBy(xpath = "//div[@class='nowraponall inline-block divfordateinput']/input[@id='date_fin_']/following-sibling::img")
		private WebElement enddatecalendor;
		
		@FindBy(xpath = "//a[text()='20']")
		private WebElement day;
		
		@FindBy(xpath = "//select[@class='ui-datepicker-month']")
		private WebElement monthDD;
		
		@FindBy(xpath = "//select[@class='ui-datepicker-year']")
		private WebElement yearDD;
		
		
		@FindBy(id = "select2-valideur-container")
		private WebElement approvedBY;
		
		@FindBy(xpath = "//input[@class='select2-search__field']")
		private WebElement approvesearch;
		
		@FindBy(name = "save")
		private WebElement savebutton;
		
		
		
		public WebElement getSavebutton() {
			return savebutton;
		}

		public WebElement getDay() {
			return day;
		}

		public WebElement getType() {
			return type;
		}

		public WebElement getTypesearch() {
			return typesearch;
		}

		

		public WebElement getStartdatecalendor() {
			return startdatecalendor;
		}

		public WebElement getEnddatecalendor() {
			return enddatecalendor;
		}

		public WebElement getMonthDD() {
			return monthDD;
		}

		public WebElement getYearDD() {
			return yearDD;
		}

		public WebElement getApprovedBY() {
			return approvedBY;
		}

		public WebElement getApprovesearch() {
			return approvesearch;
		}
		
		WebDriverUtility w=new WebDriverUtility();
		
		public void selectstartdate(WebDriver driver,String day,String month,String year)
		{
			startdatecalendor.click();
			w.handledropdownvisibletext(monthDD, month);
			w.handledropdownvisibletext(yearDD, year);
			driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
			
			
		}
		public void selectenddate(WebDriver driver,String day,String month,String year)
		{
			enddatecalendor.click();
			w.handledropdownvisibletext(monthDD, month);
			w.handledropdownvisibletext(yearDD, year);
			driver.findElement(By.xpath("//a[text()='"+day+"']")).click();			
		}
		
		
		
		
		
		
}
