 package Calculator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import io.appium.java_client.windows.WindowsDriver;

public class Wordautomate {

	public static void main(String[] args) throws MalformedURLException, FindFailed, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Windows");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("app", "C:\\Program Files\\Microsoft Office\\Office16\\WINWORD.EXE");

		WindowsDriver driver = new WindowsDriver(new URL("http://localhost:4723/wd/hub"), cap);

                 Screen sc = new Screen();
                 sc.click("C:\\Users\\User\\Pictures\\Screenshots\\close.png");
                 
                sc.click("C:\\Users\\User\\Pictures\\Screenshots\\maximizeword.png");
                 
                 sc.click("C:\\Users\\User\\Pictures\\Screenshots\\blanlDoc.png");
                 sc.write("Hello...");
                 sc.click("C:\\Users\\User\\Pictures\\Screenshots\\cancelWord.png");
                 sc.click("C:\\Users\\User\\Pictures\\Screenshots\\dontsaveword.png");
	}

}
