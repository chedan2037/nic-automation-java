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
        act.moveToElement(driver.findElement(By.cssSelector("div#main_navbar ul li[class='nav-item mr-4 mb-2 mb-lg-0']:nth-child(3)"))).click().perform();

        return this;
    }
}
