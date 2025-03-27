package ass4regshoper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingseleniumdev 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='Blog']")).click();
	  String message = driver.findElement(By.xpath("//p[contains(text(),'This blog will')]")).getText();
     System.out.println(message);
     driver.close();
	}
}
