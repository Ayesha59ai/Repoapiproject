package demoverify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginverifypg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.className("ico-login")).click();
        String loginPageTitle=driver.getTitle();
        if(loginPageTitle.equals("Demo Web Shop. Login"))
        {
        	System.out.println("Pass...");
        }
        else
        {
        	System.out.println("Fail...");
        
        }
        driver.findElement(By.className("email")).sendKeys("ayeshafathi@gmail.com");
    	driver.findElement(By.className("password")).sendKeys("ayesha@gmail");
    	driver.findElement(By.id("RememberMe")).click();
    	driver.findElement(By.id("button-1 login-button")).click();
    	
    	Thread.sleep(3000);
    	driver.close();
	}

}
