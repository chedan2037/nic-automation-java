package nic_tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static common.Constants.Urls.NIC_URL;

public class HomePageTest extends BaseTest {

    @Test (groups = {"allT"})
    void previousDate() {
        homePage.open(NIC_URL);
        homePage.previousDate();
    }

}
