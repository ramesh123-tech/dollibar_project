package Dollibar;

import org.testng.annotations.Test;

import com.dollibar.Generic.BaseUtility.BaseClass;
import com.dollibar.pom.pages.HomePage;

public class CreateInvoice extends BaseClass {

	
		@Test
		public void createinvoicetest()
		{
			HomePage hp=new HomePage(driver);
			hp.getBillingtab().click();
			
			
		}
}
