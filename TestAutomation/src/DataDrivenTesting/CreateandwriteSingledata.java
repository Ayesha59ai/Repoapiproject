package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateandwriteSingledata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Automationframework");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cel = row.createCell(0);
		cel.setCellValue("Automationclass");
		FileOutputStream fos=new FileOutputStream("./TestData/framework.xlsx");
		book.write(fos);
		book.close();
		fos.close();

	}

}
