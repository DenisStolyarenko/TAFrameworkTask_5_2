package com.epam.ta.framework.ui.application.pages.general;

import com.epam.ta.framework.ui.application.pages.AbstractPage;
import com.epam.ta.framework.ui.core.driver.Driver;
import com.epam.ta.framework.ui.core.utils.Service;
import com.epam.ta.framework.ui.core.utils.Waiters;
import org.openqa.selenium.By;

public class ChooseProjectBlock extends AbstractPage {
    private final String frameLookupDialogName = "frLookupDialog";
    private final By FILTER_LOCATOR = By.xpath("//select[@name='filter']");
    private final By SEARCH_INPUT_LOCATOR = By.xpath("//input[@name='keywordSearch']");
    private final By GO_BUTTON_LOCATOR = By.xpath("//input[@value='Go']");
    private final By OK_BUTTON_LOCATOR = By.xpath("//input[@value='OK']");

    public ChooseProjectBlock changeFilter(){
        Driver.getDriverInstance().switchTo().frame(frameLookupDialogName);
        Waiters.waitForElementVisibleEnabled(FILTER_LOCATOR);
        Driver.getDriverInstance().findElement(FILTER_LOCATOR).sendKeys("My projects");
        return this;
    }

    public ChooseProjectBlock searchProjectOrCost(String projectName){
        Waiters.waitForElementVisibleEnabled(SEARCH_INPUT_LOCATOR);
        Driver.getDriverInstance().findElement(SEARCH_INPUT_LOCATOR).sendKeys(projectName);
        Service.decorate(Driver.getDriverInstance().findElement(GO_BUTTON_LOCATOR)).click();
        Service.decorate(Driver.getDriverInstance().findElement(By.xpath("//input[@type='checkbox' and @projectcostobjectname='" + projectName + "']"))).click();
        return this;
    }

    public void clickByOK (){
        Waiters.waitForElementVisibleEnabled(OK_BUTTON_LOCATOR);
        Service.decorate(Driver.getDriverInstance().findElement(OK_BUTTON_LOCATOR)).click();
    }

}
