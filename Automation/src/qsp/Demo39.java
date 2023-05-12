//write a script to get all the autoSuggestion present in amazon appLication and print it on the console
package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo39 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus");
     Thread.sleep(5000);
     List<WebElement> allsugg=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
     int count=allsugg.size();
     System.out.println(count);
     Thread.sleep(5000);
     for (int i = 0; i < count; i++) {
	 String	sugg=allsugg.get(i).getText();
	 System.out.println(sugg);
	}
     Thread.sleep(5000);
     driver.close();
	}

}
