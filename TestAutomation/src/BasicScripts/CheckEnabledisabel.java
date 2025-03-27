package BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEnabledisabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/ayesha/OneDrive/Desktop/New%20folder-htmlcss/disableenable.html");
	WebElement UN = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
    if(UN.isDisplayed()) 
    {
    	            if(UN.isEnabled()) {
    	            	UN.sendKeys("Ayesha");
    	            	    }
    	            else {
    	            	System.out.println("UN is disabled");
    	            }
    }
    else {
    	System.out.println("UN is not displayed");
    }
    
    WebElement cb = driver.findElement(By.xpath("//input[@type='checkbox']"));
    if(cb.isDisplayed()) {
    	  
    	     if(cb.isEnabled()) {
    	    	        if(cb.isSelected()) {
    	    	        	System.out.println("It is selected");
    	    	        	cb.click();
    	    	        }
    	    	        else {
    	    	        	System.out.println("It is not selected");
    	    	        }
    	     }
    	     else {
    	    	 System.out.println("It is disabled");
    	     }
    }
    else {
    	System.out.println("it is not displayed");
    }
    
    
	}

}
