[package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingdatafromproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//two approach to fetch and read data 
		//FileInputStream fis=new FileInputStream("C:\\Users\\User\\Documents\\Selenium\\testdata.properties");
		FileInputStream fis=new FileInputStream("./Testdata/testdata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		
		String value=pobj.getProperty("url");
		System.out.println(value);
		System.out.println(pobj.getProperty("email"));
		System.out.println(pobj.getProperty("password"));
		
		
	}

}
