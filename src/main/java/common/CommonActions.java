package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER;
import static common.Constants.TimeoutVariables.IMPLICIT_WAIT;


public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (BROWSER) {

            case "chrome":


                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");

                driver = new ChromeDriver(options);
                break;

            case "gecko":
                driver = new FirefoxDriver();
                break;

            default:

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
