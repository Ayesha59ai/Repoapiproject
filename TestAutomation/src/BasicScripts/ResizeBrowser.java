package BasicScripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
       WebDriver  driver=new ChromeDriver();
       driver.manage().window().maximize();
       
    Dimension   d=new  Dimension(300, 900);
    
    driver.manage().window().setSize(d);
	}

}
