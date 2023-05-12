//write a script to get the attribute value of KalYan JeweLlers application LoGo
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo35 {
    static {
    	System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.kalyanjewellers.net/");
     String value=driver.findElement(By.xpath("(//img[@alt='Kalyan'])[1]")).getAttribute("alt");
     Thread.sleep(5000);
     System.out.println(value);
     driver.close();
	}
}
