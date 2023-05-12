//write a script to write the data into the property file (Empty Property File)
package qsp;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo85 {
public static void main(String[] args) throws IOException {
	Properties p=new Properties();
	/*p.put("browser","chrome");
	p.put("url","https://demo.actitime.com/login.do");
	p.put("username","admin");
	p.put("password","manager");*/
	
	p.setProperty("browser","chrome");
	p.setProperty("url","https://demo.actitime.com/login.do");
	p.setProperty("username","admin");
	p.setProperty("password","manager");
	
	//FileWriter fw=new FileWriter("./Testdata/writedata.property");
	FileOutputStream fos=new FileOutputStream("./Testdata/writedata.property");
	
	p.store(fos,"This is my property file");
	System.out.println("File Created");
	fos.close();

    
}
}
