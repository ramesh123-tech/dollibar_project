package MiscellaneousConcepts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.dollibar.pom.pages.LoginPage;

public class ChromeOptionsUsages 
{
@Test
public void browserVersionAndName()
{
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--headless");
	WebDriver driver = new ChromeDriver(option);

	ChromeDriver d=(ChromeDriver)driver;
	String browser_name = d.getCapabilities().getBrowserName();
	String browser_version = d.getCapabilities().getBrowserVersion();
	System.out.println(browser_name +" "+browser_version);
}

@Test
public void incagnito()
{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--incagnito");
	option.addArguments("--start-maximized");
	WebDriver driver = new ChromeDriver(option);
	driver.get("http://localhost:8888");
	LoginPage lp=new LoginPage(driver);
	lp.LogintoApp("admin", "admin");
}

//@Test
//public void chromeFullPageScreenshot() throws IOException
//{
//ChromeOptions option = new ChromeOptions();
//	WebDriver driver = new ChromeDriver(option);
//	String br_name = option.getBrowserName();
//	String br_version = option.getBrowserVersion();
//	System.out.println(br_name +" "+br_version);
//	
//}
}

