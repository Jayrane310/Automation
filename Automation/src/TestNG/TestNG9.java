package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG9 extends baseClass {
   @Test
   public void createCustomer() {
   
   Reporter.log("Customer Created successfully", true);
   }
   @Test
   public void modifyCustomer() throws InterruptedException {
   Thread.sleep(3000);
   Reporter.log("Customer Modified successfully", true);
   }
   
}
