package Assgscreenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import chromerbrowserlaunching.webbrowser;

public class flipfetchproductnameusingfor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(4000);
	List<WebElement> allproductname = driver.findElements(By.xpath("//div[@class=\"col col-7-12\"]/div[1]"));
	for(WebElement  productname:allproductname) {
		System.out.println(productname.getText());
			}
	driver.close();
	}
}