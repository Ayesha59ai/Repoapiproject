package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithid {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By .id("email")).sendKeys("ayesha@gmail.com");
		
	    driver.findElement(By.id("pass")).sendKeys("ayesha@123");

	}

}
