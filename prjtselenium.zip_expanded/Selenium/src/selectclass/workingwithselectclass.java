package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingwithselectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	 WebElement dropdown = driver.findElement(By.id("drop1"));
	 Select select= new Select(dropdown);
	 Thread.sleep(3000);
	 select.selectByIndex(3);
	 Thread.sleep(3000);
	 select.selectByValue("abc");
	 Thread.sleep(3000);
	 select.selectByVisibleText("doc 2");
	 //to fetch all options from dropdown
	 List<WebElement> alloptions = select.getOptions();
	 for(WebElement option:alloptions) {
		 System.out.println(option.getText());
		 
	 }
	 driver.close();

	}

}
