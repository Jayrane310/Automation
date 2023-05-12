//write a script to get the title of google and print it on the console
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
     static {
     System.setProperty("WebDriver.Chrome.Driver","./Driver/ChromeDriver.exe");	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver driver=new ChromeDriver();
     driver.get("http://www.google.com");
     String sheela=driver.getTitle();
     System.out.println(sheela);
     driver.close();
	}

}
