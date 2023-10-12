package base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.nic.Events;
import pages.nic.HomePage;
import static common.Config.*;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected Events events = new Events(driver);

    @AfterSuite(alwaysRun = true)
    public void close1() {
        if (CLOSE_BROWSER_AFTER_SUITE) {
            driver.quit();
        }


    }
}
