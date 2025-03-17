package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thirdparty_info_Page {
	
	WebDriver driver;
	public Thirdparty_info_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']")
	private WebElement thirdpartyheaderinfo;
	public WebElement getThirdpartyheaderinfo() {
		return thirdpartyheaderinfo;
	}
	
	
}
