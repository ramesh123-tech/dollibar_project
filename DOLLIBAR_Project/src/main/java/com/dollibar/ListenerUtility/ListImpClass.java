package com.dollibar.ListenerUtility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.dollibar.Generic.BaseUtility.BaseClass;

//import practice.testNG.utilityClassObject;

public class ListImpClass implements ITestListener,ISuiteListener{
   public ExtentReports report;
    ExtentTest test;
	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
		System.out.println("Report Configuration");
		String time = new Date().toString().replace(" ", "_").replace(":", " ");

		ExtentSparkReporter spark=new ExtentSparkReporter("./advancereport/contact"+time+".html");
		spark.config().setDocumentTitle("log in to app");
		spark.config().setReportName("vtiger reports");
		spark.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "windows-10");
		report.setSystemInfo("BROWSER", "CHROME-100");
		
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Report BackUP");
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("==="+result.getMethod().getMethodName()+"==Start==");
		test=report.createTest(result.getMethod().getMethodName());
		UtilityClassObject.setTest(test);
		UtilityClassObject.getTest().log(Status.INFO, result.getMethod().getMethodName()+"==>started==");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("==="+result.getMethod().getMethodName()+"==END==");
		
		UtilityClassObject.getTest().log(Status.PASS, result.getMethod().getMethodName()+"==>ended==");

		
	}

	@Override
	public void onTestFailure(ITestResult result) {
 		// TODO Auto-generated method stub
		
		String testName = result.getMethod().getMethodName();
		
         TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;
	     String	srcfile=ts.getScreenshotAs(OutputType.BASE64);		
		String time = new Date().toString().replace(" ", "_").replace(":", " ");
		UtilityClassObject.getTest().addScreenCaptureFromBase64String(srcfile,testName+"_"+time);
		UtilityClassObject.getTest().log(Status.FAIL, "FAIL TESTCASE");
		UtilityClassObject.getTest().log(Status.FAIL, result.getThrowable());
		/*try {
			FileUtils.copyFile(srcfile, new File("./screenshot/"+testName+"_"+time+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	}
	@Override
	public void onTestSkipped(ITestResult result) {
     		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
 		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		
		
	}

}
