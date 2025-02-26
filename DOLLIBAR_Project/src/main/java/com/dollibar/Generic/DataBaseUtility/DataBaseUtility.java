package com.dollibar.Generic.DataBaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {

	Connection con;
	public void getDbconnection(String url,String username,String password) throws SQLException
	{
		try
		{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		
	}
		
		catch(Exception e)
		{
			
		}
       }
	public void getDbconnection() throws SQLException
	{
		
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
		
	}
	
	public void closedbconnection() throws Throwable
	{
		con.close();
		
	}
	public ResultSet executeselectquery(String query) throws Throwable
	{
		 ResultSet result = null;
		try
		{
		Statement stat=con.createStatement();
		 result = stat.executeQuery(query);
		}
		catch(Exception e)
		{
			
		}
		return result;
		
	}
	public int executenonselectquery(String query)
	{
		int result=0;
		try
		{
			Statement stat = con.createStatement();
			result=stat.executeUpdate(query);
		}
		catch(Exception e)
		{
			
		}
		return result;
	}
	}
	
	
	

