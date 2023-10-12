package nic_tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static common.Constants.Urls.NIC_135_URL;
import static common.Constants.Urls.NIC_URL;

public class EventsTest extends BaseTest {

    @Test(groups = {"allT"})
    void login() {
        homePage.open(NIC_URL);
        homePage.login();
    }

    @Test(dependsOnMethods = "login", groups = {"allT"})
    void eventBooking() {
        homePage.open(NIC_135_URL);
        events.eventBooking();
    }

    @Test(dependsOnMethods = "login", groups = {"allT"})
    void eventDelete() {
        homePage.open(NIC_135_URL);
        events.eventDelete();
    }

    @Test(dependsOnMethods = "login", groups = {"allT"})
    void eventEdit() {
        homePage.open(NIC_135_URL);
        events.editEvent();
    }

    @Test(groups = {"allT"})
    void nextDate() {
        homePage.open(NIC_135_URL);
        events.nextDate();
    }

}
