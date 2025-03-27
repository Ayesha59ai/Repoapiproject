package workingwithwebelementInterfaceelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattributefromtooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	String Message = driver.findElement(By.name("q")).getAttribute("title");
	System.out.println(Message);
	String Message1 = driver.findElement(By.xpath("//a[text()='Become a Seller']")).getAttribute("title");
	
	System.out.println(Message1);	

	}

}
