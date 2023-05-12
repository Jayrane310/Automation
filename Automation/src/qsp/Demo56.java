//write a script to upload your resume in demo application
package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo56 {
	static {
		 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	 }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/JAYESH/Desktop/fileupload.html");
	    Thread.sleep(3000);
	    File f=new File("./Testdata/CV.pdf");
	    //File f=new File("C:\\Users\\JAYESH\\eclipse-workspace\\Automation\\Testdata\\CV.pdf");
	   
	    String path=f.getAbsolutePath();
	   
	    driver.findElement(By.id("cv")).sendKeys(path);
	    Thread.sleep(3000);
	    driver.close();	    
	}

}
