package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailField(){
        return By.id("email");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");
    }

    @Step
    public void onLoginPage(){
        open();
        $(loginButton()).isDisplayed();
    }

    @Step
    public void inputValidEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputValidPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public void inputEmptyEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void seeAlertErrorMessage(){
        Switch.toAlert().getText();
    }

    @Step
    public void inputInvalidEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputEmptyPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void inputInvalidPassword(String password){
        $(passwordField()).type(password);
    }
}