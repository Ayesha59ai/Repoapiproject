package Assignmt5dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demowebdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
Select select=new Select(dropdown);
for(int i=0;i<=6;i++)
{
	select.selectByIndex(i);
	Thread.sleep(2000);
	dropdown=driver.findElement(By.id("products-orderby"));
	select=new Select(dropdown);
}
//select.selectByValue("https://demowebshop.tricentis.com/books?orderby=0");
//Thread.sleep(3000);
//select.selectByVisibleText("Name: A to Z");
//Thread.sleep(4000);
//select.selectByIndex(3);


	}

}
