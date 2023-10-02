package nic_tests;

import base.BaseTest;
import org.testng.annotations.Test;
import static common.Constants.Urls.*;

public class HomePageTest extends BaseTest {

    @Test
    public void abc(){
        basePage.open(NIC_URL);
        events.eventBooking();
    }
}
