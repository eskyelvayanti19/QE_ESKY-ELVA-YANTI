package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Manage_Offline_Classes_Booking;
import starter.pages.HomePage;

public class Manage_Offline_Classes_BookingSteps {
    @Steps
    HomePage homePage;
    Manage_Offline_Classes_Booking manageOfflineClassesBooking;

    @And("admin click menu class")
    public void adminClickMenuClass() {
        homePage.clickMaxMenu();
        homePage.clickClassMenu();
    }

    @And("admin click manage booking menu")
    public void adminClickManageBookingMenu() {
        homePage.clickManageBookingMenu();
    }

    @And("admin on manage booking page")
    public void adminOnManageBookingPage() {
        manageOfflineClassesBooking.onManageClassBookingPage();
    }

    @When("admin click offline menu")
    public void adminClickOfflineMenu() {
        manageOfflineClassesBooking.ClickOfflineMenu();
    }

    @Then("admin can see all offline classes booking")
    public void adminCanSeeAllOfflineClassesBooking() {
        manageOfflineClassesBooking.canSeeAllOfflineClassesBooking();
    }

    @And("admin click point three")
    public void adminClickPointThree() {
        manageOfflineClassesBooking.clickPointThree();
    }

    @And("admin click view detail button")
    public void adminClickViewDetailButton() {
        manageOfflineClassesBooking.clickViewDetailButton();
    }

    @Then("admin can see detail offline classes booking")
    public void adminCanSeeDetailOfflineClassesBooking() {
        manageOfflineClassesBooking.canSeeDetailOfflineClassesBooking();
    }
}