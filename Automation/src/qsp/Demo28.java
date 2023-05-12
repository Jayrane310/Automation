//write a script to verify that login button is enabled or not in faceBook AppliCaion
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo28 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
    boolean button= driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
    if (button==true) {
		System.out.println("login button is enabled");
	} else {
       System.out.println("login button is not enabled");
	}
    
    Thread.sleep(5000);
    driver.close();
    
	}

}
