package nic_tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static common.Constants.Urls.NIC_URL;

public class LoginTest extends BaseTest {

    @Test
    void login() {
        homePage.open(NIC_URL);
        homePage.login();


    }

}
