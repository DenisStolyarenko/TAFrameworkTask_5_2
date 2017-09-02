package com.epam.ta.framework.ui.application.pages.login;

import com.epam.ta.framework.ui.application.pages.AbstractPage;
import com.epam.ta.framework.ui.core.driver.Driver;
import com.epam.ta.framework.ui.core.utils.Waiters;
import org.openqa.selenium.By;

public class LoginPage extends AbstractPage {

    private final By USER_NAME_INPUT_LOCATOR = By.xpath("//input[@name='username']");
    private final By PASSWORD_INPUT_LOCATOR = By.xpath("//input[@name='password']");
    private final By LOGIN_BUTTON_LOCATOR = By.xpath("//input[@name='Login']");
    private final By LOGIN_PAGE_TEXT_LOCATOR = By.xpath("//td[@class='header1']/h1");

    public void login(String userName, String pwdName){
        Driver.getDriverInstance().findElement(USER_NAME_INPUT_LOCATOR).sendKeys(userName);
        Driver.getDriverInstance().findElement(PASSWORD_INPUT_LOCATOR).sendKeys(pwdName);
        Driver.getDriverInstance().findElement(LOGIN_BUTTON_LOCATOR).click();
    }

    public String readIntroductionText(){
        Waiters.waitForElementVisible(LOGIN_PAGE_TEXT_LOCATOR);
        return Driver.getDriverInstance().findElement(LOGIN_PAGE_TEXT_LOCATOR).getText();
    }

}
