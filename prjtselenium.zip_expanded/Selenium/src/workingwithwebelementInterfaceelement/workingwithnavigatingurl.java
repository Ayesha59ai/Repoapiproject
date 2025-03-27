package workingwithwebelementInterfaceelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithnavigatingurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/");
		//driver.navigate().to("https://www.amazon.com/");
		URL url=new url("https://www.amazon.com/");
		driver.navigate().to(url);
		System.out.println(driver.getTitle());
		

	}

}
