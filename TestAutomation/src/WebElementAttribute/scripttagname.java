package WebElementAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scripttagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new	ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.netflix.com/");
		WebElement Signin = driver.findElement(By.linkText("Sign In"));
		String TN = Signin.getTagName();
		System.out.println(TN);
		

	}

}
