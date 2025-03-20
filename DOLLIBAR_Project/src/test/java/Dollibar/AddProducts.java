package Dollibar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.dollibar.Generic.BaseUtility.BaseClass;
import com.dollibar.pom.pages.HomePage;
import com.dollibar.pom.pages.MRPPage;
import com.dollibar.pom.pages.NewBillOfMaterialsPage;
import com.dollibar.pom.pages.NewManufacturingOrdersPage;
import com.dollibar.pom.pages.NewProductPage;

public class AddProducts extends BaseClass{
	
	
	@Test
	public void addproducts() throws Throwable
	{
		w.maximize(driver);
		HomePage hp=new HomePage(driver);	
		hp.getProductstab().click();
		
		
		String PRODUCTREF = e.getDataFromExcel("productpage", 1, 1);
		String LABEL = e.getDataFromExcel("productpage", 1, 2);
		String STATUSSELL = e.getDataFromExcel("productpage", 1, 3);
		String STATUSPURCHASE = e.getDataFromExcel("productpage", 1, 4);
		
		
		NewProductPage npp=new NewProductPage(driver);
		
		npp.getNewproductLink().click();
		npp.getProductref().sendKeys(PRODUCTREF);
		npp.getLabel().sendKeys(LABEL);
		npp.getStatussell().click();
		npp.getStatussellsearchfield().sendKeys(STATUSSELL);
		npp.getStatussellsearchfield().sendKeys(Keys.ENTER);
		npp.getStatuspurchase().click();
		npp.getStatuspurchasesearchfield().sendKeys(STATUSPURCHASE);
		npp.getStatuspurchasesearchfield().sendKeys(Keys.ENTER);
		npp.getCreatebutton().click();
		
		
	}
	
	@Test
	public void BillOfMaterial() throws Throwable
	{
		w.maximize(driver);
	    HomePage hp=new HomePage(driver);
	    hp.getMrptab().click();
		//Thread.sleep(2000);
		MRPPage mrp=new MRPPage(driver);
		//Thread.sleep(3000);
		mrp.getNewbillofmaterialLink().click();
		
		NewBillOfMaterialsPage nbmp=new NewBillOfMaterialsPage(driver);
		nbmp.getLabeledit().sendKeys("iphone");
		nbmp.getTypebutton().click();
		nbmp.getTypesearchfield().sendKeys("manufacturing");
		nbmp.getTypesearchfield().sendKeys(Keys.ENTER);
		nbmp.getProduct().click();
		nbmp.getProductsearchfield().sendKeys("124");
		nbmp.getTypesearchfield().sendKeys(Keys.ENTER);
		nbmp.getQuantity().sendKeys("1111");
		
		nbmp.getCreatebutton().click();
		
		WebElement header = driver.findElement(By.xpath("//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']"));
		String headerinfo = header.getText();
		nbmp.getListLink().click();
		nbmp.getRefsearch().sendKeys(headerinfo);
		nbmp.getRefsearch().sendKeys(Keys.ENTER);
		
		
		
		driver.findElement(By.xpath("//td[@class='nowraponall nowraponall']/..//input[@type='checkbox']")).click();
		nbmp.getSelectaction().click();
		nbmp.getSelectactiontextfiled().sendKeys("enable");
		nbmp.getSelectactiontextfiled().sendKeys(Keys.ENTER);
		
		nbmp.getComfirmbutton().click();
		
		MRPPage mrp1=new MRPPage(driver);
		mrp1.getNewmanufacturingorderLink().click();
		
		NewManufacturingOrdersPage nmfo=new NewManufacturingOrdersPage(driver);
		nmfo.getBillOfMaterials().click();
		nmfo.getBillOfMaterialsseachfield().sendKeys("iphone");
		nmfo.getBillOfMaterialsseachfield().sendKeys(Keys.ENTER);
		
		nmfo.getType().click();
		nmfo.getTypesearchfiled().sendKeys("manu");
		nmfo.getTypesearchfiled().sendKeys(Keys.ENTER);
		
		nmfo.getProduct().click();
		nmfo.getProductsearchfield().sendKeys("123");
		nmfo.getProductsearchfield().sendKeys(Keys.ENTER);
		
		
		nmfo.getQtytoproduce().click();
		nmfo.getQtytoproduce().sendKeys("1");
		
		nmfo.getWarehouseforproduction().click();
		nmfo.getWarehouseforproductionsearchfield().sendKeys("wak");
		nmfo.getWarehouseforproductionsearchfield().sendKeys(Keys.ENTER);
		nmfo.getCreatebutton().click();
		
		WebElement billofmaterial = driver.findElement(By.xpath("//td[@class='valuefield fieldname_fk_bom']/a"));
		String bill = billofmaterial.getText();
		//boolean valid = billofmaterial.isDisplayed();
		nmfo.getValidatebutton().click();
		
		w.windowhandlebyurl(driver, headerinfo);

		nmfo.getYesbutton().click();
		Thread.sleep(3000);
		nmfo.getProductionLink().click();
		nmfo.getConsumeandproduceallbutton().click();
		nmfo.getForcetoplaceholder().click();
		nmfo.getForcetosearchfield().sendKeys("wak");
		nmfo.getForcetosearchfield().sendKeys(Keys.ENTER);
		
		nmfo.getConfirmbutton().click();
		
		nmfo.getManufactureListLink().click();
		nmfo.getStatus().click();
		nmfo.getStatussearchfield().sendKeys("produced");
		nmfo.getStatussearchfield().sendKeys(Keys.ENTER);
		nmfo.getSearchbutton().click();
		
		nmfo.getBillofmaterialtext().click();
		
		nmfo.getBillOfMaterialsseachfield().sendKeys(bill);
		nmfo.getBillOfMaterialsseachfield().sendKeys(Keys.ENTER);
		nmfo.getSearchbutton().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
