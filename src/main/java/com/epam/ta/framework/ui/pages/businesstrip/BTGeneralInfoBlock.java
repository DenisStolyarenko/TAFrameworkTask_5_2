package com.epam.ta.framework.ui.pages.businesstrip;

import com.epam.ta.framework.ui.driver.Driver;
import com.epam.ta.framework.ui.pages.AbstractPage;
import com.epam.ta.framework.ui.pages.general.ChooseProjectBlock;
import com.epam.ta.framework.utils.Waiters;
import org.openqa.selenium.By;

public class BTGeneralInfoBlock extends AbstractPage{
    private final By SUMMARY_LOCATOR = By.xpath("//input[@name='itemName']");
    private final By ESTIMATE_BUDGET_LOCATOR = By.xpath("//input[@class='textfield textfieldDigit textfieldAmount' and @name='estimatedBudget']");
    private final By BT_CURRENCY_LOCATOR = By.xpath("//input[@id='baseCurrencyStr']");
    private final By BT_CURRENCY_ID_LOCATOR = By.xpath("//input[@name='baseCurrencyId']");
    private final By CHOOSE_PROJECT_LOCATOR = By.xpath("//img[contains(@onclick,'chooseprojectcostobject')]");
    private final By CLEAR_PROJECT_LOCATOR = By.xpath("//a/img[@title='Clear']");
    private final By BT_ID_LOCATOR = By.xpath("//span[@class='item' and contains(text(), 'Business Trip ID: #')]/a");

    public ChooseProjectBlock chooseProject(){
        Waiters.waitForElementEnabled(CHOOSE_PROJECT_LOCATOR);
        Driver.getDriverInstance().findElement(CHOOSE_PROJECT_LOCATOR).click();
        return new ChooseProjectBlock();
    }

    public BTGeneralInfoBlock clearProject(){
        Waiters.waitForElementEnabled(CLEAR_PROJECT_LOCATOR);
        Driver.getDriverInstance().findElement(CLEAR_PROJECT_LOCATOR).click();
        return this;
    }

    public BTGeneralInfoBlock inputSummary(String summary){
        Waiters.waitForElementEnabled(SUMMARY_LOCATOR);
        Driver.getDriverInstance().findElement(SUMMARY_LOCATOR).sendKeys(summary);
        return this;
    }

    public BTGeneralInfoBlock clearSummary(){
        Waiters.waitForElementEnabled(SUMMARY_LOCATOR);
        Driver.getDriverInstance().findElement(SUMMARY_LOCATOR).clear();
        return this;
    }

    public BTGeneralInfoBlock inputCurrency(String currency){
        Waiters.waitForElementEnabled(BT_CURRENCY_LOCATOR);
        Driver.getDriverInstance().findElement(BT_CURRENCY_LOCATOR).sendKeys(currency);
        return this;
    }

    public BTGeneralInfoBlock clearCurrency(){
        Waiters.waitForElementEnabled(BT_CURRENCY_LOCATOR);
        Driver.getDriverInstance().findElement(BT_CURRENCY_LOCATOR).clear();
        return this;
    }

    public BTGeneralInfoBlock inputEstimatedBudget(Integer estimatedBudget){
        Waiters.waitForElementEnabled(ESTIMATE_BUDGET_LOCATOR);
        Driver.getDriverInstance().findElement(ESTIMATE_BUDGET_LOCATOR).sendKeys(estimatedBudget.toString());
        return this;
    }

    public String getBTid(){
        Waiters.waitForElementVisibleEnabled(BT_ID_LOCATOR);
        return Driver.getDriverInstance().findElement(BT_ID_LOCATOR).getText();
    }

}
