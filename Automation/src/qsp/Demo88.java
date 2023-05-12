//write a script to read the data from the excel sheet
package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo88 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
     FileInputStream fis=new FileInputStream("./Testdata/ReadDataFromExcelSheet.xlsx");
     Workbook wb=WorkbookFactory.create(fis);
     String ref=wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
     System.out.println(ref);
	}

}
