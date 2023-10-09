package pages.nic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


import java.time.Duration;

import static pages.Locators.HomePageLocators.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public HomePage login() {
        driver.findElement(toLoginForm).click();
        driver.findElement(inputLogin).sendKeys("dchernomorets");
        driver.findElement(inputPassword).sendKeys("ma31da01SOPOPO(%");
        driver.findElement(loginBtn).click();
        waitElementIsVisible(driver.findElement(userAvatar));
        return this;

    }

}


