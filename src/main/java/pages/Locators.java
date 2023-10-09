package pages;

import org.openqa.selenium.By;

public class Locators {

    public class EventLocators {

        public static final By dayBtn = By.cssSelector("div[name=day_tab]");

        public static final By weekBtn = By.cssSelector("div[name=week_tab]");

        public static final By monthBtn = By.cssSelector("div[name=month_tab]");

        public static final By yearBtn = By.cssSelector("div[name=year_tab]");
        public static final By roomsBtn = By.cssSelector("div[name=unit_tab]");
        public static final By todayBtn = By.cssSelector("div.dhx_cal_today_button");
        public static final By dayTab = By.cssSelector("div[name = 'day_tab']");
        public static final By currentDate = By.cssSelector("#dhx_cal_date");

        public static final By bookedTime = By.cssSelector("div[class='dhx_event_move dhx_title']");
        public static final By allTime = By.cssSelector("div[class='dhx_scale_hour dhx_scale_hour_border']");

    }

    public class HomePageLocators {
        public static final By eventPanel = By.cssSelector("div.dhx_scale_holder:nth-child(1)");
        public static final By toLoginForm = By.cssSelector("a[id=sign-in]");

        public static final By inputLogin = By.cssSelector("input[id=_58_login]");

        public static final By inputPassword = By.cssSelector("input[id=_58_password]");

        public static final By loginBtn = By.cssSelector("input[class='aui-button-input aui-button-input-submit']");

        public static final By userAvatar = By.cssSelector("li[id=_145_userAvatar]");


    }
}
