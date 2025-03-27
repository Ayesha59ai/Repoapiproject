package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskDDQSpdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement ddbtn = driver.findElement(By.xpath("//section[text()='Dropdown']"));
		ddbtn.click();
		WebElement multiselect = driver.findElement(By.xpath("//a[text()='Multi Select']"));
		multiselect.click();
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.xpath("//select[@id='select-multiple-native']"));
		WebElement addbtn = driver.findElement(By.xpath("//button[.='Add']"));
		Select s=new Select(dd);
		if(s.isMultiple()) {
			s.selectByIndex(0);
			addbtn.click();
			
		}
	}

}
