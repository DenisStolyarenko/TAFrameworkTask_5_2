package com.epam.ta.framework.ui.core.utils;


import com.epam.ta.framework.ui.core.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Waiters {
    private static final int WAIT_FOR_ELEMENT_TIMEOUT_SECONDS = 20;

    public static void waitForElementPresent(By locator) {
        new WebDriverWait(Driver.getDriverInstance(), WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public static void waitForElementVisible(By locator) {
        new WebDriverWait(Driver.getDriverInstance(), WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public static void waitForElementHided(By locator) {
        new WebDriverWait(Driver.getDriverInstance(), WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(locator)));
    }

    public static void waitForElementEnabled(By locator) {
        new WebDriverWait(Driver.getDriverInstance(), WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementVisibleEnabled(By locator) {
        new WebDriverWait(Driver.getDriverInstance(), WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(
                ExpectedConditions.and(
                        ExpectedConditions.visibilityOfAllElementsLocatedBy(locator),
                        ExpectedConditions.elementToBeClickable(locator)));
    }


    public static boolean isElementPresent(By locator) {
        Driver.getDriverInstance().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        List<WebElement> list = Driver.getDriverInstance().findElements(locator);
        Driver.getDriverInstance().manage().timeouts().implicitlyWait(WAIT_FOR_ELEMENT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        return list.size() != 0 && list.get(0).isDisplayed();
    }
}
