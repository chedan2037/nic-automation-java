package nic_tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class EventBookingTest extends BaseTest {

    @Test
    public void eventBooking() {
//        basePage.open(NIC_URL);
//        homePage.login();

//        basePage.open(NIC_135);
        events.eventBooking();
    }
}

