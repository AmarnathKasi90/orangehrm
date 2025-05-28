package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.logging.log4j.Logger;
import utils.Log;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    private WebElement usernameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy(css = ".oxd-alert-content-text")
    private WebElement errorMessage;

    @FindBy(css = "header .oxd-topbar-header-breadcrumb")
    private WebElement dashboardHeader;

    private static final Logger logger = Log.getLogger(LoginPage.class);



    public void open() {
        logger.info("Opening login page");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void enterUsername(String username) {
        logger.info("Entering username: {}", username);
        sendKeys(usernameInput, username);
    }

    public void enterPassword(String password) {
        logger.info("Entering password");
        sendKeys(passwordInput, password);
    }

    public void clickLoginButton() {
        logger.info("Clicking login button");
        click(loginButton);
    }

    public String getErrorMessage() {
        waitForElementToBeVisible(errorMessage);
        return errorMessage.getText();
    }

    public void login(String username, String password) {
        logger.info("Attempting login with username: {}", username);
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    public boolean isLoginSuccessful() {
        try {
            waitForElementToBeVisible(dashboardHeader);
            logger.info("Login successful");
            return dashboardHeader.isDisplayed();
        } catch (Exception e) {
            logger.warn("Login not successful");
            return false;
        }
    }

    public boolean isLoginErrorDisplayed() {
        try {
            waitForElementToBeVisible(errorMessage);
            logger.info("Login error displayed");
            return errorMessage.isDisplayed();
        } catch (Exception e) {
            logger.warn("Login error not displayed");
            return false;
        }
    }
} 