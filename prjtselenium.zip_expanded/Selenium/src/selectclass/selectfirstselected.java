package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectfirstselected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/Notification%20and%20DropDowns.html");
WebElement dropdown = driver.findElement(By.id("multiSelect"));
Select select=new Select(dropdown);
select.selectByValue("jaguar");
Thread.sleep(3000);
select.selectByVisibleText("BMW");
WebElement firstdselect = select.getFirstSelectedOption();
System.out.println(firstdselect.getText());
//List<WebElement> alloptions = select.getOptions();
//for(WebElement options:alloptions) {
	//System.out.println(options.getText());
//}
System.out.println(select.isMultiple());
driver.close();
	}

}
