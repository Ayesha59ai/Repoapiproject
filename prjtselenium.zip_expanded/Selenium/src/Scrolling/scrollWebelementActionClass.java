package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollWebelementActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//p[text()='Explore options near me']"));
		Actions act=new Actions(driver);
		//scroll till web element
		act.scrollToElement(target).perform();
		driver.close();
	}

}
