//write a script to click on dream11 link by using className locator
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {
    static {
    System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");	
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("file:///C:/Users/JAYESH/Desktop/dream11dhoni.html");
     driver.findElement(By.className("captain")).click();
     Thread.sleep(3000);
     driver.close();
	}

}
