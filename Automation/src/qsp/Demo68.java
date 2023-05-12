//write a script to get all suggeTions from flipKart application and print it on the console using forEach loop
package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo68 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.flipkart.com/");
       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
       driver.findElement(By.name("q")).sendKeys("iphone 13");
       
       List<WebElement> allsugg=driver.findElements(By.xpath("//a[@class='_3izBDY']"));
       int count=allsugg.size();
       System.out.println(count);
       for (WebElement opt: allsugg) {
		   String s=opt.getText();
		   System.out.println(s);
	}
       Thread.sleep(3000);
       driver.close();
     
	}

}
