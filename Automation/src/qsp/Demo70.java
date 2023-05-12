//write a script to handle frames and transfer the control back to main page
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo70 {
      static {
    	  System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
      }
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/JAYESH/Desktop/WebTech/DemoA.html");
	driver.findElement(By.id("t1")).sendKeys("abc");
	
	driver.switchTo().frame(0);
	//driver.switchTo().frame("f1");
	
	//WebElement f=driver.findElement(By.className("c1"));
	//driver.switchTo().frame(f);
	
	driver.findElement(By.id("t2")).sendKeys("xyz");
	
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("123c");
    
	Thread.sleep(3000);
	driver.close();
	
   }     
}
