package BasicScripts;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver	driver =new ChromeDriver();
driver.manage().window().maximize();
   Point P=new Point(400, 500);
	driver.manage().window().setPosition(P);
	}

}
