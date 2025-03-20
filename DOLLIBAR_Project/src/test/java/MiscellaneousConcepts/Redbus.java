package MiscellaneousConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Redbus {
	
	@Test
	public void redbustest() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("src")).sendKeys("bangolre"+Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("bijapur");
		Thread.sleep(2000);
		
		String month = "Jun";
		String year="2025";
		
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		Thread.sleep(5000);
		for(;;)
		{
			WebElement ele = driver.findElement(By.xpath("(//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr'])/div[2]"));
			String actmonth = ele.getText();
			System.out.println(actmonth);
			
			if(actmonth.contains(month+" "+year))
			{
				break;
				
			}
			driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.id("search_button")).click();
		
		
		
		
	}

}
