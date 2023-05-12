//write a script to clear the userName and password present in openSource billing.com
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo25 {
      static {
    	  System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    	 
      }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.opensourcebilling.org/en/portal/clients/sign_in");
     Thread.sleep(5000);
     driver.findElement(By.id("email")).clear();
     Thread.sleep(5000);
     driver.findElement(By.name("portal_client[password]")).clear();
     Thread.sleep(5000);
     driver.quit();
	}

}
