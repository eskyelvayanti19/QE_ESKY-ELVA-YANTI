package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By titleHomePage(){
        return By.xpath("//h1[text()='HOME']");
    }

    @Step
    public void onHomePage(){
        $(titleHomePage()).isDisplayed();
    }

    private By maxMenu(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/button");
    }

    private By classMenu(){
        return By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div[1]/div[1]/button");
    }

    private By manageClassMenu(){
        return By.xpath("//button[text()='Manage Class']");
    }

    @Step
    public void clickMaxMenu(){
        $(maxMenu()).click();
    }

    @Step
    public void clickClassMenu(){
        $(classMenu()).click();
    }

    @Step
    public void clickManageClassMenu(){
        $(manageClassMenu()).click();
    }

    private By manageBookingMenu(){
        return By.xpath("//button[text()='Manage Booking']");
    }

    @Step
    public void clickManageBookingMenu(){
        $(manageBookingMenu()).click();
    }
}