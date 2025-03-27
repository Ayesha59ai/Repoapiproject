package BasicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase03gettitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		//System.setProperty("webdriver.chrome.diver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://shoppersstack.com/");
	String	title =driver.getTitle();
	System.out.println(title);
	Thread.sleep(1000);
	driver.quit();
	}

}
