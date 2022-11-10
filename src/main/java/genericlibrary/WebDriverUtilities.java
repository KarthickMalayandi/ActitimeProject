package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	
	public void dropDown(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public void waitForTitle(WebDriver driver,String title)
	{
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.titleContains(title));
		
	}
}
