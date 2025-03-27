package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class commonUtility {
Select s;
public String getCurrentTime() {
	
	return LocalDateTime.now().toString().replace(":", "-");
}

public int getRandomNumber() {
	Random r=new Random();
	return r.nextInt(1000);
}
	public String takeScreenShot(WebDriver driver) {
		String path=FrameworkComponent.ScreenShot_path+getCurrentTime()+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(path);
		try {
			FileHandler.copy(scr, trg);
		}
		catch (IOException e) {
// TODO: handle exception
			e.printStackTrace();
		}
		return "." +path;
		}
		public void acceptAlertPopup(WebDriver driver) {
			driver.switchTo().alert().accept();
			
		}
		public void dismissAlertPopup(WebDriver driver) {
			driver.switchTo().alert().dismiss();
			
		}
		public void selectDropDownByIndex(WebElement dropdown,int indexnum) {
			s=new Select(dropdown);
			s.selectByIndex(indexnum);
		}
		public void selectDropDownByVisibleText(WebElement dropdown,String value) {
			s=new Select(dropdown);
			s.selectByValue(value);
		}
	}
