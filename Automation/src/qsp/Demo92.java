//write a script get all the data present in excel row and print it on the console
package qsp;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo92 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Testdata/ReadDataFromExcelSheet.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
    int lastRowNum=wb.getSheet("sheet1").getLastRowNum();
    System.out.println(lastRowNum);
    for (int i = 0; i <= lastRowNum; i++) {
    String data=wb.getSheet("sheet1").getRow(i).getCell(1).getStringCellValue();
    System.out.println(data);
		
	}
    fis.close();
    
}
}
