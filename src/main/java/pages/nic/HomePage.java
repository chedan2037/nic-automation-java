package pages.nic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage exmp() {
        driver.findElement(By.cssSelector("a.nav-link[href='/downloads']")).click();
        return this;
    }
}
