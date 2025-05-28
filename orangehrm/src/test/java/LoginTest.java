import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {"Admin", "wrongpass", false}, // invalid
                {"WrongUser", "admin123", false},// invalid
                {"Admin", "admin123", true}   // valid

        };
    }

    @Test(dataProvider = "loginData", priority = 1, groups = {"login", "smoke"})
    public void testLogin(String username, String password, boolean isValid) {
        LoginPage loginPage = new LoginPage();
        loginPage.open();

        loginPage.login(username, password);

        if (isValid) {
            Assert.assertTrue(loginPage.isLoginSuccessful(), "Login should succeed for valid credentials");
        } else {
            Assert.assertTrue(loginPage.isLoginErrorDisplayed(), "Login error should be displayed for invalid credentials");
        }
    }
}