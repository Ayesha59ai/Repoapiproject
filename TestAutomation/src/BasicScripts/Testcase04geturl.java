package BasicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase04geturl 
{
public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://shoppersstack.com/");
	String	url =driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(1000);
	driver.quit();
}
}
