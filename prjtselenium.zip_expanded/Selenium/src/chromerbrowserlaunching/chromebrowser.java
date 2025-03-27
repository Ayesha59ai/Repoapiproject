package chromerbrowserlaunching;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.facebook.com/");
		

	}

}
