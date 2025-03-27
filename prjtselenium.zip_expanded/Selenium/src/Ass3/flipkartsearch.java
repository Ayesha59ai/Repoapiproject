package Ass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("[type='text']")).click();
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Laptop");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	    String PageTitle =driver.getTitle();
	   if (PageTitle.equals("Laptop- Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
	    {
		System.out.println("pass");	
		} 
	    else 
		{
			System.out.println("Fail");

		}
	    }
}