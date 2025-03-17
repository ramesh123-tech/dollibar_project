package com.dollibar.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewManufacturingOrdersPage {
	
	WebDriver driver;
	public NewManufacturingOrdersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "select2-fk_bom-container")
	private WebElement BillOfMaterials;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement BillOfMaterialsseachfield;
	
	@FindBy(id = "select2-mrptype-container")
	private WebElement type;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement typesearchfiled;
	
	@FindBy(id = "select2-fk_product-container")
	private WebElement product;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement productsearchfield;
	
	@FindBy(id = "qty")
	private WebElement qtytoproduce;
	
	@FindBy(id = "select2-fk_warehouse-container")
	private WebElement warehouseforproduction;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement warehouseforproductionsearchfield;
	
	@FindBy(name = "add")
	private WebElement createbutton;
	
	@FindBy (xpath = "//a[text()='Validate']")
	private WebElement validatebutton;
	
	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']/button[text()='Yes']")
	private WebElement yesbutton;
	
	@FindBy(id = "production")
	private WebElement productionLink;
	
	@FindBy(xpath = "//a[text()='Consume and Produce All']")
	private WebElement consumeandproduceallbutton;
	
	@FindBy(xpath = "//span[text()='Force to']")
	private WebElement forcetoplaceholder;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement forcetosearchfield;
	
	@FindBy(name = "confirm")
	private WebElement confirmbutton;
	
	@FindBy(xpath = "//div[@class='menu_contenu menu_contenu_mrp_mo_list']/a")
	private WebElement manufactureListLink;
	
	
	@FindBy(id = "select2-search_fk_bom-container")
	private WebElement billofmaterialtext;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement billofmaterialsearchfield;
	
	@FindBy(id = "select2-search_status-container")
	private WebElement status;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement statussearchfield;
	
	@FindBy(xpath = "//span[@class='fas fa-search']")
	private WebElement searchbutton;
	
	
	
	
	public WebElement getStatus() {
		return status;
	}

	public WebElement getStatussearchfield() {
		return statussearchfield;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getBillofmaterialtext() {
		return billofmaterialtext;
	}

	public WebElement getBillofmaterialsearchfield() {
		return billofmaterialsearchfield;
	}

	public WebElement getManufactureListLink() {
		return manufactureListLink;
	}

	public WebElement getProductionLink() {
		return productionLink;
	}

	public WebElement getConsumeandproduceallbutton() {
		return consumeandproduceallbutton;
	}

	public WebElement getForcetoplaceholder() {
		return forcetoplaceholder;
	}

	public WebElement getForcetosearchfield() {
		return forcetosearchfield;
	}

	public WebElement getConfirmbutton() {
		return confirmbutton;
	}

	public WebElement getYesbutton() {
		return yesbutton;
	}

	public WebElement getValidatebutton() {
		return validatebutton;
	}

	public WebElement getBillOfMaterials() {
		return BillOfMaterials;
	}

	public WebElement getBillOfMaterialsseachfield() {
		return BillOfMaterialsseachfield;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getTypesearchfiled() {
		return typesearchfiled;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getProductsearchfield() {
		return productsearchfield;
	}

	public WebElement getQtytoproduce() {
		return qtytoproduce;
	}

	public WebElement getWarehouseforproduction() {
		return warehouseforproduction;
	}

	public WebElement getWarehouseforproductionsearchfield() {
		return warehouseforproductionsearchfield;
	}

	public WebElement getCreatebutton() {
		return createbutton;
	}
	
	
	
	
	
	
	
	
}
