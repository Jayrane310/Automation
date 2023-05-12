package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {
    @Test
	public void createcustomer() {
	   Reporter.log("customer created", true);
   }
    @Test
   	public void editcustomer() {
   	   Reporter.log("customer edited", true);
      }
    @Test
   	public void deletecustomer() {
   	   Reporter.log("customer deleted", true);
      }
}
