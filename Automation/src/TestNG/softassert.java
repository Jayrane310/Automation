//write a script to compare expected and actual data by using soft Assert
package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	  static {
	    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	    }
	    @Test
		public void verify() {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     String expected="actiTIME - Login";
	     String actual=driver.getTitle();
	     SoftAssert s=new SoftAssert();
	     
	     s.assertEquals(expected, actual);
	     driver.close();
	     s.assertAll();
   }
}