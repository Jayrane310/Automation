//write a script to verify that FaceBook LoGo is displayed or not in FaceBook application
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo27 {
     static {
    	 System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
     }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      boolean Logo=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
      if (Logo==true) {
		System.out.println("logo is displayed");
	} else {
       System.out.println("logo is not displayed");
	}
      Thread.sleep(5000);
      driver.close();
	}

}
