//write a script close all Windows without using quit method
package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo60 {
    static {
    	System.setProperty("WebDriver.Chrome.driver","./Driver/ChromeDriver.exe");
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
     Set<String>  allwin=driver.getWindowHandles();
     for (String string : allwin) {
		driver.switchTo().window(string);
		driver.close();
	}
	}

}
