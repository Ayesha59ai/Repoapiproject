package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingwithExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("./Testdata/Book1.xlsx");
		//to access workbook
		Workbook book= WorkbookFactory.create(fis);
		//to access sheet
		Sheet sh = book.getSheet("Sheet1");
		//to access row
		Row row = sh.getRow(2);
		//to access cell
		Cell cell = row.getCell(0);
		//to fetch the data in string format
//		String value =cell.getStringCellValue();
//		System.out.println(value);
		
		//to fetch data in number format
//		double value = cell.getNumericCellValue();
//		System.out.println(value);

		String value = sh.getRow(0).getCell(0).toString();
		System.out.println(value);
		
		String value1 = sh.getRow(2).getCell(0).toString();
		
		System.out.println(value1);
	}

}
