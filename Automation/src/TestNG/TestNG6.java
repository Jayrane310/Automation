package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG6 {
	@Test
    public void createFile() {
    Reporter.log("File created",true);
}
	@Test
    public void modifyFile() {
    Reporter.log("File modified",true);
}
	@Test
    public void deleteFile() {
    Reporter.log("File deleted",true);
}
}
