//write a script to scroll down to editor picks present in BBC application
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo82 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./driver/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.bbc.com/");
	  int y=driver.findElement(By.xpath("//span[.='Editor’s Picks']")).getLocation().getY();
      System.out.println(y);
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,"+y+")");
	  /*js.executeScript("window.scrollBy(0,2725)");
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,-2725)");*/
	  Thread.sleep(3000);
	  driver.close();
	  
	}

}
