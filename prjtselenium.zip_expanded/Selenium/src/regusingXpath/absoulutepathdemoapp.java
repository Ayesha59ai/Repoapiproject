package regusingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absoulutepathdemoapp {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
	driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ayeshafathi");
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("ayefama");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ayesh34fathi5@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("aye45@34");
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("aye45@34");
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	
	
}
}
