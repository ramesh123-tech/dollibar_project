package Dollibar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.dollibar.ExcelUtility.excel_utility;
import com.dollibar.FileUtility.FileUtility;
import com.dollibar.WebDriverUtility.JavaUtility;
import com.dollibar.WebDriverUtility.WebDriverUtility;
import com.dollibar.pom.pages.LoginPage;

public class create_new_member_test {
	
	@Test
	public void createNewMemberTest() throws Throwable
	{
		WebDriver driver=null;
		WebDriverUtility w=new WebDriverUtility();
		JavaUtility j=new JavaUtility();
		excel_utility e=new excel_utility();
		FileUtility f=new FileUtility();
		
		String BROWSER = f.getDataFromPropertiesFile("browser");
		String URL = f.getDataFromPropertiesFile("url");
		String USERNAME = f.getDataFromPropertiesFile("username");
		String PASSWORD = f.getDataFromPropertiesFile("password");
		
		if(BROWSER.contains("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.contains("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(BROWSER.contains("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get(URL);
		w.impliwait(driver);
		w.maximize(driver);
		
		LoginPage lp=new LoginPage(driver);
		lp.LogintoApp(USERNAME, PASSWORD);
		
		driver.findElement(By.xpath("//span[text()='Members']")).click();
		
	}
		

}
