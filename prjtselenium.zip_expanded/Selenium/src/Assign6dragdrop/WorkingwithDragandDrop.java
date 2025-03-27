package Assign6dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
Thread.sleep(2000);
Actions act =new Actions(driver);
WebElement source = driver.findElement(By.xpath("//div[@id='box6']"));
Thread.sleep(2000);
WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));
act.moveToElement(source).clickAndHold().perform();
Thread.sleep(2000);
act.moveToElement(target).release().perform();	
Thread.sleep(2000);
WebElement source1 = driver.findElement(By.xpath("//div[@id='box1']"));
Thread.sleep(2000);
WebElement target1 = driver.findElement(By.xpath("//div[@id='box101']"));
act.moveToElement(source1).clickAndHold().perform();
Thread.sleep(2000);
act.moveToElement(target1).release().perform();
Thread.sleep(2000);
WebElement source2 = driver.findElement(By.xpath("//div[@id='box5']"));
Thread.sleep(2000);
WebElement target2 = driver.findElement(By.xpath("//div[@id='box105']"));
act.moveToElement(source2).clickAndHold().perform();
Thread.sleep(2000);
act.moveToElement(target2).release().perform();
Thread.sleep(2000);
WebElement source3 = driver.findElement(By.xpath("//div[@id='box3']"));
Thread.sleep(2000);
WebElement target3 = driver.findElement(By.xpath("//div[@id='box103']"));
act.moveToElement(source3).clickAndHold().perform();
Thread.sleep(2000);
act.moveToElement(target3).release().perform();
Thread.sleep(2000);
WebElement source4 = driver.findElement(By.xpath("//div[@id='box7']"));
Thread.sleep(2000);
WebElement target4 = driver.findElement(By.xpath("//div[@id='box107']"));
act.moveToElement(source4).clickAndHold().perform();
Thread.sleep(2000);
act.moveToElement(target4).release().perform();
Thread.sleep(2000);
WebElement source5 = driver.findElement(By.xpath("//div[@id='box4']"));
Thread.sleep(2000);
WebElement target5 = driver.findElement(By.xpath("//div[@id='box104']"));
act.moveToElement(source5).clickAndHold().perform();
Thread.sleep(2000);
act.moveToElement(target5).release().perform();
Thread.sleep(2000);
WebElement source6 = driver.findElement(By.xpath("//div[@id='box2']"));
Thread.sleep(2000);
WebElement target6 = driver.findElement(By.xpath("//div[@id='box102']"));
act.moveToElement(source6).clickAndHold().perform();
Thread.sleep(2000);
act.moveToElement(target6).release().perform();


}
}
