package genericlibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakePhoto {
	
	public void takephoto(WebDriver driver,String name,String dateTime) throws IOException
	{
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File f=new File(AutoConstants.photofilepath+name+dateTime+".png");
		FileUtils.copyFile(src, f);
	}

}
