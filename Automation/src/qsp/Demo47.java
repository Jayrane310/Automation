//write a script to get all the options present in HotelTaj Menu by using getOptions method and print it on the console
package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo47 {
	static {
		System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("file:///C:/Users/JAYESH/Desktop/TajMenu.html");
     WebElement taj=driver.findElement(By.id("taj menu"));
     Select s=new Select(taj);
     List<WebElement> alloptions=s.getOptions();
     int count=alloptions.size();
     for (int i = 0; i < count; i++) {
    	 String text=alloptions.get(i).getText();
    	 System.out.println(text);
		
	}
     driver.close();
	}

}
