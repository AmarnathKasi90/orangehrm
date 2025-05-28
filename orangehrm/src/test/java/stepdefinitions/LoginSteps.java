package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.LoginPage;
import utils.DriverManager;

public class LoginSteps {
    private LoginPage loginPage;

    @Given("I am on the OrangeHRM login page")
    public void iAmOnTheOrangeHRMLoginPage() {
        loginPage = new LoginPage();
        loginPage.open();
    }

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        loginPage.login("Admin", "admin123");
    }

    @When("I enter invalid username and password")
    public void iEnterInvalidUsernameAndPassword() {
        loginPage.login("invalid", "invalid");
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        // Login button click is handled in the login() method
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }

    @And("I should see the dashboard page")
    public void iShouldSeeTheDashboardPage() {
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Invalid credentials"));
    }
}