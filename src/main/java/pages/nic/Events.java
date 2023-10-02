package pages.nic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import static pages.Locator.currentDate;
import static pages.Locator.dayTab;

public class Events extends BasePage {
    public Events(WebDriver driver) {
        super(driver);
    }

   public Events eventBooking(){
        driver.findElement(dayTab).click();
        String abc = driver.findElement(currentDate).getText();
        System.out.println(abc);
        return this;
    }
}
