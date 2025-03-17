package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewBillOfMaterialsPage {
	WebDriver driver;
	public NewBillOfMaterialsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "label")
	private WebElement labeledit;
	
	@FindBy(xpath = "//span[@id='select2-bomtype-container']")
	private WebElement typebutton;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement typesearchfield;
	
	@FindBy(id = "select2-fk_product-container")
	private WebElement product;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement productsearchfield;
	
	@FindBy(id = "qty")
	private WebElement quantity;
	
	@FindBy(name = "add")
	private WebElement createbutton;
	
	@FindBy(xpath = "//div[@class='menu_contenu menu_contenu_bom_bom_list']/a")
	private WebElement listLink;
	
	@FindBy(xpath = "//table[@class='tagtable nobottomiftotal liste']/tbody/tr[@data-rowid='20']/td/following-sibling::td[@class='nowrap center']/input")
	private WebElement tocheckbox;
	
	
	@FindBy(id = "cb1")
	
	private WebElement checkbox;
	
	@FindBy(xpath = "//span[@id='select2-massaction-container']")
	private WebElement selectaction;
	
	@FindBy(xpath = "//li[@id='select2-massaction-result-px01-enable']")
	private WebElement enable;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement selectactiontextfiled;
	
	@FindBy(name = "confirmmassaction")
	private WebElement comfirmbutton;
	
	@FindBy(xpath = "//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']")
	private WebElement headerinfo;
	
	@FindBy(name = "search_ref")
	private WebElement refsearch;
	
	
	
	public WebElement getSelectactiontextfiled() {
		return selectactiontextfiled;
	}

	public WebElement getRefsearch() {
		return refsearch;
	}

	public WebElement getHeaderinfo() {
		return headerinfo;
	}

	public WebElement getLabeledit() {
		return labeledit;
	}

	public WebElement getTypebutton() {
		return typebutton;
	}

	public WebElement getTypesearchfield() {
		return typesearchfield;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getProductsearchfield() {
		return productsearchfield;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getCreatebutton() {
		return createbutton;
	}

	public WebElement getListLink() {
		return listLink;
	}

	public WebElement getTocheckbox() {
		return tocheckbox;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getSelectaction() {
		return selectaction;
	}

	public WebElement getEnable() {
		return enable;
	}

	public WebElement getComfirmbutton() {
		return comfirmbutton;
	}
	
	public void navigatelistandenablebillofmatrerial(String enable)
	{
		tocheckbox.click();
		//checkbox.click();
		selectaction.click();
		selectactiontextfiled.sendKeys("enable");
		
		//enable.click();
		comfirmbutton.click();
		
		
	}
	
	
	
}
