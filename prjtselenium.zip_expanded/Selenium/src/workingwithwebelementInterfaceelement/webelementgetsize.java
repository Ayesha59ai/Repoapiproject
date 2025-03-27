package workingwithwebelementInterfaceelement;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementgetsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	 //org.openqa.selenium.Dimension searchsize = driver.findElement(By.name("q")).getSize();
	Point searchTF = driver.findElement(By.name("q")).getLocation();
	System.out.println(searchTF);
	System.out.println("x:"+searchTF.getX());
	System.out.println("y:"+searchTF.getY());
	
	driver.findElement(By.name("q")).getRect();

	}

}
