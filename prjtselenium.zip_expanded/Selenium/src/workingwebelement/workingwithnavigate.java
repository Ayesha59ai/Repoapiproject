package workingwebelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithnavigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//to perform forward
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("amazon:"+driver.getTitle());
		//to perform refresh
		driver.navigate().refresh();
		//to perform backword
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("flipkart:"+driver.getTitle());
		driver.close();
		
		

	}

}
