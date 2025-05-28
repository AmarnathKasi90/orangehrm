import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;


public class SimpleTest {
    @Test
    @Description("Simple passing test")
    public void testPass() {
        Assert.assertTrue(true);
    }
}
