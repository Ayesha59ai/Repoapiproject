package Assignmt5dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class viaflightanddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='No thanks!']")).click();
		driver.findElement(By.xpath("//span[text()='Cruise ']")).click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("hotelsCheckIn"));
Select select=new Select(dropdown);
select.selectByIndex(1);
Thread.sleep(2000);
WebElement dropdown1 = driver.findElement(By.xpath("(//select[@id='hotelsCheckIn'])[2]"));
Select selects=new Select(dropdown1);
selects.selectByVisibleText("Feb-2024");
Thread.sleep(2000);
WebElement dropdown2 = driver.findElement(By.id("operator"));
Select selectss=new Select(dropdown2);
selectss.selectByVisibleText("1 To 3 night(s)");
Thread.sleep(2000);
 driver.findElement(By.id("flightTravellersClass")).click();
 Thread.sleep(2000);
 Actions act=new Actions(driver);
 WebElement doubleclick = driver.findElement(By.xpath("(//button[@data-toggle=\"spinner\"])[2]"));
 act.doubleClick(doubleclick).perform();
 Thread.sleep(2000);
 WebElement doubleclick1 = driver.findElement(By.xpath("(//button[@data-toggle=\"spinner\"])[4]"));
 act.doubleClick(doubleclick1).perform();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//button[text()='Done']")).click();
 Thread.sleep(2000);
 WebElement dropdown3 = driver.findElement(By.id("cruiselines"));
 Select selectses=new Select(dropdown3);
 selectses.selectByVisibleText("Cordelia Cruises");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//button[text()='Search Cruise']")).click();
 
 driver.close();

	
	}

}
