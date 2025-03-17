package com.dollibar.Generic.BaseUtility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.dollibar.ExcelUtility.excel_utility;
import com.dollibar.FileUtility.FileUtility;
import com.dollibar.Generic.DataBaseUtility.DataBaseUtility;
import com.dollibar.ListenerUtility.UtilityClassObject;
import com.dollibar.WebDriverUtility.JavaUtility;
import com.dollibar.WebDriverUtility.WebDriverUtility;
import com.dollibar.pom.pages.HomePage;
import com.dollibar.pom.pages.LoginPage;


public class BaseClass {
	
	public WebDriver driver=null;
	public static WebDriver sdriver=null;
	
	public WebDriverUtility w=new WebDriverUtility();
	public JavaUtility j=new JavaUtility();
	public FileUtility f=new FileUtility();
	public DataBaseUtility d=new DataBaseUtility();
	public excel_utility e=new excel_utility();
	
	@BeforeSuite(alwaysRun = true)
	public void configureBS() throws SQLException {

		System.out.println("==connect to DB, Report===");
		d.getDbconnection();
	}

	//@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
 	public void configureBC() throws Throwable {
		System.out.println("==Launch the browser");
		 
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--incognito");
		//String BROWSER=bROWSER;
		String BROWSER = f.getDataFromPropertiesFile("browser");
		if (BROWSER.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.contains("edge")) {
			driver = new EdgeDriver();
		}
		sdriver=driver;
		UtilityClassObject.setdriver(driver);
		
		w.impliwait(driver);

	}
       
	@BeforeMethod(alwaysRun = true)
	public void configureBM() throws Throwable {
		System.out.println("==log in==");
	    LoginPage lp=new LoginPage(driver);
		String URL = f.getDataFromPropertiesFile("url");
		String USERNAME = f.getDataFromPropertiesFile("username");
		String PASSWORD = f.getDataFromPropertiesFile("password");
		//driver.get("http://49.249.28.218:8889/dolibarr/");
		driver.get(URL);
		lp.LogintoApp(USERNAME, PASSWORD);
	}

	@AfterMethod(alwaysRun = true)
	public void configureAM() {
		System.out.println("==log out==");
		HomePage hp=new HomePage(driver);
		
		hp.logout();
	}

	@AfterClass(alwaysRun = true)
	public void configureAC() {
		driver.quit();
		System.out.println("==close the browser");
	}

	@AfterSuite(alwaysRun = true)
	public void configureAS() {
		System.out.println("===close DB,Report backup");
	}

}


	


