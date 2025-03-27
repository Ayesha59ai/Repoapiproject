package PopupHandling;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingCalanderPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
		Calendar cal=Calendar.getInstance();
		Date date=cal.getTime();
		 SimpleDateFormat format = new SimpleDateFormat("MM/DD/YYY");
		 String modDate=format.format(date);
		 System.out.println(modDate);
		 driver.findElement(By.id("datepicker")).sendKeys(modDate,Keys.ESCAPE);
}
}
