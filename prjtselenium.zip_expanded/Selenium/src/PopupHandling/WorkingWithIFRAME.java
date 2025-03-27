package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIFRAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/iframe");
		//to change driver focus by index num
		//driver.switchTo().frame(0);
		//by using id attribute value-using iframe tag
		//driver.switchTo().frame("mce_0_ifr");
		//by using webelement
		WebElement frameelement = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
		driver.switchTo().frame(frameelement);
		String msg = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		System.out.println(msg);
		//driver .switchTo(). parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		driver.close();

	}

}
