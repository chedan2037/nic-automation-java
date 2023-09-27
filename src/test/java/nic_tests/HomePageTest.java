package nic_tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void Exmp() {
        basePage.open("https://www.selenium.dev/");
        homePage.exmp();
    }
}
