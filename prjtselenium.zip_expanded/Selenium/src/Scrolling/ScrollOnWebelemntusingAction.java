package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollOnWebelemntusingAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/");
		Thread.sleep(2000);
		Actions act =new Actions(driver);
		
		ScrollOrigin s = ScrollOrigin.fromElement(driver.findElement(By.xpath("//div[@id='td-sidebar-menu']")));
		//scroll on webelemnt level
		act.scrollFromOrigin(s, 0, 100).perform();
	}

}
