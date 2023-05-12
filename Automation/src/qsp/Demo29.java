//write a script to verify that InstaGram Login Button is enabled or not in InstaGram application 
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo29 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.instagram.com/");
     boolean button =driver.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'])[1]")).isEnabled();
	if(button==true) {                              
		System.out.println("login button is enabled");
	} else {
       System.out.println("login button is not enabled");
	}	  
     Thread.sleep(5000);
     
	 driver.close();
	}

}
