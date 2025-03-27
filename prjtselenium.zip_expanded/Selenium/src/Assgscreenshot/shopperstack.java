package Assgscreenshot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shopperstack {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		WebElement target1 = driver.findElement(By.xpath("//span[text()='SAMSUNG']"));
		Actions act=new Actions(driver);
		act.scrollToElement(target1).perform();
		Thread.sleep(2000);
		
List<WebElement> allproductname = driver.findElements(By.xpath("//div[@class='featuredProducts_footerLeft__iP3CQ']/span[2]"));
		

System.out.println(allproductname.size());
for(WebElement  productname:allproductname) {
			System.out.println(productname.getText());
				}
		driver.quit();
	}

}
