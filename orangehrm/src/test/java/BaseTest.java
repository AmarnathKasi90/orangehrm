import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverManager;

public class BaseTest {
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        // WebDriver is initialized lazily in DriverManager
        DriverManager.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverManager.quitDriver();
    }
} 