import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup {
    static {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/JAYESH/Desktop/Automation/fileupload.html");
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\JAYESH\\eclipse-workspace\\Automation\\Testdata\\CV.pdf");
		Thread.sleep(5000);
		driver.close();
	}
}
