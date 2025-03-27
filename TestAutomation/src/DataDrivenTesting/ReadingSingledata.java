package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingSingledata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./TestData/Facebookcrediential.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=Workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cel=row.getCell(0);
		String valuser = cel.getStringCellValue();
		XSSFRow row1=sheet.getRow(1);
		XSSFCell cel1=row.getCell(1);
		String valpassword = cel1.getStringCellValue();
		System.out.println(valuser);
		System.out.println(valpassword);
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(valuser);
		WebElement pass = driver.findElement(By.id("pass"));
pass.sendKeys(valpassword);
WebElement loginbtn = driver.findElement(By.name("login"));
loginbtn.click();
		Workbook.close();
		fis.close(); 
		driver.close(); 
		

	}

}
