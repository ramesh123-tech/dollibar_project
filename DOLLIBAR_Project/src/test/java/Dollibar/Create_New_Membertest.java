package Dollibar;
import org.testng.annotations.Test;

import com.dollibar.Generic.BaseUtility.BaseClass;
import com.dollibar.pom.pages.HomePage;
import com.dollibar.pom.pages.MembersPage;

public class Create_New_Membertest extends BaseClass {
		
	@Test
	public void createNewMemberTest()
	{
	  System.out.println("launch browser");
	   HomePage hp=new HomePage(driver);
	   hp.getMemberstab().click();
	   
	   MembersPage mp=new MembersPage(driver);
	   mp.getNewmemberlink().click();
	   
	   
	   
	   
		
	}
		

	}


