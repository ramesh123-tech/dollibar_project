package MiscellaneousConcepts;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class FirefoxOptionsUsage 
{
	@Test
	public void FullPageScreenshotFirefox() throws IOException
	{
		
		WebDriver driver=new FirefoxDriver();
		FirefoxDriver d=(FirefoxDriver) driver;
		d.get("https://www.amazon.in/");
		File src = d.getFullPageScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshots/Firefox.png");
		FileUtils.copyFile(src, dst);
	}

	@Test
	public void incagnitoFirefox() throws IOException, InterruptedException
	{
		FirefoxOptions option =new FirefoxOptions();
		option.addArguments("--private-window");
		WebDriver driver=new FirefoxDriver(option);
		driver.get("https://www.myntra.com/");
		FirefoxDriver d=(FirefoxDriver) driver;
		
		Thread.sleep(4000);
		File src = d.getFullPageScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshots/FirefoxIncagnito2.png");//it is not taking full screenshot of flipkart
		FileUtils.copyFile(src, dst);
		driver.quit();
	}

}

