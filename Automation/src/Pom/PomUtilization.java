package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomUtilization {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver");
    }
    @Test
    public void login() throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://demo.actitime.com/login.do");
    	LoginPage lp=new LoginPage(driver);
    	lp.loginToActitime("admin","manager");
    	Thread.sleep(10000);
    	driver.close();
    }
}
