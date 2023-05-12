//write a script to go to actiTime application then go to task then click on add new then create new customer using Data Driven Testing
package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo91 {
    static {
    	System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
    Properties p=new Properties();
    p.load(fis);
    String url=p.getProperty("url");
    String un =p.getProperty("username");
    String pw =p.getProperty("password");
    
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.get(url);
    driver.findElement(By.id("username")).sendKeys(un);
    driver.findElement(By.name("pwd")).sendKeys(pw);
    driver.findElement(By.xpath("//div[.='Login ']")).click();
    driver.findElement(By.xpath("//div[.='Tasks']")).click();
    driver.findElement(By.xpath("//div[.='Add New']")).click();
    driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
    
    FileInputStream fis1=new FileInputStream("./Testdata/TENNIS.xlsx");
    Workbook Tennis =WorkbookFactory.create(fis1);
    String TP =Tennis.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
    driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(TP);
     
    driver.findElement(By.xpath("//div[.='Create Customer']")).click();
    Thread.sleep(3000);
    driver.close();
	}

}
