package pages.nic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

import static pages.Locators.HomePageLocators.toLoginForm;


public class Events extends BasePage {
    public Events(WebDriver driver) {
        super(driver);
    }

    public Events eventBooking() {

//        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//        driver.switchTo().frame(driver.findElement(By.id("frm1")));
//        Select s = new Select(driver.findElement(By.cssSelector("#selectnav1")));
//        s.selectByVisibleText("-- Link1");
//        driver.switchTo().defaultContent();
//        driver.findElement(By.cssSelector("div div div div div div div div div article input")).sendKeys("abcde");

        return this;
    }
}
