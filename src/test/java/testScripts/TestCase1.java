package testScripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.ActitimeLoginPage;

public class TestCase1 extends BaseClass {
	
	@Test
	public void tc1() throws IOException, InterruptedException
	{
		ActitimeLoginPage atlp=new ActitimeLoginPage(driver);
		atlp.usernametf(pf.getdata("user"));
		atlp.passwordtf(pf.getdata("pass"));
		atlp.loginbutton();
		wdu.waitForTitle(driver, pf.getdata("title"));
		String title = driver.getTitle();
		if(title.equals(pf.getdata("title")))
		{
			Reporter.log("TC1 Passed",true);
			Reporter.log(title,true);
		}else
		{
			Reporter.log("TC1 Failed",true);
		}
	}

}
