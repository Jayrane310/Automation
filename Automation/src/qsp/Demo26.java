//Write a Script to open FaceBook page and enter UserName and password and click on login button
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo26 {
	static{
		System.setProperty("WebDriver.Chrome.driver","./driver/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      Thread.sleep(5000);
      driver.findElement(By.name("email")).sendKeys("abc@123");
      driver.findElement(By.name("pass")).sendKeys("xyz@123");
      driver.findElement(By.name("login")).click();
      Thread.sleep(5000);
      driver.close();
      
	}

}
