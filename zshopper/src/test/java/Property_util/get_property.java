package Property_util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class get_property 
{
	@Test
	public String getdata(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./Property/data.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

}
