package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class usingtwodArrayFetchingMultipleValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
       FileInputStream fis=new FileInputStream("./Testdata/Book2.xlsx");
      Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		//to get last Row
		
		int lastRowNum=sh.getPhysicalNumberOfRows();//i=0;i<lastRowNum
		//to get cell number
		int lastCellNum = sh.getRow(0).getPhysicalNumberOfCells();//j=0;j<lastcellNum
		//for rows
		for(int i=0;i<lastRowNum;i++)
		{
			//for cell
			for(int j=0;j<lastCellNum;j++) {
				String value=sh.getRow(i).getCell(j).toString()	;			
		         System.out.print(value);
				
			}
			System.out.println();
		}
		
		
	}

}
