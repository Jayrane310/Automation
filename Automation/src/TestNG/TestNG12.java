package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listernerimplementation)
public class TestNG12 extends baseClass {
 
	@Test
	public void CreateCustomer() {
		Assert.fail();
		Reporter.log("customer created succsessfully", true);
	}
}
