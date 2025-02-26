package com.dollibar.WebDriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getrandomnumber()
	{
		Random random=new Random();
		int randomnumber = random.nextInt(5000);
		return randomnumber;
		
	}
	
	public String getsystemdate()
	{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String dateobj = sdf.format(date);
		return dateobj;
		
	}
	public String getrequireddate(int days)
	{
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqdate = sdf.format(cal.getTime());
		return reqdate;
	}
}
