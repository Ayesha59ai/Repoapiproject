package workingwithwebelementInterfaceelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingCssvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.id("Email")).sendKeys("ayesh@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("ayesh23");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(3000);
        String font = driver.findElement(By.xpath("//div[@class ='validation-summary-errors']")).getCssValue("font");
System.out.println("font:"+font);
String color = driver.findElement(By.xpath("//div[@class ='validation-summary-errors']")).getCssValue("color");
System.out.println("color:"+color);

	}

}
