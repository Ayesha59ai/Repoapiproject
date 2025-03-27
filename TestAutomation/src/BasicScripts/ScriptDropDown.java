package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScriptDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ayesha/OneDrive/Desktop/New%20folder-htmlcss/HandleDD.html");
		WebElement dd = driver.findElement(By.id("celebrities"));
		Select s=new Select(dd);
		if(s.isMultiple()) {
			
			 s.selectByIndex(0);
			 Thread.sleep(1000);
			 s.selectByValue("j");
			 Thread.sleep(1000);
			 s.selectByVisibleText("Anushka");
			System.out.println("DD is multi select");
			 Thread.sleep(2000);
			s.deselectByIndex(0);
			 Thread.sleep(2000);
			 s.deselectByVisibleText("Anushka");
			 Thread.sleep(2000);
     s.deselectByValue("j");
	 Thread.sleep(2000);
		}
		else
		{
			System.out.println("DD is single select");
		}
		driver.close();
		
	}

}
