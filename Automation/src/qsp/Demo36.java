//write a script to get X-axis,Y-axis,Height and Width of userName textField of actiTime application and print it on the console
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo36 {
     static {
    	 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.actitime.com/login.do");
      int x=driver.findElement(By.id("username")).getRect().getX();
      int y=driver.findElement(By.id("username")).getRect().getY();
      int height=driver.findElement(By.id("username")).getRect().getHeight();
      int width=driver.findElement(By.id("username")).getRect().getWidth();
      System.out.println(x);
      System.out.println(y);
      System.out.println(height);
      System.out.println(width);
      driver.close();
	}
	
}
