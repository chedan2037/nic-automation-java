package base;

import common.Actions;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.nic.Events;
import pages.nic.HomePage;

public class BaseTest {
    protected WebDriver driver = Actions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);

    protected Events events = new Events(driver);

}
