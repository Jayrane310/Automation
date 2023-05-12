//write a script to get the title of shaadi.com application and print it on console
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.shaadi.com/");
      String sheela=driver.getTitle();
      System.out.println(sheela);
      Thread.sleep(5000);
      driver.close();
	}

}
