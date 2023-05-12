//write a script to clink on dream11 link by using name locator
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {
    static {
    System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");	
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///C:/Users/JAYESH/Desktop/dream11dhoni.html");
      driver.findElement(By.name("thala")).click();
      Thread.sleep(3000);
      driver.close();
	}

}
