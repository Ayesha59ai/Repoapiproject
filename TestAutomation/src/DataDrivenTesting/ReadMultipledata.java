package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipledata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./TestData/Facebookcrediential.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=Workbook.getSheet("Sheet1");
		
int lr=sheet.getLastRowNum();
	for(int i=0;i<=lr;i++) {
		XSSFRow row = sheet.getRow(i);
		XSSFCell cel1 = row.getCell(0);
		String c1val1 = cel1.getStringCellValue();
		XSSFCell cel2 = row.getCell(1);
		String c2val2 = cel2.getStringCellValue();
		System.out.println(c1val1+ " "+" "+c2val2);
		
	}
Workbook.close();
fis.close();
	}

}
