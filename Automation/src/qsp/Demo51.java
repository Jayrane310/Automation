//write a script to handle alert/Confirmation/javaScript pop-up
package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo51 {
	static {
		 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	 }
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	    driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
	    driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	    driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("zingurr");
	    driver.findElement(By.xpath("(//div[.='Cancel'])[27]")).click();
	    Alert a=driver.switchTo().alert();
	    String text=a.getText();
		System.out.println(text);
	    a.accept();
	   //a.dismiss();
	    Thread.sleep(3000);
	    driver.close();
	    
	     
	     
	}

}
