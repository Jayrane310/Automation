package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {
	   @Test
	   (invocationCount = 5)
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
