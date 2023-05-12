//write a script to get the current URL of shaadi.com application and print it on the console
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.get("http://www.shaadi.com/");
       String sheela=driver.getCurrentUrl();
       System.out.println(sheela);
       Thread.sleep(2000);
       driver.close();
	}

}
