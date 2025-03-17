package Dollibar;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.dollibar.ExcelUtility.excel_utility;
import com.dollibar.FileUtility.FileUtility;
import com.dollibar.WebDriverUtility.JavaUtility;
import com.dollibar.WebDriverUtility.WebDriverUtility;
import com.dollibar.pom.pages.LoginPage;

public class sample222222 {
	
	@Test
	public void sample() throws IOException
	{
		

		String username="rameshkelaginama_snVOir";
		String password="DpXYss6vD7itwXoFsC9F";
		
		MutableCapabilities capabilities = new MutableCapabilities();
		HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
		capabilities.setCapability("browserName", "Firefox");
		bstackOptions.put("os", "Windows");
		bstackOptions.put("osVersion", "10");
		bstackOptions.put("browserVersion", "latest");
		//bstackOptions.put("userName", "rameshkelaginama_snVOir");
		//bstackOptions.put("accessKey", "DpXYss6vD7itwXoFsC9F");
		capabilities.setCapability("bstack:options", bstackOptions);


		
		
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("https://"+username+":"+password+"@hub-cloud.browserstack.com/wd/hub"),capabilities);
			
		
		WebDriverUtility w=new WebDriverUtility();
		JavaUtility j=new JavaUtility();
		excel_utility e=new excel_utility();
		FileUtility f=new FileUtility();
		
		String BROWSER = f.getDataFromPropertiesFile("browser");
		String URL = f.getDataFromPropertiesFile("url");
		String USERNAME = f.getDataFromPropertiesFile("username");
		String PASSWORD = f.getDataFromPropertiesFile("password");
		
		driver.get(URL);
		w.impliwait(driver);
		w.maximize(driver);
		
		LoginPage lp=new LoginPage(driver);
		lp.LogintoApp(USERNAME, PASSWORD);
		
		driver.findElement(By.xpath("//span[text()='Members']")).click();
		
		driver.quit();
		
	}
	

}
