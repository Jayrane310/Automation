//write a script to scroll web page up/down using Actions class
package qsp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo81 {
	static {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.bbc.com/");
      Thread.sleep(3000);
      Actions a=new Actions(driver);
      a.sendKeys(Keys.PAGE_DOWN).build().perform();
      Thread.sleep(3000);
      a.sendKeys(Keys.PAGE_UP).build().perform();
      Thread.sleep(3000);
      driver.close();
	}
}
