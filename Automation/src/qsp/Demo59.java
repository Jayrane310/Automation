//Write a script to close parent as well as childWindow
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo59 {
	
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demoqa.com/browser-windows");
     driver.findElement(By.xpath("//button[@id='windowButton']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@id='windowButton']")).click();
     Thread.sleep(3000);
     driver.quit();
	}

}
