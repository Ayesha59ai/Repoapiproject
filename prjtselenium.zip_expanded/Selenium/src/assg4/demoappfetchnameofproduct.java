package assg4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoappfetchnameofproduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
       driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[2]")).click();
    String messa = driver.findElement(By.xpath("//h1/../../div[2]/div[3]/div[1]/div/div/a")).getText();
	System.out.println(messa);
	}

}
