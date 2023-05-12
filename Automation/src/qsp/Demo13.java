//write a script to click on dream11 link and come backward and again click on CricBuzz link present on demo HTML page using LinkText locator
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///C:/Users/JAYESH/Desktop/dream11dhoni.html");
      driver.findElement(By.linkText("Dream11 fantasy")).click();
      Thread.sleep(5000);
      driver.navigate().back();
      Thread.sleep(5000);
      driver.findElement(By.linkText("Dhoni mania")).click();
      Thread.sleep(5000);
      driver.close();
	}

}
