//write a script get all the data present in excel cell and print it on the console
package qsp;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo93 {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Testdata/ReadDataFromExcelSheet.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
    int lastCellNum=wb.getSheet("sheet1").getRow(0).getLastCellNum();
    System.out.println(lastCellNum);
    for (int i = 1; i <= lastCellNum; i++) {
    String data=wb.getSheet("sheet1").getRow(0).getCell(i).getStringCellValue();
    System.out.println(data);
		
	}
    fis.close();
    
   }
}