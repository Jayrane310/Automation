//write a script to get the cssValue of KaLyan JeweLlers LoGo present in KaLyan JeweLlers application
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo34 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.kalyanjewellers.net/");
    String cv=driver.findElement(By.xpath("(//img[@title='Kalyan Jewellers'])[2]")).getCssValue("color");
    System.out.println(cv);
    Thread.sleep(5000);
    driver.close();
	}

}
