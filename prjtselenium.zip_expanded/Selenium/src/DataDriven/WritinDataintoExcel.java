package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritinDataintoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		  FileInputStream fis=new FileInputStream("./Testdata/Book2.xlsx");
	      Workbook book = WorkbookFactory.create(fis);
			Sheet sh = book.getSheet("Sheet2");
			//...1 if already value is present in cell
			sh.getRow(0).getCell(0).setCellValue("Selenium");
			//...2 without value in the cell
			//sh.createRow(0).createCell(0).setCellValue("selenium class");
			
			FileOutputStream fos=new FileOutputStream("./Testdata/Book2.xlsx");
			
		    // to write data
			book.write(fos);
			//compulsory method
			fos.flush();
			

	}

}
