//write a script to get all the autoSuggetions present in flipKart application and print it on console 
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo38 {
 static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
     driver.findElement(By.name("q")).sendKeys("oneplus");
     Thread.sleep(5000);
     List<WebElement> allsugg=driver.findElements(By.xpath("//a[@class='_3izBDY']/.."));
     int count=allsugg.size();
     System.out.println(count);
     Thread.sleep(5000);
     for (int i = 0; i < count; i++) {
		String sugg=allsugg.get(i).getText();
		System.out.println(sugg);
	}
     Thread.sleep(5000);
     driver.close();
	}

}
