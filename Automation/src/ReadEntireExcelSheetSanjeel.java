import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadEntireExcelSheetSanjeel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Testdata/ReadDataFromExcelSheet.xlsx");
    Workbook wb=WorkbookFactory.create(fis);
    int row=wb.getSheet("Sheet1").getLastRowNum();
   
   for(int i=0;i<=row;i++) {
	   int coloumn=wb.getSheet("Sheet1").getRow(i).getLastCellNum();
	   System.out.println("Row "+ i+" ==>>");
	   for (int j = 1; j < coloumn; j++) {
		String data=wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
		System.out.print(data +",");
	
	 }
	   System.out.println();
   }
  
 }
}
