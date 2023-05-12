//write a script to select day,month and year from the FaceBook Application
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo44{
    static {
    	System.setProperty("Webdriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	 
     Thread.sleep(3000);
	 
	 WebElement daydropdown=driver.findElement(By.id("day"));
	 Thread.sleep(3000);
	 Select s=new Select(daydropdown);
	 Thread.sleep(3000);
	 s.selectByIndex(20);//by using index method
	 
	 Thread.sleep(3000);
	 
	 WebElement monthdropdown=driver.findElement(By.id("month"));
	 Thread.sleep(3000);
	 Select s1=new Select(monthdropdown);
	 Thread.sleep(3000);
	 s1.selectByValue("10");//by using value method
	 
	 Thread.sleep(3000);
	 
	 WebElement yeardropdownElement=driver.findElement(By.id("year"));
	 Thread.sleep(3000);
	 Select s2= new Select(yeardropdownElement);
	 Thread.sleep(3000);
	 s2.selectByVisibleText("1990");//by using visibleText method
	 
	 Thread.sleep(3000);
	 driver.close();
	 
	 
	}

}
