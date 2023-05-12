//write a script to close only child window
package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo62 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demoqa.com/browser-windows");
     String pwin=driver.getWindowHandle();
     
     driver.findElement(By.xpath("//button[@id='windowButton']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@id='windowButton']")).click();
     Thread.sleep(3000);
     Set<String> allwin=driver.getWindowHandles();
     
     for (String s : allwin) {
		driver.switchTo().window(s);
		if (!(pwin.equals(s))) {
			driver.close();
		}
	  }
   }
}


