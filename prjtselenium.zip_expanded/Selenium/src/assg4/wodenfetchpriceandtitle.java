package assg4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wodenfetchpriceandtitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"search-user1\"]")).sendKeys("computers tables");
		driver.findElement(By.xpath("//div[@type=\"button\"]")).click();
	String message = driver.findElement(By.xpath("(//a[contains(text(),'Alkin Study Table with Keyboard Tray and Side Storage ')])[1]/../../div/strong")).getText();
		System.out.println(message);
		String message1 = driver.findElement(By.xpath("(//a[contains(text(),'Alkin Study Table with Keyboard Tray and Side Storage ')])[1]")).getText();
		System.out.println(message1);
		driver.close();
	}

}
