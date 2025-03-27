package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleallbrowserwindandclose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.id("browserButton2")).click();
		Thread.sleep(1000);
		Set<String> wins = driver.getWindowHandles();
		ArrayList<String>array=new ArrayList<String>(wins);
		int count=wins.size();
		for(int i=0; i<count;i++) {
			String win = array.get(i);
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
	       Thread.sleep(2000);
			driver.close();
			}
		}
}
