package BasicScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingdisableeleusingJSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/ayesha/OneDrive/Desktop/New%20folder-htmlcss/disableelementjse.html");

		JavascriptExecutor js=(JavascriptExecutor)driver;
//handle disable element
	//	js.executeScript("document.getElementById('a1').value='hello' ");
		
		//clear value from disable element
		js.executeScript("document.getElementById('a1').value=' ' ");
		
        
	}

}
