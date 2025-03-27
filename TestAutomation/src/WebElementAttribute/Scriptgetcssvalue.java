package WebElementAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptgetcssvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.netflix.com/");
		WebElement Signin = driver.findElement(By.linkText("Sign In"));
		String Val = Signin.getCssValue("background-color");
		System.out.println(Val);
		

	}

}
