//write a script to use methods of Mouse Events present in robot class
//write a script navigate to google home page and right click on images link present in the page
package qsp;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo66{
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Robot r=new Robot();
		Thread.sleep(3000);
		r.mouseMove(1308,150);
		Thread.sleep(3000);
		
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		driver.close();	
	}
}
