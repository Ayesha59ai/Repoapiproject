package demoapp;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoreg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");
        driver.findElement(By.name("Gender")).click();
        driver.findElement(By.name("FirstName")).sendKeys("ayesha");
        driver.findElement(By.name("LastName")).sendKeys("fathi");
        driver.findElement(By.name("Email")).sendKeys("ayeshafathi@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("ayesha@gmail");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("ayesha@gmail");
        driver.findElement(By.name("register-button")).click();
        driver.close();
      
		

	}

}
