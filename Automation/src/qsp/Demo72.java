package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo72 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demoqa.com/menu/");
     Actions a=new Actions(driver);
     WebElement mainItem2=driver.findElement(By.xpath("//a[.='Main Item 2']"));
     a.moveToElement(mainItem2).perform();
     
     Thread.sleep(3000);
     
     WebElement subSubList=driver.findElement(By.xpath("//a[.='SUB SUB LIST »']"));
     a.moveToElement(subSubList).perform();
     
     Thread.sleep(3000);
     
     WebElement subSubItem2=driver.findElement(By.xpath("//a[.='Sub Sub Item 2']"));
     subSubItem2.click();
     
     Thread.sleep(3000);
     driver.close();
     
	}

}
