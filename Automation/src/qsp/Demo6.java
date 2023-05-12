//write a script to get PageSource of the shaadi.com application and print it on the console
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
     static {
    	 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
     }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeDriver driver=new ChromeDriver();
     driver.get("http://www.shaadi.com/");
     String sheela=driver.getPageSource();
     Thread.sleep(2000);
     System.out.println(sheela);
     driver.close();
	}

}
