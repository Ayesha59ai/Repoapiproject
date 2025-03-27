package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopperstack {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shoppersstack.com/");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("button[name='loginBtn']")).click();
	driver.findElement(By.className("MuiButton-label")).click();
	driver.findElement(By.cssSelector("input[id='First Name']")).sendKeys("ayeshfathi5");
	driver.findElement(By.cssSelector("input[id='Last Name']")).sendKeys("fathim59");
	driver.findElement(By.cssSelector("input[id='Female']")).click();
	driver.findElement(By.cssSelector("input[id='Phone Number']")).sendKeys("6457355548");
	driver.findElement(By.cssSelector("input[id='Email Address']")).sendKeys("fathiayesh5959@gmail.com");
	driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Aye#@123fathi");
	driver.findElement(By.cssSelector("input[id='Confirm Password']")).sendKeys("Aye#@123fathi");
	driver.findElement(By.cssSelector("input[id='Terms and Conditions']")).click();
	driver.findElement(By.cssSelector("button[id='Register']")).click(); 
	driver.close();
    }
}
