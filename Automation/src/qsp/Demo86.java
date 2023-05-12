//write a script to edit the data in property file
package qsp;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo86 {
	public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("./Testdata/editdatain.property");
	
	Properties p=new Properties();
    p.load(fis);
    String WB= p.getProperty("browser");
    System.out.println(WB);
	
	p.setProperty("browser","Firefox");
	
	
	FileOutputStream fos=new FileOutputStream("./Testdata/editdatain.property");
	p.store(fos,"Data is edited");
	
	fos.close();
   }	
}
