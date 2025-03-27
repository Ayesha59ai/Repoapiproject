package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
		Thread.sleep(2000);
		driver.findElement(By.id("txtOriginGeneral")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='select2-result-sub']/li/div)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='select2-result-sub'])[1]/li//div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtReturnDateBooking")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='22']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnBusSearchNewGeneral")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//b[.='SELECT'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='seat']/small)[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='seat']/small)[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Proceed'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='OK']")).click();
		
		driver.findElement(By.xpath("(//b[.='SELECT'])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[@class='seat']/small)[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='seat']/small)[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Proceed'])[2]")).click();
		Thread.sleep(2000);
	
		
		
		
		

	}

}
