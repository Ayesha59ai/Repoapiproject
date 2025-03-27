package AssgnPOPUPmsg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stubx
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("13456788765");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alt = driver.switchTo().alert();
        String msg = alt.getText();
        System.out.println(msg);
        alt.accept();
        alt.accept();
        driver.close();

	}

}
