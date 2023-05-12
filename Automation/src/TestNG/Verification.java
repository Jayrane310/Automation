////write a script to verify the title of actiTime application
package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
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
     System.out.println(actual);
   
     if (expected.equals(actual)) {
		Reporter.log("Title is matching", true);
	} else {
        Reporter.log("Title is not matching", true);
	}
     
     driver.close();
  }
}
