import org.testng.annotations.Test;

import com.dollibar.Generic.BaseUtility.BaseClass;
import com.dollibar.pom.pages.LoginPage;

public class Create_New_Member extends BaseClass {
		
	@Test
	public void create()
	{
		LoginPage l=new LoginPage(driver);
		l.getUseredit().sendKeys("admin");
		l.getPassedit().sendKeys("123456");
		l.getLoginbutton().click();
		
	}
		

	}


