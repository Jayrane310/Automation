//write a script to verify the title of actiTime application
package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7575 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.actitime.com/login.do");
     String expected="actiTime";
     String actual=driver.getTitle();
   //if (expected==actual) 
     if (expected.equals(actual)) {
		System.out.println("Title is matching");
	} else {
        System.out.println("Title is not matching");
	}
     
     driver.close();
  }

}
