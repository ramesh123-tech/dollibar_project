package Dollibar;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.dollibar.Generic.BaseUtility.BaseClass;
import com.dollibar.pom.pages.HRMPage;
import com.dollibar.pom.pages.HomePage;
import com.dollibar.pom.pages.NewEmployeePage;
import com.dollibar.pom.pages.NewLeaveRequest_Page;

public class CreateEmployeeTest extends BaseClass {
	
	@Test
	public void createemployeetest() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.getHrmtab().click();
		
		HRMPage hrm=new HRMPage(driver);
		hrm.getNewEmployeeLink().click();
		
		String lastname = e.getDataFromExcel("newemployee", 1, 1);
		String firstname = e.getDataFromExcel("newemployee", 1, 2);
		String login = e.getDataFromExcel("newemployee", 1, 3)+j.getrandomnumber();
		String address = e.getDataFromExcel("newemployee", 1, 4);
		String city = e.getDataFromExcel("newemployee", 1, 5);
		String email = e.getDataFromExcel("newemployee", 1, 6)+j.getrandomnumber();
		String lobposition = e.getDataFromExcel("newemployee", 1, 7);
		
		NewEmployeePage np=new NewEmployeePage(driver);
		np.getLastedtname().sendKeys(lastname);
		np.getFirstnameedit().sendKeys(firstname);
		np.getLoginedit().sendKeys(login);
		np.getSuperviser().click();
		
		WebElement ele = driver.findElement(By.xpath("//input[@aria-controls='select2-fk_user-results']"));
		ele.sendKeys("kumar kummi");
		ele.sendKeys(Keys.ENTER);
		np.getAddressedit().sendKeys(address);
		np.getCity().sendKeys(city);
		np.getEmailedt().sendKeys(email);
		np.getJobpositionedt().sendKeys(lobposition);
		np.getSavebutton().click();
		
		String headerInfo = np.getHeadermsg().getText();
		boolean verify = headerInfo.contains(lastname);
		
		assertEquals(verify, true);
		
		driver.findElement(By.id("rights")).click();
		
		
		
		 
		
	}
			
			@Test
			public void applyforleaveTest() throws Throwable 
			{
				HomePage hp=new HomePage(driver);
				hp.getHrmtab().click();
				
				HRMPage hrm=new HRMPage(driver);
				hrm.getNewleaveLink().click();
				
				NewLeaveRequest_Page nlp=new NewLeaveRequest_Page(driver);
				nlp.getType().click();
				nlp.getTypesearch().sendKeys("other");
				nlp.getTypesearch().sendKeys(Keys.ENTER);
				
				nlp.selectstartdate(driver, "21", "May", "2026");
				
				nlp.selectenddate(driver, "20", "Jun", "2026");
				
				nlp.getApprovedBY().click();
				nlp.getApprovesearch().sendKeys("luffy");
				nlp.getApprovesearch().sendKeys(Keys.ENTER);
				//Thread.sleep(4000);
				
				nlp.getSavebutton().click();
			
				driver.findElement(By.xpath("//a[@class='jnotify-close']")).click();
				Thread.sleep(2000);
				
				
				
				
				
				
				
				
	        }

}
