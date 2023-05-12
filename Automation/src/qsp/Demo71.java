//write a script to handle the frames
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo71 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///C:/Users/JAYESH/Desktop/t1.html");
      driver.findElement(By.id("tb")).sendKeys("Q");
      Thread.sleep(2000);
      driver.switchTo().frame(0);
      driver.findElement(By.id("tb2")).sendKeys("J");
      Thread.sleep(2000);
      driver.switchTo().parentFrame();
      driver.findElement(By.id("tb")).sendKeys("s");
      Thread.sleep(2000);
      driver.switchTo().frame(0);
      driver.findElement(By.id("tb2")).sendKeys("s");
      Thread.sleep(2000);
      driver.switchTo().parentFrame();
      driver.findElement(By.id("tb")).sendKeys("p");
      Thread.sleep(2000);
      driver.switchTo().frame(0);
      driver.findElement(By.id("tb2")).sendKeys("p");
      Thread.sleep(2000);
      driver.switchTo().parentFrame();
      driver.findElement(By.id("tb")).sendKeys("i");
      Thread.sleep(2000);
      driver.switchTo().frame(0);
      driver.findElement(By.id("tb2")).sendKeys("i");
      Thread.sleep(2000);
      driver.switchTo().parentFrame();
      driver.findElement(By.id("tb")).sendKeys("d");
      Thread.sleep(2000);
      driver.switchTo().frame(0);
      driver.findElement(By.id("tb2")).sendKeys("d");
      Thread.sleep(2000);
      driver.switchTo().parentFrame();
      driver.findElement(By.id("tb")).sendKeys("e");
      Thread.sleep(2000);
      driver.switchTo().frame(0);
      driver.findElement(By.id("tb2")).sendKeys("e");
      Thread.sleep(2000);
      driver.switchTo().parentFrame();
      driver.findElement(By.id("tb")).sendKeys("r");
      Thread.sleep(2000);
      driver.switchTo().frame(0);
      driver.findElement(By.id("tb2")).sendKeys("r");
      Thread.sleep(2000);
      driver.close();
      
      
	}

}
