package ass4regshoper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("ayeshfatdfghbnm");
		driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("fathifghj");
		driver.findElement(By.xpath("//input[@id='Female']")).click();
		driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("6757754786");
		driver.findElement(By.xpath("//input[@id='Email Address']")).sendKeys("fath23ayesfg@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ayesha@1234");
		driver.findElement(By.xpath("//input[@id='Confirm Password']")).sendKeys("Ayesha@1234");
		driver.findElement(By.xpath("//input[@id='Terms and Conditions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnDisabled']")).click();
		driver.close();
		
		

	}

}
