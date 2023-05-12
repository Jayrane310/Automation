//write a script to right click on actiTime iNc link present in actiTime application and open new tab/window
package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo75 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demo.actitime.com/");
     WebElement element=driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
     Actions a=new Actions(driver);
     a.contextClick(element).perform();
     Robot r=new Robot();
     r.keyPress(KeyEvent.VK_T);//new tab will open
    //r.keyPress(KeyEvent.VK_W);//new window will open
     Thread.sleep(5000);
     driver.quit();
     
	}

}
