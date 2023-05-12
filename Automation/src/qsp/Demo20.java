//write a script to navigate to EBay WebSite and enter NoKia 1100 in searchBox TextField and Click on Search Button then go to that product link and click on that link and close the browser

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo20 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.ebay.com/");
     Thread.sleep(5000);
     driver.findElement(By.id("gh-ac")).sendKeys("nokia 1100");
     driver.findElement(By.id("gh-btn")).click();
     driver.findElement(By.xpath("(//span[contains(.,'Nokia 1100')])[2]")).click();
    //driver.findElement(By.xpath("(//span[contains (text(),'Nokia 1100')])[2]")).click();
     Thread.sleep(8000);
     driver.quit();
     
	}

}
