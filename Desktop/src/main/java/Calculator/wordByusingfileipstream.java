package Calculator;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.appium.java_client.windows.WindowsDriver;

public class wordByusingfileipstream {

	public static void main(String[] args) throws IOException, FindFailed {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Windows");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("app", "\"C:\\Program Files\\Microsoft Office\\Office16\\WINWORD.EXE\"");

		WindowsDriver driver = new WindowsDriver(new URL("http://localhost:4723/wd/hub"), cap);
		
		FileInputStream fis= new FileInputStream("C:\\Users\\User\\Pictures\\Screenshots\\close.png");
		BufferedImage buff=ImageIO.read(fis);
		
	Pattern p = new Pattern(buff);
	Screen sc=new Screen();
	sc.click(p);
	
	FileInputStream fis1 = new FileInputStream("C:\\Users\\User\\Pictures\\Screenshots\\blanlDoc.png");
    BufferedImage buff1=ImageIO.read(fis1);
    Pattern p1=new Pattern(buff1);
    
    sc.click(p1);
    sc.write("Hello");
    
    
	}

}
