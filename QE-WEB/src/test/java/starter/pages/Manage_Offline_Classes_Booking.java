package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Manage_Offline_Classes_Booking extends PageObject {
    private By manageClassBookingTitle(){
        return By.xpath("//p[text()='Booking Class']");
    }

    private By offlineMenu(){
        return By.xpath("//button[text()='Offline']");
    }

    private By pointThree(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/table/tbody/tr[1]/td[4]");
    }

    private By viewDetailButton(){
        return By.xpath("(//button[text()='View Detail'])[1]");
    }

    private By detailBookingTitle(){
        return By.xpath("//li[text()='Detail Customer']");
    }

    @Step
    public void onManageClassBookingPage(){
        $(manageClassBookingTitle()).isDisplayed();
    }

    @Step
    public void clickOfflineMenu(){
        $(offlineMenu()).click();
    }

    @Step
    public void canSeeAllOfflineClassesBooking(){
        $(Manage_Offline_Classes_Booking()).isDisplayed();
    }

    @Step
    public void clickPointThree(){
        $(pointThree()).click();
    }

    @Step
    public void clickViewDetailButton(){
        $(viewDetailButton()).click();
    }

    @Step
    public void canSeeDetailOfflineClassesBooking(){
        $(detailBookingTitle()).isDisplayed();
    }

    public void ClickOfflineMenu() {
    }
}