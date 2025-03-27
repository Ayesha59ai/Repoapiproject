package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	@Test(dataProvider = "loginData")
	public void testcase(String email,String password) throws InterruptedException {
		// step1:Open Browser
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://demowebshop.tricentis.com/");
				//
				driver.findElement(By.xpath("//a[text()='Log in']")).click();
						// step4:perform Login
				driver.findElement(By.id("Email")).sendKeys(email);
				driver.findElement(By.id("Password")).sendKeys(password);
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(3000);
			driver.close();

	}
	@DataProvider(name="loginData")
	public Object[][] datasupply() {
		Object[][]arr=new Object[4][2];
		arr[0][0]="ayesha@gmail.com";
		arr[0][1]="ayesgjg";
		arr[1][0]="ayeshafayth1@gmail.com";
		arr[1][1]="ayesgghjg";
		arr[2][0]="ayeshafathiam2@gmail.com";
		arr[2][1]="ayesgsjg";
		arr[3][0]="ayesha346@gmail.com";
		arr[3][1]="ayesgtjg";
		return arr;
		
	}

}
