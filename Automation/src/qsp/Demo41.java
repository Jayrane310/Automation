//write a script to login and logout actiTime application by using explicit wait and by using titleIs method
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo41 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.actitime.com/login.do");
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.xpath("//div[.='Login ']")).click();
      
     Thread.sleep(5000);
     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
     wait.until(ExpectedConditions.titleIs(driver.getTitle()));
     
     driver.findElement(By.id("logoutLink")).click();
     
     driver.close();
	}

}
