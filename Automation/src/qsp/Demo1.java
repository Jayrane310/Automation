//write a script to open empty FireFox browser
package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1 {
	static{
		System.setProperty("WebDriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FirefoxDriver driver=new FirefoxDriver();
     
	}
}
