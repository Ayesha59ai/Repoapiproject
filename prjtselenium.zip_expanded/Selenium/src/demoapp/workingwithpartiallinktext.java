package demoapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithpartiallinktext {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Computer")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Electronics")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Jewelry")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		System.out.println(driver.getTitle());
		driver.close();
		}
	}