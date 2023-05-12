//write a script to handle tooltip using the "title" attribute
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo78 {
     static {
    	 System.setProperty("WebDriver.Chrome.Driver","./driver/chromedriver.exe");
     }
     public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		String expectedToolTip="Github";
		WebElement tooltip=driver.findElement(By.xpath("(//span[.='Github'])[2]/.."));
		String actualToolTip=tooltip.getText();
		System.out.println(actualToolTip);
		if (expectedToolTip.equalsIgnoreCase(actualToolTip)) {
			System.out.println("tooltip is matching");
			
		} else {
            System.out.println("tooltip is not matching");
		}
	   Thread.sleep(3000);
	   driver.close();
	 
	}
}
