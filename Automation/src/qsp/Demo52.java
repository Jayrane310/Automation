//write a script to select DOB from care Insurance application (hidden division/CalenDer Pop-up 
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo52 {
    
	static {
		 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	 }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	    driver.findElement(By.id("dob")).click();
	    WebElement selectmonth=driver.findElement(By.xpath("//select[1]"));
	    Select s=new Select(selectmonth);
	    Thread.sleep(3000);
	    s.selectByVisibleText("Oct");
	    Thread.sleep(3000);
	    WebElement selectyear=driver.findElement(By.xpath("//select[2]"));
	    Select s1=new Select(selectyear);
	    Thread.sleep(3000);
	    s1.selectByVisibleText("1950");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@class='ui-state-default'])[21]")).click();
	    Thread.sleep(3000);
	    driver.close();
	    

	}

}
