//write a script to demonstrate annotations
package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
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
    	Reporter.log("browser launched", true);
    }
    @AfterTest
    public void closebrowser() {
        Reporter.log("browser closed", true);
        }
    @BeforeMethod
    public void loginToActitime() {
    	Reporter.log("login succesfully", true);
    }
    @AfterMethod
    public void logoutToActitime() {
    	Reporter.log("logout succesfully", true);
    }
     @Test
     public void createCustomer() {
    	Reporter.log("Customer created",true); 
     }
     
    }
    

