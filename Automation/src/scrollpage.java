//write a script to scroll web page up/down using Robot class
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollpage {
     static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     }
     public static void main(String[] args) throws InterruptedException, AWTException {
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.bbc.com/");
	      Thread.sleep(3000);
	      Robot r=new Robot();
	      r.keyPress(KeyEvent.VK_PAGE_DOWN);
	      Thread.sleep(3000);
	      r.keyPress(KeyEvent.VK_PAGE_UP);
	      Thread.sleep(3000);
	      driver.close();
	}
}
