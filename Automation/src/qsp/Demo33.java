//Write a script to get the X-axis and Y-axis of search textBox present in FlipKart Application
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo33 {
    static {
    	System.setProperty("WebDriver.Chrome.Dtiver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     int Xaxis=driver.findElement(By.name("q")).getLocation().getX();
     int Yaxis=driver.findElement(By.name("q")).getLocation().getY();
     System.out.println(Xaxis);
     System.out.println(Yaxis);
     Thread.sleep(3000);
     driver.close();
	}

}
