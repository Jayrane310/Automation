//write a script to open QSpider link present in Demo QSpider HTML page
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo18 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///C:/Users/JAYESH/Desktop/operators.html");
      driver.findElement(By.xpath("//a[@id='Thane' and @name='makhmali']")).click();//it will locate element
      //driver.findElement(By.xpath("//a[@id='Thane' and @name='makh']")).click();//it will not locate element
      //driver.findElement(By.xpath("//a[@id='Thane' or @name='makhmali']")).click();//it will locate element
      //driver.findElement(By.xpath("//a[@id='Thane' or @name='makh']")).click();//it will locate element
      

	}

}
