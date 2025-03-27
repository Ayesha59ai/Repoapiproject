package Assertionverf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verifyusingsoftassert 
{
	@Test
	public void testcasse2() {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String Expectedtitle="Facebook – log in or sign up";
		String Actualtitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(Actualtitle, Expectedtitle);
		System.out.println(Actualtitle);
		s.assertAll();
		driver.quit();
	}

}
