//write a script to upload your resume in naukri.com
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo58 {
     static {
    	 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
     }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
     driver.get("https://www.naukri.com/");
     driver.findElement(By.id("login_Layer")).click();
     driver.findElement(By.id("eLogin")).sendKeys("abc@gmail.com");
     driver.findElement(By.id("pLogin")).sendKeys("xyz123");
     driver.findElement(By.xpath("//button[text()='Login']")).submit();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//a[text()='View Profile']")).click();
    
     driver.findElement(By.id("uploadLink")).click();
     driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\JAYESH\\eclipse-workspace\\Automation\\Testdata\\CV.pdf");
    
     Thread.sleep(5000);
     driver.close();     
	}
}