//write a script to get all the option present in hotelTaj menu By using getWrappedElement method and print it on the console
package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo50 {
	 static {
		 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	 }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("file:///C:/Users/JAYESH/Desktop/TajMenu.html");
	     WebElement taj=driver.findElement(By.id("taj menu"));
	     Select s=new Select(taj);
	     Thread.sleep(3000);
	     
	     WebElement alloptions=s.getWrappedElement();
	     System.out.println(alloptions.getText());
	     
	    //String alloptionString=s.getWrappedElement().getText();
	    //System.out.println(alloptionString);
	      
	     Thread.sleep(3000);
	     driver.close();
	     
	     
	}

}
