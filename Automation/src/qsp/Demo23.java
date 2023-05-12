//write a script to get the price from flipKart application of IQoo NeO mobile and print it on the console 
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo23 {
     static {
    	 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
     }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
     driver.findElement(By.name("q")).sendKeys("Iqoo neo");
     Thread.sleep(5000);
     driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
     Thread.sleep(5000);
     
     String price= driver.findElement(By.xpath("(//div[.='IQOO Neo 6 5G (Dark Nova, 256 GB)'])[1]/../../../div[2]/div[2]/div[1]/DIV[1]/div")).getText();
     Thread.sleep(5000);
     System.out.println(price);
     Thread.sleep(5000);
     driver.quit();
	}
}
