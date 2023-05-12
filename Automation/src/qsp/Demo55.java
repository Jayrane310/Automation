//write a script handle fileDownload PopUp in FB application
package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo55 {
	static {
   	 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();	    
	    driver.get("https://www.facebook.com/");
	    Robot r=new Robot();
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_CONTROL);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_S);
	    Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);	    

	    r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	}
}
