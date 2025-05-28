import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class YourTestClass {

    @BeforeSuite
    public void setup() {
        System.setProperty("allure.results.directory", "target/allure-results");
    }

    @Test
    public void yourTest() {
        // Your test code here
    }
}