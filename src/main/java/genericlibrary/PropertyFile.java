package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public String getdata(String text) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstants.propertyfilepath);
		p.load(fis);
		return p.getProperty(text);
	}

}
