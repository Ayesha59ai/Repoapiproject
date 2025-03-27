package AssigntDemoshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyuserabletoReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step1:Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");
        //step2:validate demo web page is displayed or not
        String loginPageTitle=driver.getTitle();
        if(loginPageTitle.equals("Demo Web Shop"))
        {
        	System.out.println("demo web shop  page is displayed");
        }
        else
        {
        	System.out.println("Fail....");
        
        }
        
        //Step3:Clicking on Register button
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        String loginPageTitle1=driver.getTitle();
        //step4:validate demo register page is displayed or not
        if(loginPageTitle.equals("Demo Web Shop. Register"))
        {
        	System.out.println("Demo Web ShopRegister is dislpayed");
        }
        else
        {
        	System.out.println("Fail...");
        
        }
        driver.findElement(By.name("Gender")).click();
        driver.findElement(By.name("FirstName")).sendKeys("ayesha");
        driver.findElement(By.name("LastName")).sendKeys("fathi");
        driver.findElement(By.name("Email")).sendKeys("ayeshafathi@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("ayesha@gmail");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("ayesha@gmail");
        driver.findElement(By.name("register-button")).click();
        //step5:validate regiter completed displayed or not
       WebElement regist = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
	System.out.println(regist.isDisplayed());
	
	/
	/
	/
	
	}

}
