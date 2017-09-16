package com.epam.ta.framework.ui.application.pages.businesstrip;

import com.epam.ta.framework.ui.application.pages.AbstractPage;
import com.epam.ta.framework.ui.core.driver.Driver;
import com.epam.ta.framework.ui.core.utils.Decorator;
import com.epam.ta.framework.ui.core.utils.Service;
import com.epam.ta.framework.ui.core.utils.Waiters;
import org.openqa.selenium.By;

public class BTListPage extends AbstractPage {
    private final String BUSINESS_TRIP_LOCATION = "/businesstrip/list.do";
    private final By BT_LIST_NAME_LOCATOR = By.xpath("//td[@class='header1']/h1");
    private final By CREATE_BUTTON_LOCATOR = By.xpath("//input[@title='Create New Business Trip Request']");

    public void openBTlist(String baseUrl){
        Driver.getDriverInstance().get(baseUrl + BUSINESS_TRIP_LOCATION);
    }

    public void newBtClick(){
        Waiters.waitForElementEnabled(CREATE_BUTTON_LOCATOR);
        new Decorator(Driver.getDriverInstance().findElement(CREATE_BUTTON_LOCATOR)).click();
    }

    public String readListName(){
        Waiters.waitForElementPresent(BT_LIST_NAME_LOCATOR);
        return Driver.getDriverInstance().findElement(BT_LIST_NAME_LOCATOR).getText();
    }
}
