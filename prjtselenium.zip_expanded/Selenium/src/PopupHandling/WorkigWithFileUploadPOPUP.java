package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkigWithFileUploadPOPUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		//to handle file upload by using sendkeys
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\User\\Desktop\\NotesTillSelectClass.pdf");
		

	}

}
