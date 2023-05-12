//write a script to login to actiTime application by using data driven testing
package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo87 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    FileInputStream fis=new FileInputStream("./Testdata/Commondata.property");
    Properties p=new Properties();
    p.load(fis);
    String url=p.getProperty("url");
    String un =p.getProperty("username");
    String pw= p.getProperty("password");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get(url);    
    driver.findElement(By.id("username")).sendKeys(un);    
    driver.findElement(By.name("pwd")).sendKeys(pw);   
    driver.findElement(By.xpath("//div[.='Login ']")).click();
    
    Thread.sleep(5000);
    driver.close();
    
	}

}
