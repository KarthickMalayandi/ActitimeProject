package genericlibrary;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public PropertyFile pf=new PropertyFile();
	public WebDriverUtilities wdu=new WebDriverUtilities();
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pf.getdata("url"));
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		Date d=new Date();
		String dateTime = d.toString().replace(":", "-");
		int status = res.getStatus();
		String name = res.getName();
		
		if(status==2)
		{
		TakePhoto tp=new TakePhoto();
		tp.takephoto(driver,name,dateTime);
		}
		driver.quit();
	}

}
