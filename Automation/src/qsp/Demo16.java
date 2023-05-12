//write a script to open FlipKart link present in Demo XPath HTML page using Absolute XPath and Relative XPath
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo16 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/JAYESH/Desktop/xpath.html");
    driver.findElement(By.xpath("/html/body/a[2]")).click(); //Absolute XPath
  //driver.findElement(By.xpath("//a[@id='content']")).click(); //Relative XPath
    driver.close();
	}

}
