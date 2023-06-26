package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
    HomePage homePage;

    @Given("admin on login page")
    public void adminOnLoginPage() {
        loginPage.open();
        loginPage.onLoginPage();
    }

    @When("admin input valid email")
    public void adminInputValidEmail() {
        loginPage.inputValidEmail("developer@dev.com");
    }

    @And("admin input valid password")
    public void adminInputValidPassword() {
        loginPage.inputValidPassword("dev12345");
    }

    @And("admin click login button")
    public void adminClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("admin on home page successfully")
    public void adminOnHomePageSuccessfully() {
        homePage.onHomePage();
    }

    @When("admin input empty email")
    public void adminInputEmptyEmail() {
        loginPage.inputEmptyEmail("");
    }

    @Then("admin see alert error message")
    public void adminSeeAlertErrorMessage() {
        loginPage.seeAlertErrorMessage();
    }

    @When("admin input invalid email")
    public void adminInputInvalidEmail() {
        loginPage.inputInvalidEmail("developer#dev.com");
    }

    @And("admin input empty password")
    public void adminInputEmptyPassword() {
        loginPage.inputEmptyPassword("");
    }

    @And("admin input invalid password")
    public void adminInputInvalidPassword() {
        loginPage.inputInvalidPassword("developer12345");
    }
}