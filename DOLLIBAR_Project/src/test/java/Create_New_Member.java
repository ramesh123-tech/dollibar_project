import org.testng.annotations.Test;

import com.dollibar.Generic.BaseUtility.BaseClass;
import com.dollibar.pom.pages.HomePage;

public class Create_New_Member extends BaseClass {
		
	@Test
	public void createNewMemberTest()
	{
	  System.out.println("launch browser");
	   HomePage hp=new HomePage(driver);
	   
	   hp.logout();
	   
	   
		
	}
		

	}


