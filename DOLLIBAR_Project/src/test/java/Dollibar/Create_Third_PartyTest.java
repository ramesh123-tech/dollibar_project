package Dollibar;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.dollibar.Generic.BaseUtility.BaseClass;
import com.dollibar.pom.pages.HomePage;
import com.dollibar.pom.pages.NewContactAddressPage;
import com.dollibar.pom.pages.New_third_party_Page;
import com.dollibar.pom.pages.Thirdparty_info_Page;
import com.dollibar.pom.pages.third_party_Page;

public class Create_Third_PartyTest extends BaseClass {
	
	@Test
	public void thirdpartytest() throws Throwable
	{
		
		HomePage hp=new HomePage(driver);
		hp.getThirdpartytab().click();
		
		third_party_Page tp=new third_party_Page(driver);
		tp.getThirdpartylink().click();
		
		String thirdpartyname = e.getDataFromExcel("thirdparty",1,1)+j.getrandomnumber();
		String prospect = e.getDataFromExcel("thirdparty",1,2);
		String vendor = e.getDataFromExcel("thirdparty",1,3);
		System.out.println(thirdpartyname);
		
		New_third_party_Page ntp=new New_third_party_Page(driver);
		ntp.getThirdpartyname().sendKeys(thirdpartyname);
		ntp.getProspect().click();
		WebElement ele = driver.findElement(By.xpath("//input[@aria-autocomplete='list' and @aria-controls='select2-customerprospect-results' ]"));
		ele.sendKeys(prospect);
		ele.sendKeys(Keys.ENTER);
		ntp.getVendor().click();
		WebElement ele2 = driver.findElement(By.xpath("//input[@aria-autocomplete='list' and @aria-controls='select2-fournisseur-results' ]"));
		
		ele2.sendKeys(vendor);
		ele2.sendKeys(Keys.ENTER);
		ntp.getCreatethirdpartybutton().click();
		
		Thirdparty_info_Page tip=new Thirdparty_info_Page(driver);
		String headerinfo = tip.getThirdpartyheaderinfo().getText();
		
		boolean verify = headerinfo.contains(thirdpartyname);
		assertEquals(verify, true);
		
		
		
		
	}



	@Test
	public void contactaddresstest() throws Throwable
	{
		

		HomePage hp=new HomePage(driver);
		hp.getThirdpartytab().click();
		
		third_party_Page tp=new third_party_Page(driver);
		tp.getContactaddressLink().click();
		
		NewContactAddressPage ncap=new NewContactAddressPage(driver);
		
		
		
		String lastname = e.getDataFromExcel("contactaddess",1,1)+j.getrandomnumber();
		String firstname = e.getDataFromExcel("contactaddess",1,2)+j.getrandomnumber();
		String jobpositin = e.getDataFromExcel("contactaddess",1,3);
		String address = e.getDataFromExcel("contactaddess",1,4);
		System.out.println(lastname);
		ncap.getLasteditname().sendKeys(lastname);
		ncap.getFirsteditname().sendKeys(firstname);
		ncap.getJobposition().sendKeys(jobpositin);
		ncap.getAddresstextfield().sendKeys(address);
		
		ncap.getAddbutton().click();
		
		String headerinfoverify = ncap.getHeadermsg().getText();
		boolean verify1 = headerinfoverify.contains(lastname);
		assertEquals(verify1, true);
		
	}
}
