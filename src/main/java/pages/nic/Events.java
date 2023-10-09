package pages.nic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;


import static pages.Locators.EventLocators.*;
import static pages.Locators.HomePageLocators.*;


public class Events extends BasePage {
    public Events(WebDriver driver) {
        super(driver);
    }

    public Events eventBooking() {
        driver.findElement(eventPanel).click();
        driver.findElement(dayBtn).click();
        WebElement time = driver.findElement(By.cssSelector("div[class='dhx_scale_hour dhx_scale_hour_border']" + ":nth-child(1)"));
        time.click();
        time.click();

        return this;
    }
}
