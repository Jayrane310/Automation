//write a script to use manage() and perform minimize and maximize in the same script
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
    static {
    System.setProperty("WebDriver.Chrome.Driver","./ChromeDriver.exe");	
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeDriver driver=new ChromeDriver();
     Thread.sleep(3000);
     
     driver.manage().window().maximize();
     driver.get("http://www.fifa.com");
     Thread.sleep(3000);
     
     driver.manage().window().minimize();
     Thread.sleep(3000);
     
     driver.manage().window().maximize();
     Thread.sleep(3000);
     
     driver.close();
     
     
	}

}
