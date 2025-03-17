package Dollibar;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.dollibar.Generic.BaseUtility.BaseClass;
import com.dollibar.pom.pages.HomePage;
import com.dollibar.pom.pages.MRPPage;
import com.dollibar.pom.pages.NewBillOfMaterialsPage;

public class bill extends BaseClass {
	

	
	@Test
	public void BillOfMaterial() throws Throwable
	{
		
	    HomePage hp=new HomePage(driver);
	    hp.getMrptab().click();
		//Thread.sleep(2000);
		MRPPage mrp=new MRPPage(driver);
		//Thread.sleep(3000);
		mrp.getNewbillofmaterialLink().click();
		
		NewBillOfMaterialsPage nbmp=new NewBillOfMaterialsPage(driver);
		nbmp.getLabeledit().sendKeys("lenovo");
		nbmp.getTypebutton().click();
		nbmp.getTypesearchfield().sendKeys("manufacturing");
		nbmp.getTypesearchfield().sendKeys(Keys.ENTER);
		nbmp.getProduct().click();
		nbmp.getProductsearchfield().sendKeys("124");
		nbmp.getTypesearchfield().sendKeys(Keys.ENTER);
		nbmp.getQuantity().sendKeys("1111");
		nbmp.getQuantity().sendKeys(Keys.ENTER);
		
		nbmp.getCreatebutton().click();
		
		///driver.findElement(By.xpath("//div[@class='menu_contenu menu_contenu_bom_bom_list']/a")).click();
		nbmp.getListLink().click();
	
		
		Thread.sleep(3000);
		//nbmp.navigatelistandenablebillofmatrerial();
		nbmp.getTocheckbox().click();
		nbmp.getCheckbox().click();
		nbmp.getSelectaction().click();
		Thread.sleep(3000);
		nbmp.getEnable().click();
		Thread.sleep(2000);
		nbmp.getComfirmbutton().click();
		
		MRPPage mrp1=new MRPPage(driver);
		mrp1.getNewmanufacturingorderLink().click();
		
		
		
		
	}

}
