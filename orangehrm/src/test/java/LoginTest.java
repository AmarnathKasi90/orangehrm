import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;

@Listeners({AllureTestNg.class})
public class LoginTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {"Admin", "wrongpass", false}, // invalid
                {"WrongUser", "admin123", false},// invalid
                {"Admin", "admin123", true}   // valid

        };
    }
    @Epic("Login Feature")
    @Feature("Login Scenarios")
    @Story("Valid and Invalid Login")
    @Severity(SeverityLevel.CRITICAL)
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