package qsp;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo83 {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {  

          

        WebDriver driver= new ChromeDriver();   

        //Creating the JavascriptExecutor interface object by Type casting  

        JavascriptExecutor js = (JavascriptExecutor)driver;  

          

        //Launching the Site.  

        driver.get("https://facebook.com/");   

     

          //Maximize window  

          driver.manage().window().maximize();  

          

          //Set the Script Timeout to 20 seconds  

          driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);   

             

          //Declare and set the start time  

          long start_time = System.currentTimeMillis();   

                   

          //Call executeAsyncScript() method to wait for 5 seconds  

          js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");   

            

         //Get the difference (currentTime - startTime)  of times.  

         System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));     
          
         Thread.sleep(3000);
         
         driver.close();
                      

    }  


}
