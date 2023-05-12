//write a script to edit the data into the excel sheet
package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo90 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
     FileInputStream fis=new FileInputStream("./Testdata/ReadDataFromExcelSheet.xlsx");
     Workbook wb =WorkbookFactory.create(fis);
     wb.getSheet("Sheet1").getRow(3).getCell(1).setCellValue("Jspider");
     FileOutputStream fos=new FileOutputStream("./Testdata/ReadDataFromExcelSheet.xlsx");
     wb.write(fos);
	}

}
