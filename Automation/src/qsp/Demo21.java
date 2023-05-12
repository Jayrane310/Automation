//write a script to enter Football in amazon search box text field and click on search button and click on NiVia football product link using XPath by starts with function
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo21 {
	static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("football");
      driver.findElement(By.id("nav-search-submit-button")).click();
      driver.findElement(By.xpath("//span[starts-with(text(),'Nivia Black')]")).click();
      //driver.findElement(By.xpath("//span[starts-with(.,'Nivia Black')]")).click();
      //driver.findElement(By.xpath("//span[starts-with(@class,'a-size-base')]")).click();
      Thread.sleep(8000);
      driver.quit();
      
   }
}