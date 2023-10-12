package pages;

import org.openqa.selenium.By;

public class Locators {

    public class EventLocators {

        public static final By iframe = By.cssSelector("iframe");

        public static final By weekBtn = By.cssSelector("div[name=week_tab]");

        public static final By monthBtn = By.cssSelector("div[name=month_tab]");

        public static final By yearBtn = By.cssSelector("div[name=year_tab]");

        public static final By dayTab = By.cssSelector("div[name = 'day_tab']");
        public static final By currentDate = By.cssSelector("#dhx_cal_date");


        public static final By time18_30 = By.cssSelector("div[class='dhx_scale_hour dhx_scale_hour_border']:nth-child(10)");
        public static final By time18_30_day_created = By.cssSelector("[class='dhx_event_move dhx_title']");
        public static final By time18_30_week_created = By.cssSelector(".dhx_scale_holder:nth-child(6) [class='dhx_event_move dhx_title']");

        public static final By timeMonth = By.cssSelector("tr [class='dhx_before ']:nth-child(6) > div + div");

        public static final By description = By.cssSelector("textarea");


        public static final By nextDate = By.cssSelector("div[class='dhx_cal_next_button']");
        public static final By prevDate = By.cssSelector("div[class='dhx_cal_prev_button']");

        public static final By save = By.cssSelector(".dhx_save_btn + div");
        public static final By delete = By.cssSelector(".dhx_delete_btn + div");
        public static final By deleteConfirm = By.cssSelector("[class='dhtmlx_popup_button dhtmlx_ok_button'] > div");


    }

    public class HomePageLocators {

        public static final By toLoginForm = By.cssSelector("a[id=sign-in]");

        public static final By inputLogin = By.cssSelector("input[id=_58_login]");

        public static final By inputPassword = By.cssSelector("input[id=_58_password]");

        public static final By loginBtn = By.cssSelector("input[class='aui-button-input aui-button-input-submit']");

        public static final By userAvatar = By.cssSelector("li[id=_145_userAvatar]");


    }
}
