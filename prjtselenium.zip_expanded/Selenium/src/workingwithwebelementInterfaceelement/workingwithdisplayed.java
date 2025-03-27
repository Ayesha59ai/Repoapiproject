package workingwithwebelementInterfaceelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.id("Email")).sendKeys("ayesh@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("ayesh23");
        WebElement checkbox = driver.findElement(By.id("RememberMe"));
        System.out.println("displayed:"+checkbox.isDisplayed());
        System.out.println("enabled:"+checkbox.isEnabled());
        System.out.println("selected:"+checkbox.isSelected());
        checkbox.click();
        System.out.println("selected:"+checkbox.isSelected());
        driver.close();
        

	}

}
