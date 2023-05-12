//write a script to handle mouseOver action present in V-Tiger application and get the text of bengaLuru India and print it on the console
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo74 {
     static {
    	 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
     }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.vtiger.com/");
     WebElement element=driver.findElement(By.partialLinkText("Resources"));
     Actions a=new Actions(driver);
     Thread.sleep(3000);
     a.moveToElement(element).perform();
    //a.moveToElement(element).build().perform();
     driver.findElement(By.partialLinkText("Contact Us")).click();
     String text=driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).getText();
     System.out.println(text);
     driver.close();
	}

}
