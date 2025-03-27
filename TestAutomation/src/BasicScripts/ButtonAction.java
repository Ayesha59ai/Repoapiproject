package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
	WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
	WebElement yesbtn= driver.findElement(By.xpath("//button[@id='btn']"));
	WebElement yesmsg= driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
	
	if(yesbtn.isDisplayed()) {
		
		yesbtn.click();
		   if(yesmsg.isDisplayed()) {
			   
			   System.out.println("Yes msg is displayed");
		   }
		}
	else {
		System.out.println("it is not displayed");
	}

	
	}

}
