package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
	@Test
    public void createCustomer() {
	Assert.fail();
    Reporter.log("customer created",true);
}
	@Test
    public void modifyCustomer() {
	Assert.fail();
    Reporter.log("customer modified",true);
}
	@Test
    public void deleteCustomer() {
	Assert.fail();
    Reporter.log("customer deleted",true);
}
}

