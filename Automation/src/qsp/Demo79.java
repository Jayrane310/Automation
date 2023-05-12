//write a script to handle tooltip using actions class methods
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo79 {
	   static {
	    	 System.setProperty("WebDriver.Chrome.Driver","./driver/chromedriver.exe");
	     }
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://demo.guru99.com/test/tooltip.html");
	     WebElement downloadButton=driver.findElement(By.xpath("//a[.='Download now']"));
	     Actions a=new Actions(driver);
	     Thread.sleep(3000);
	     a.clickAndHold().moveToElement(downloadButton);
	     a.moveToElement(downloadButton).build().perform();
	     downloadButton.click();
	     Thread.sleep(3000);
	     WebElement tooltip=driver.findElement(By.xpath("//div[@class='box']/div/a"));
	     
	     String actualToolTip=tooltip.getText();
	     Thread.sleep(3000);
	     System.out.println(actualToolTip);
	     
	     
	     String expectedToolTip="What's new in 3.2";
	     
	     if (actualToolTip.equalsIgnoreCase(expectedToolTip)) {
	    	 System.out.println("tooltip is matching");
			
		} else {
             System.out.println("tooltip is not matching");
		}
	     Thread.sleep(3000);
	     driver.close();
		}
}
