//write a script get all the data present in excel sheet and print it on the console
package qsp;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo94 {
	public static  void main(String args[]) throws IOException {
     
        FileInputStream fis= new FileInputStream("./Testdata/ReadDataFromExcelSheet.xlsx");
        
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet=wb.getSheet("Sheet1");
        
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
       
       
        for(int i=0;i<=rowCount;i++){
            
            int cellcount=sheet.getRow(i).getLastCellNum();
            System.out.println("Row "+ i+ " ==>>");
            
            for(int j=1;j<cellcount;j++){
             //System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
             String	data=sheet.getRow(i).getCell(j).getStringCellValue();
             System.out.print(data +",");
            }
            System.out.println();
        }
	}
}
