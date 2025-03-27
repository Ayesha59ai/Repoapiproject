package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchtextofurlstoreinexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int nooflinks = links.size();
	XSSFWorkbook book = new XSSFWorkbook();
	XSSFSheet sheet = book.createSheet("FlipkartText");
	for(int i=0;i<nooflinks;i++) {
		WebElement link = links.get(i);//0
		String text = link.getText();
		XSSFRow row = sheet.createRow(i);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue(text);
	}
	FileOutputStream fos=new FileOutputStream("./TestData/flipkartText.xlsx");
	book.write(fos);
	book.close();
	fos.close();

	}

}
