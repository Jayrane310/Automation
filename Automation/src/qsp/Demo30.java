//write a script to verify that actiTime checkBox is selected or not in actiTime application
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo30 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.actitime.com/login.do");
      boolean checkbox=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
      if (checkbox==true) {
		System.out.println("checkbox is selected");
	} else {
		System.out.println("checkbox is not selected");
	}
      Thread.sleep(5000);
      driver.close();
	}

}
