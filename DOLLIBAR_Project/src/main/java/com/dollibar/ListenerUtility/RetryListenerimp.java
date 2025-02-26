package com.dollibar.ListenerUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListenerimp implements IRetryAnalyzer {

	int count=0;
	int limitcount=5;
	
	public boolean retry(ITestResult result)
	{
		if(count<limitcount)
		{
			count++;
			return true;
		}

		// TODO Auto-generated method stub
		return false;
	}

}
