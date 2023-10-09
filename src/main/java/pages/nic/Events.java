package pages.nic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

import static pages.Locators.HomePageLocators.toLoginForm;


public class Events extends BasePage {
    public Events(WebDriver driver) {
        super(driver);
    }

    public Events eventBooking() {
//        driver.findElement(By.cssSelector("[name=day_tab]"));

//        driver.findElement(By.xpath("//div[text()='День']")).click();
        //X is 72 and Y is 36

//        Actions act = new Actions(driver);
//
//        act.moveByOffset(72, 36).click().build().perform();


        driver.get("https://www.selenium.dev/");

        Actions act = new Actions(driver);
        WebElement el = driver.findElement(By.cssSelector("body[class=td-home]"));

        act.moveToElement(el,0,0).perform();
        act.moveByOffset(667, 875).click().build().perform();

        return this;
    }
}
