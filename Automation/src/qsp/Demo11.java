//write a script to enter UserName and password on actiTime application and click on login button by using tagName,name,ID locator

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {
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
     driver.findElement(By.tagName("a")).click();
     Thread.sleep(3000);
     driver.close();
	}

}
