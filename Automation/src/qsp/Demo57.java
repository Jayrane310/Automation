//write a script to upload your resume in the found it application
package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo57 {
	static {
		 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	 }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.foundit.in/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
	    Thread.sleep(3000);
	   // driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\JAYESH\\eclipse-workspace\\Automation\\Testdata\\CV.pdf");
        
	    
	    File f=new File("./Testdata/CV.pdf");
	    String path=f.getAbsolutePath();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("file")).sendKeys(path);
	 	Thread.sleep(3000);
	    
	    driver.close();
	   
	    

	    
	}

}
