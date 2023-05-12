//write a script to login to actiTime application by using XPath by text function and enter UserName and password and click on login button 
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo19 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.actitime.com/login.do");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
      driver.findElement(By.xpath("//div[.='Login ']")).click();
    //driver.findElement(By.xpath("//div[text()='Login ']")).click();
      Thread.sleep(10000);
      driver.quit();
	}

}
