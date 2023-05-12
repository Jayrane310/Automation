package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo73 {
	static{
	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demoqa.com/slider/");
      
     Actions a=new Actions(driver);
     WebElement slider=driver.findElement(By.id("sliderContainer"));
     Thread.sleep(3000);
     a.moveToElement(slider,50,0).perform();
     slider.click();
     Thread.sleep(3000);
     driver.close();
	}

}
