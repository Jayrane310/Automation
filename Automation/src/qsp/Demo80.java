//write a script to handle keyboard events in Actions class
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo80 {
	  static {
		System.setProperty("WebDriver.Chrome.Driver","./driver/chromedriver.exe");
	 }
        public static void main(String[] args) throws InterruptedException {
		  
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
   
        Actions a= new Actions(driver);
       
        WebElement text = driver.findElement(By.id("userName"));
        
        a.keyDown(Keys.SHIFT).build().perform();       
        text.sendKeys("q");
        Thread.sleep(3000);
        
        a.keyUp(Keys.SHIFT).build().perform();
        text.sendKeys("spider");
        Thread.sleep(3000);
        
        a.keyDown(Keys.SHIFT).build().perform();
        text.sendKeys(" i");
        Thread.sleep(3000);
        
        a.keyUp(Keys.SHIFT).build().perform();
        text.sendKeys("nstitute");
        Thread.sleep(3000);
        
        driver.close();

	}

}

