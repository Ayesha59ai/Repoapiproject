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

public class Calculatordesktop {

	public static void main(String[] args) throws FindFailed, IOException {

		// To Open App
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Windows");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");

		WindowsDriver driver = new WindowsDriver(new URL("http://localhost:4723/wd/hub"), cap);
		
		
	Screen sc=new Screen();
	sc.click("C:\\Users\\User\\Pictures\\Screenshots\\calculator.png");
sc.click("C:\\Users\\User\\Pictures\\Screenshots\\+.png");
sc.click("C:\\Users\\User\\Pictures\\Screenshots\\9.png");
sc.click("C:\\Users\\User\\Pictures\\Screenshots\\=.png");
}
	}

