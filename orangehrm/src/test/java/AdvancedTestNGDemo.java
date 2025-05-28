//import org.testng.Assert;
//import org.testng.SkipException;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
public class AdvancedTestNGDemo extends BaseTest {
//
//    @Test(priority = 1, groups = {"smoke"})
//    public void testPriorityAndGroup() {
//        Assert.assertTrue(true, "Priority and group demo");
//    }
//
//    @Test(priority = 2, dependsOnMethods = {"testPriorityAndGroup"}, groups = {"regression"})
//    public void testDependency() {
//        Assert.assertTrue(true, "Dependency demo");
//    }
//
//    @Test(priority = 3, timeOut = 2000, groups = {"timeout"})
//    public void testTimeout() throws InterruptedException {
//        Thread.sleep(1000); // Should pass
//    }
//
//    @Test(priority = 4, invocationCount = 3, groups = {"invocation"})
//    public void testInvocationCount() {
//        Assert.assertTrue(true, "Invocation count demo");
//    }
//
//    @Test(priority = 5, enabled = false, groups = {"excluded"})
//    public void testDisabled() {
//        Assert.fail("This test should be excluded");
//    }
//
//    @Test(priority = 6, dataProvider = "sampleData", groups = {"data-driven"})
//    public void testDataDriven(String input, int expectedLength) {
//        Assert.assertEquals(input.length(), expectedLength, "Data-driven test");
//    }
//
//    @DataProvider(name = "sampleData")
//    public Object[][] sampleData() {
//        return new Object[][] {
//            {"test", 4},
//            {"selenium", 8},
//            {"java", 4}
//        };
//    }
//
//    @Test(priority = 7, groups = {"skip"})
//    public void testSkip() {
//        throw new SkipException("Skipping this test as a demo");
//    }
}