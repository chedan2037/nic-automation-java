package nic_tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.base.BasePage;

import static common.Constants.Urls.NIC_URL;
import static pages.Locators.HomePageLocators.*;

public class LoginTest extends BaseTest {

    @Test
    void loginTest() {
        homePage.open(NIC_URL);
        homePage.login();


    }

}
