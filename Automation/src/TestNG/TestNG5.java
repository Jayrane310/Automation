package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG5 {
	@Test
    public void createProject() {
    Reporter.log("project created",true);
}
	@Test
    public void modifyProject() {
    Reporter.log("project modified",true);
}
	@Test
    public void deleteProject() {
    Reporter.log("project deleted",true);
}
}
