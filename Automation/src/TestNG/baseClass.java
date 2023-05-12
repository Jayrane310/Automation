//write a script to design base class
package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseClass {
	static {
		System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
	}
	public static WebDriver driver;
	@BeforeSuite
    public void databaseconnection() {
   	Reporter.log("database connected", true);
   }
   @AfterSuite
   public void databasedisconnection() {
   	Reporter.log("database disconnected", true);
   }
   @BeforeTest
   public void launchbrowser() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
   	Reporter.log("browser launched", true);
   }
   @AfterTest
   public void closebrowser() throws InterruptedException {
	   Thread.sleep(3000);
	   driver.close();
       Reporter.log("browser closed", true);
       }
   @BeforeMethod
   public void loginToActitime() throws InterruptedException {
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
   	Reporter.log("login succesfully", true);
   }
   @AfterMethod
   public void logoutToActitime() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
   	Reporter.log("logout succesfully", true);
   }
   /*@Test
   public void createCustomer() {
   Reporter.log("customer created", true);
   }*/

}
