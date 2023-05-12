//write a script to get the Height and Width of UserName TextField of an actiTime Application and print it on console
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo32 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.actitime.com/login.do");
      int height=driver.findElement(By.name("username")).getSize().getHeight();
      int width=driver.findElement(By.name("username")).getSize().getWidth();
      
      System.out.println(height);
      System.out.println(width);
      Thread.sleep(5000);
      driver.close();
	}

}
