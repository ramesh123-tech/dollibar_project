package com.dollibar.pom.pages;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMemberPage {
	WebDriver driver;
	
	 public NewMemberPage(WebDriver driver) 
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id = "select2-typeid-container")
	private  WebElement membertype;
	 
	 @FindBy(name = "societe")
	 private WebElement company;
	 
	 @FindBy(xpath = "//span[@title='Individuals']")
	private  WebElement individuals;
	 
	 @FindBy(id = "select2-typeid-result-mdby-3")
	private  WebElement bank;
	 
	 @FindBy(id = "select2-typeid-result-ihhz-1")
	private WebElement companies;
	 
	 @FindBy(id = "select2-morphy-container")
	private WebElement natureofthemember;
	 
	 @FindBy(xpath = "//li[@id='select2-morphy-result-osv7-phy']")
	private WebElement individual;
	 
	 @FindBy(id = "select2-morphy-result-wwvq-mor")
	private WebElement corporation;
	 
	 @FindBy(name = "lastname")
	 private WebElement lastname;
	 
	 @FindBy(name = "firstname")
	 private WebElement firstname;
	
	 @FindBy(id = "select2-gender-container")
	private  WebElement gender;
	 
	 @FindBy(id = "select2-gender-result-9hm7-man")
	private WebElement male;
	 
	 @FindBy(xpath = "li[text()='Female']")
	private WebElement female;
	 
	 
	 @FindBy(name = "save")
	 private WebElement CreateMemberButton;
	 
	 

	public WebElement getCompany() {
		return company;
	}


	public void setCompany(WebElement company) {
		this.company = company;
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMembertype() {
		return membertype;
	}


	public WebElement getIndividuals() {
		return individuals;
	}


	public WebElement getBank() {
		return bank;
	}


	public WebElement getCompanies() {
		return companies;
	}


	public WebElement getNatureofthemember() {
		return natureofthemember;
	}


	public WebElement getIndividual() {
		return individual;
	}


	public WebElement getCorporation() {
		return corporation;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getGender() {
		return gender;
	}


	public WebElement getMale() {
		return male;
	}


	public WebElement getFemale() {
		return female;
	}


	public WebElement getCreateMemberButton() {
		return CreateMemberButton;
	}
	 
	 public void navigatetomembertypedrop() 
	 {
		 membertype.click();
		 
		// corporation.click();
		// companies.click();
		// company.sendKeys("hemongo");		// individuals.click();
		Actions act=new Actions(driver);
		act.moveToElement(individuals).click().perform();
		
	 }
	 
	 public void navigatetocreatemember(String lname,String fname)
	 {
		 lastname.sendKeys(lname);
		 firstname.sendKeys(fname);
		// gender.click();
		 //female.click();
		 
		// Actions act=new Actions(driver);
		// act.moveToElement(male).click().perform();
		 
		 CreateMemberButton.click();
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
