//write a script to navigate to FlipKart application and enter shoes in the search text box and click on search button using cssSelector
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 {
	static{
		System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
     Thread.sleep(3000);
     driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("shoes");
     Thread.sleep(3000);
     driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
     Thread.sleep(3000);
     driver.quit();
	}

}
