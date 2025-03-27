package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Performscrollusingarugment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//h3[.='b. Premium Materials']"));
		Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].scrollIntoView()",ele);
//scrolldown till bottom
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


//scroll top of the page
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

Thread.sleep(3000);
//Zoom
js.executeScript("document.body.style.zoom='210%' ");
Thread.sleep(2000);

//driver.quit();
	}

}
