//write a script to create an excel file and enter some data into it(Empty Excel File)
package qsp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo89 {
public static void main(String[] args) throws IOException {
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("TestSheet");
	
	sheet.createRow(0);
	sheet.getRow(0).createCell(0).setCellValue("HDFC_001");
	sheet.getRow(0).createCell(1).setCellValue("Banking");
	
	sheet.createRow(1);
	sheet.getRow(1).createCell(0).setCellValue("TCS");
	sheet.getRow(1).createCell(1).setCellValue("IT");
	
	File f=new File("./Testdata/WriteDataInExcelSheet.xlsx");
	FileOutputStream fos=new FileOutputStream(f);
	workbook.write(fos);
	workbook.close();
	
 }
}
