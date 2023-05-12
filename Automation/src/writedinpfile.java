//write a script to write the data into the property file
import java.io.FileOutputStream;
import java.io.IOException;

public class writedinpfile {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   String st="HALA MADRID Y NADA MAS";
    
  
   FileOutputStream fos=new FileOutputStream("./Testdata/set.property");
   char[] ch = st.toCharArray();
   for (int i = 0; i < st.length(); i++) {
	fos.write(ch[i]);
	
	
}
   fos.close();                                                                                                        //fos.close();

   }
}