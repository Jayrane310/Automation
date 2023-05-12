//write a script to click on opensourceBilling submit button using submit method
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo31 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
      driver.findElement(By.id("user_login_btn")).submit();
      Thread.sleep(5000);
      driver.close();
	}

}
