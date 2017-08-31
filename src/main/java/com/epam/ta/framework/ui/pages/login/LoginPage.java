package com.epam.ta.framework.ui.pages.login;

import com.epam.ta.framework.ui.driver.Driver;
import com.epam.ta.framework.ui.pages.dashboard.DashBoardPage;
import com.epam.ta.framework.ui.pages.AbstractPage;
import com.epam.ta.framework.utils.Service;
import com.epam.ta.framework.utils.Waiters;
import org.openqa.selenium.By;

public class LoginPage extends AbstractPage {

    private final By USER_NAME_INPUT_LOCATOR = By.xpath("//input[@name='username']");
    private final By PASSWORD_INPUT_LOCATOR = By.xpath("//input[@name='password']");
    private final By LOGIN_BUTTON_LOCATOR = By.xpath("//input[@name='Login']");
    private final By LOGIN_PAGE_TEXT_LOCATOR = By.xpath("//td[@class='header1']/h1");

    public DashBoardPage login(String userName, String pwdName){
        Driver.getDriverInstance().findElement(USER_NAME_INPUT_LOCATOR).sendKeys(userName);
        Driver.getDriverInstance().findElement(PASSWORD_INPUT_LOCATOR).sendKeys(pwdName);
        Service.decorate(Driver.getDriverInstance().findElement(LOGIN_BUTTON_LOCATOR)).click();
        return new DashBoardPage();
    }

    public String readIntroductionText(){
        Waiters.waitForElementVisible(LOGIN_PAGE_TEXT_LOCATOR);
        return Driver.getDriverInstance().findElement(LOGIN_PAGE_TEXT_LOCATOR).getText();
    }

}
