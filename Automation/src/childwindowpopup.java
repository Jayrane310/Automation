import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowpopup {

	    static {
	    	System.setProperty("WebDriver.Chrome.driver","./Driver/ChromeDriver.exe");
	    }
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoqa.com/browser-windows");
	     driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	     Thread.sleep(3000);
	     Set<String> ALLwin = driver.getWindowHandles();
	     //System.out.println(ALLwin);
	     //driver.close();
	     for (String id : ALLwin) {
	    	 System.out.println(id);
			
		}
	     driver.close();
    }
}
