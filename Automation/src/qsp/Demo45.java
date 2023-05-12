//write a script to select multiple options from TajHotel DropDown and DeSelect few options one by one  
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo45 {
     static {
      System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
     }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("file:///C:/Users/JAYESH/Desktop/TajMenu.html");
     WebElement taj=driver.findElement(By.id("taj menu"));
     Select s=new Select(taj);
     s.selectByIndex(7);
     Thread.sleep(3000);
     
     s.selectByValue("id");
     Thread.sleep(3000);
     
     s.selectByVisibleText("Frankie");
     Thread.sleep(3000);
     
     s.selectByVisibleText("Coffee");
     Thread.sleep(3000);
     
     s.selectByValue("dos");
     Thread.sleep(3000);
     
     s.selectByIndex(11);
     Thread.sleep(3000);
     
     s.deselectByIndex(7);
     Thread.sleep(3000);
     
     s.deselectByValue("dos");
     Thread.sleep(3000);
     
     s.deselectByVisibleText("Frankie");
     Thread.sleep(3000);
     
     s.deselectByVisibleText("Coffee");
     Thread.sleep(3000);
     
     driver.close();
     
	}

}
