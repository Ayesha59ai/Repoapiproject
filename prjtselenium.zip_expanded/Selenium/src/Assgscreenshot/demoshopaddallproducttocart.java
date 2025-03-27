package Assgscreenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoshopaddallproducttocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[3]")).click();
        List<WebElement> addproduct = driver.findElements(By.xpath("(//div[@class=\"add-info\"])[1]//input"));
	 for(WebElement addtocart:addproduct) {
		 
		
		
	}
	
	}
}
