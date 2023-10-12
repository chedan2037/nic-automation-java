package pages.nic;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import static pages.Locators.EventLocators.*;
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

    public HomePage previousDate() {

        driver.switchTo().frame(driver.findElement(iframe));

        StringBuilder sb = new StringBuilder(driver.findElement(currentDate).getText());
        String temp = sb.delete(2, sb.length()).toString().trim();
        int temp2 = Integer.parseInt(temp) - 1;
        String prevDay = Integer.toString(temp2);
        driver.findElement(prevDate).click();

        Assert.assertTrue(driver.findElement(currentDate).getText().contains(prevDay));

        return this;
    }


}


