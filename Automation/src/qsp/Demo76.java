//Write a script to perform double click action on guru99.coM
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo76 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.guru99.com/test/simple_context_menu.html");
       WebElement element=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
       Actions a=new Actions(driver);
       Thread.sleep(3000);
       a.doubleClick(element).perform();
       Thread.sleep(3000);
       driver.quit();
       
	}

}
