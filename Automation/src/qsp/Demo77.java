//write a script to perform drag and drop actions in dhtmlGoodies.com
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo77 {
    static {
    System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
     WebElement src=driver.findElement(By.xpath("//h1[.='Block 1']"));
     
     WebElement dest=driver.findElement(By.xpath("//h1[.='Block 4']"));
     Thread.sleep(3000);
     Actions a=new Actions(driver);
     Thread.sleep(3000);
     a.dragAndDrop(src, dest).perform();
     Thread.sleep(3000);
     driver.close();
     
     
     
	}

}
