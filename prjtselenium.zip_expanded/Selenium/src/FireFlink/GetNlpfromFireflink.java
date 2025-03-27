package FireFlink;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNlpfromFireflink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://app.fireflink.com/signin");
		driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("ayeshafathimaansar@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ayesha@1234");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='BigBasket']")).click();
		
		driver.findElement(By.xpath("(//span[@class='fancytree-expander'])[4]")).click();
		
		driver.findElement(By.xpath("//span[text()='to get nlp']")).click();
		
		driver.findElement(By.xpath("(//button[text()='+ Step'])[2]")).click();
		
		//Thread.sleep(3000);
		
		List<WebElement> Nlp = driver.findElements(By.xpath("//div[@class=\"max-h-152 overflow-y-auto overflow-x-hidden\"]//p"));
	for(WebElement allNlp:Nlp) {
		
		Thread.sleep(6000);
		
		String NLPList = allNlp.getText();
		
		Thread.sleep(1000);
		System.out.println(NLPList);
	
	}
		 	
	}

}
