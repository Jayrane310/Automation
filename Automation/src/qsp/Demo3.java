//write a script to open FiFa world cup home page
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
    static {
    	System.setProperty("webDriver.Chrome.Driver","./Driver/ChromeDriver.exe");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022");
	 driver.navigate();
	 
	 driver.close();
	}

}
