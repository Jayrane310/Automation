//write a script to get the links present in flipKart application and print it on the console
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo37{
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
    int count=alllinks.size();
    System.out.println(count);
    for (int i = 0; i < count; i++) {
		String link=alllinks.get(i).getText();
		System.out.println(link);
	}
    Thread.sleep(5000);
    driver.close();
	}

}
