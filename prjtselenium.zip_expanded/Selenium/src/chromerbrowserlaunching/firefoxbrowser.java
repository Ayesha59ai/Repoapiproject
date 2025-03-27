package chromerbrowserlaunching;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.facebook.com/");

	}

}
