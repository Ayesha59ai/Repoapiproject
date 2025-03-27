package KeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;import javax.swing.text.JTextComponent.KeyBinding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithROBATclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		//Thread.sleep(3000);
		//driver.findElement(By.id("APjFqb")).click();
		//Thread.sleep(3000);
		Robot r =new Robot();
		//r.keyPress(KeyEvent.VK_S);
		//r.keyRelease(KeyEvent.VK_S);
		//r.keyPress(KeyEvent.VK_E);
		//r.keyRelease(KeyEvent.VK_E);
		//r.keyPress(KeyEvent.VK_L);
		//r.keyRelease(KeyEvent.VK_L);
		//r.keyPress(KeyEvent.VK_E);
		//r.keyRelease(KeyEvent.VK_E);
		//r.keyPress(KeyEvent.VK_N);
		//r.keyRelease(KeyEvent.VK_N);
		//r.keyPress(KeyEvent.VK_I);
		//r.keyRelease(KeyEvent.VK_I);
		//r.keyPress(KeyEvent.VK_U);
		//r.keyRelease(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		
		
		}

}
