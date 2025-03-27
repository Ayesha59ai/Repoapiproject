package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingwithmultiselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
Select select=new Select(dropdown);
Thread.sleep(3000);
select.selectByIndex(2);
Thread.sleep(3000);
select.selectByValue("swiftx");
Thread.sleep(3000);
select.selectByVisibleText("Hyundai");
//deselect
//Thread.sleep(3000);
//select.deselectByIndex(2);
//Thread.sleep(3000);
//select.deselectByValue("Hyundai");
select.deselectAll();

driver.close();

	}

}
