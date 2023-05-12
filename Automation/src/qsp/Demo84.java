//write a script to read the data from property File
package qsp;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo84 {
   
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
  //FileReader fr=new FileReader("./Testdata/commondata.property");
  
    Properties p=new Properties();
    
    p.load(fis);
  //p.load(fr);
    String url=p.getProperty("url");
    System.out.println(url);
  }
}
