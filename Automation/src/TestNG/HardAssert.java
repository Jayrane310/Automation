//write a script to compare expected and actual data by using Assertion or Hard Assertion
package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	  static {
	    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	    }
	    @Test
		public void verify() {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     String expected="actiTime";
	     String actual=driver.getTitle();
	     Assert.assertEquals(expected, actual);
	     driver.close();
 }
}
