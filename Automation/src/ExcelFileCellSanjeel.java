import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileCellSanjeel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Testdata/ReadDataFromExcelSheet.xlsx");
    Workbook wb=WorkbookFactory.create(fis);
    
   int coloumn=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
   for(int i=0;i< 1;i++) {
	   for (int j = 1; j < coloumn; j++) {
		String data=wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
		System.out.println(data);
       }
	   break;
     }
   }	
}