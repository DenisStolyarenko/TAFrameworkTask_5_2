package com.epam.ta.framework.utils;

import com.epam.ta.framework.ui.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Service {
    protected static String border_3PX_green = "'3px solid green'";
    protected static String border_0PX = "'0px'";

    private static void highlightElementAndReturnBgColor(WebElement element){
        String bg = element.getCssValue("backgroundColor");
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriverInstance());
        js.executeScript("arguments[0].style.backgroundColor = '" + "green" + "'", element);
        js.executeScript("arguments[0].style.backgroundColor = '" + bg + "'", element);
    }

    protected static void HighlightOfElement(WebElement element){
        ((JavascriptExecutor) Driver.getDriverInstance()).executeScript("arguments[0].style.border=" + border_3PX_green, element);
    }

    protected static void unHighlightOfElement(WebElement element){
        ((JavascriptExecutor) Driver.getDriverInstance()).executeScript("arguments[0].style.backgroundColor = " + border_0PX, element);
    }

    public static DecoratorHighlight decorate(WebElement element){
        return new DecoratorHighlight(element);
    }
}
