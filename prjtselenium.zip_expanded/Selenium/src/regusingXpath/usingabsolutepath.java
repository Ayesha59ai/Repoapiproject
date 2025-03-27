package regusingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingabsolutepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/RegisterPage.html");
         driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("ayesha");
         driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ayesh2344");
         driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("ayesh@gmail.com");
         driver.findElement(By.xpath("/html/body/input[5]")).click();
         driver.findElement(By.xpath("/html/body/input[6]")).click();
         driver.findElement(By.xpath("/html/body/input[7]")).click();
	}

}
