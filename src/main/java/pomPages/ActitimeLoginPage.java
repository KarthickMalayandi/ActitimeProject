package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

	@FindBy(id="username")
	private WebElement untf;
	@FindBy(name="pwd")
	private WebElement pwdtf;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void usernametf(String text)
	{
		untf.sendKeys(text);
	}
	public void passwordtf(String text)
	{
		pwdtf.sendKeys(text);
	}
	public void loginbutton()
	{
		loginbtn.click();
	}
}
