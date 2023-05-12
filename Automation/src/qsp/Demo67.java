//write a script to get all the links from the amazon application and paste it on the console using forEach loop
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo67 {
     static {
    	 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
      List<WebElement> Alllinks= driver.findElements(By.xpath("//a"));
      for (WebElement link : Alllinks) {
	    String text=link.getText();
		System.out.println(text);
	}
       driver.close();   
	}
}
