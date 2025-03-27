import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchurlofalllinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=links.size();
		for(int i=0;i<count;i++) {
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			System.out.println(url);
			
		}
	}

}
