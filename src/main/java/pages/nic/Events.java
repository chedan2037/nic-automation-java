package pages.nic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.base.BasePage;

import static pages.Locators.EventLocators.*;


public class Events extends BasePage {
    public Events(WebDriver driver) {
        super(driver);
    }

    public Events eventBooking() {

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe")));
        driver.findElement(dayTab).click();

        while (!driver.findElement(currentDate).getText().contains("Суббота")) {
            driver.findElement(nextDate).click();
        }

        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(time18_30)).perform();
        driver.findElement(save).click();

        driver.findElements(time18_30_day_created);

        return this;
    }

    public Events eventDelete() {

        driver.switchTo().frame(driver.findElement(iframe));
        driver.findElement(weekBtn).click();

        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(time18_30_week_created)).perform();
        driver.findElement(delete).click();
        driver.findElement(deleteConfirm).click();


        return this;
    }


    public Events editEvent() {


        driver.switchTo().frame(driver.findElement(iframe));
        driver.findElement(monthBtn).click();
        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(timeMonth)).perform();
        driver.findElement(description).sendKeys("qй1 # ");
        driver.findElement(save).click();

        driver.navigate().refresh();
        driver.switchTo().frame(driver.findElement(iframe));
        driver.findElement(monthBtn).click();

        Assert.assertEquals(driver.findElements(By.linkText("qй1 #")).size(), 0);

        return this;
    }

    public Events nextDate() {
        driver.switchTo().frame(driver.findElement(iframe));
        driver.findElement(yearBtn).click();

        StringBuilder sb = new StringBuilder();
        sb.append(driver.findElement(currentDate).getText());
        sb.delete(0, 4);
        String temp = sb.toString();
        int newDate = Integer.parseInt(temp) + 1;
        int nowDate = Integer.parseInt(temp);
        driver.findElement(nextDate).click();

        Assert.assertEquals(newDate, nowDate + 1);

        return this;
    }

}
