package demoverify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithlink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Log in")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Shopping cart")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Wishlist")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

	}

}
