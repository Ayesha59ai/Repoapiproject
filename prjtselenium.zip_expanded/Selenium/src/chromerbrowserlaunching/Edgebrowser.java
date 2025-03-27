package chromerbrowserlaunching;

import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EdgeDriver driver=new EdgeDriver();
       driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.facebook.com/");

	}

}
