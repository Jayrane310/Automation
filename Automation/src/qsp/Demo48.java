//write a script to get ALL the options present in hotel TajMenu and print it on the console without using getOptions method 
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo48 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("file:///C:/Users/JAYESH/Desktop/TajMenu.html");
    WebElement alloption= driver.findElement(By.id("taj menu"));
    Thread.sleep(3000);
    System.out.println(alloption.getText());
    /*String AOT=alloption.getText();
    Thread.sleep(3000);
    System.out.println(AOT);*/
     driver.close();
	}

}
