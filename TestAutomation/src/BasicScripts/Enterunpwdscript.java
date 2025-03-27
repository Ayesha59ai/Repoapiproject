package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enterunpwdscript {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ayesha/OneDrive/Desktop/New%20folder-htmlcss/unpwd.html");
		WebElement un = driver.findElement(By.id("i1"));
		un.sendKeys("ayesha");
		WebElement pwd = driver.findElement(By.name("n1"));
		pwd.sendKeys("fathima");
		WebElement confirmpwd = driver.findElement(By.className("c1"));
		confirmpwd.sendKeys("fathima");
		WebElement link = driver.findElement(By.linkText("facebook2024"));
		link.click();
		
		
	}

}
