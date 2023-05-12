package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo63 {
     static {
    	// System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    	 System.setProperty("WebDriver.gecko.driver", "./driver/geckodriver.exe");
     }
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
   //ChromeDriver driver=new ChromeDriver();
	 FirefoxDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     Robot r=new Robot();
     r.keyPress(KeyEvent.VK_CONTROL);
     Thread.sleep(3000);
     r.keyPress(KeyEvent.VK_P);
     Thread.sleep(3000);
     r.keyRelease(KeyEvent.VK_CONTROL);
     Thread.sleep(3000);
     r.keyRelease(KeyEvent.VK_P);
     Thread.sleep(3000);
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(3000);
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(3000);
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(3000);
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(3000);
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(3000); 
     r.keyPress(KeyEvent.VK_TAB);
     Thread.sleep(3000);
     
     /*r.keyRelease(KeyEvent.VK_TAB);
     Thread.sleep(3000);*/
     r.keyPress(KeyEvent.VK_ENTER);
     Thread.sleep(3000);
     /*r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(3000);*/
     driver.close();    
	}

}
