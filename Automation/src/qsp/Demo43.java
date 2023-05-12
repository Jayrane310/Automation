//write a script to use custom wait for actiTime application and logout the Application and close the browser
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo43 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Drier/ChromeDriver.exe");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.xpath("//div[.='Login ']")).click();
    int i=0;
    while (i<1000) {
    	try {
    		driver.findElement(By.id("logoutLink")).click();
        	break;
        	
			
		} catch (Exception e) {
			// TODO: handle exception
			i++;
		}
    	
	}
    driver.close();
    
	}

}
