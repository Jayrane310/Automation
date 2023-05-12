//write a script to get the screenshot of faceBook application
package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Demo7474 {
    static {
    System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
     }
    public static void main(String[]args) throws IOException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    TakesScreenshot t=(TakesScreenshot) driver;
    File src=t.getScreenshotAs(OutputType.FILE);
    File dest =new File("./ScreenShot/ss.png");
    Files.copy(src, dest);
    driver.close();
 }
}