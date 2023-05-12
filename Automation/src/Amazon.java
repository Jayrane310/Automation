import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
     static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     }
     public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> product = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	    List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	    int count=product.size();
	    System.out.println(count);
	    for (int i = 0; i < count; i++) {
			String a=product.get(i).getText();
			String b=price.get(i).getText();
			System.out.println(a+"=======>>"+b);
		}
	    Thread.sleep(3000);
	    driver.close();
     }
 
}
