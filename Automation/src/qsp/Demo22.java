//write a script to login to actiTime application by using XPath by normalize space function
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo22 {
	 static {
	    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	     }
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     driver.findElement(By.id("username")).sendKeys("admin");
	     Thread.sleep(3000);
	     driver.findElement(By.name("pwd")).sendKeys("manager");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//div[normalize-space(text())='Login']")).click();
	    //driver.findElement(By.xpath("//div[normalize-space(.)='Login']")).click();
	    // driver.findElement(By.xpath("//a[normalize-space(@id)='loginButton']")).click();
	     Thread.sleep(5000);
	     driver.close();
      }
}