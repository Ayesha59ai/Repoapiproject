package demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithcssselector {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("[name='register-button']")).click();
		driver.findElement(By.cssSelector("[value='M']")).click();
		driver.findElement(By.cssSelector(" [name='FirstName']")).sendKeys("ayesha");
		driver.findElement(By.cssSelector(" [name='LastName']")).sendKeys("ayes");
		driver.findElement(By.cssSelector(" [name='Email']")).sendKeys("ayes123@gmail.com");
		driver.findElement(By.cssSelector(" [name='Password']")).sendKeys("ayes123@gmail");
		driver.findElement(By.cssSelector(" [name='ConfirmPassword']")).sendKeys("ayes123@gmail");
		driver.findElement(By.cssSelector(" [name='register-button']")).click();
		driver.close();

	}

}
