package Assertionverf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifytitleusingassertion {
	@Test
	public void testcase() {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String Expectedtitle="Facebook – log in or sign up";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(Actualtitle,Expectedtitle);
		System.out.println(Actualtitle);
		driver.quit();
	}

}
