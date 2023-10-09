package nic_tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static common.Constants.Urls.*;

public class HomePageTest extends BaseTest {

    @Test
    public void abc() {
        basePage.open(NIC_URL);
//        homePage.login();
        events.eventBooking();
    }
}

