//write a script to get the rate of manufacturing type of work present in actiTime application and print it on the console
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo24 {
	static {
		System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.actitime.com/login.do");
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.xpath("//div[.='Login ']")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//a[.='Types of Work']")).click();
     Thread.sleep(5000);
    String price=driver.findElement(By.xpath("//a[.='manufacturing']/../../td[4]/span[1]")).getText();
    System.out.println(price);
    Thread.sleep(5000);
    driver.close();
     
     
	}

}
