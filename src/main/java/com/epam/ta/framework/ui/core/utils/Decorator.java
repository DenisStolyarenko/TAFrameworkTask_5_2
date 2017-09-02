package com.epam.ta.framework.ui.core.utils;

import org.openqa.selenium.*;

import java.util.List;

public class Decorator implements WebElement{
    protected WebElement component;

    public Decorator(WebElement c){
        component = c;
    }

    @Override
    public void click(){
        Service.HighlightOfElement(component);
        component.click();
    }

    @Override
    public void submit() {
        component.submit();
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        component.sendKeys();
    }

    @Override
    public void clear() {
        component.clear();
    }

    @Override
    public String getTagName() {
        return component.getTagName();
    }

    @Override
    public String getAttribute(String s) {
        return component.getAttribute(s);
    }

    @Override
    public boolean isSelected() {
        return component.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return component.isEnabled();
    }

    @Override
    public String getText() {
        return component.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return component.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return component.findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        return component.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return component.getLocation();
    }

    @Override
    public Dimension getSize() {
        return component.getSize();
    }

    @Override
    public Rectangle getRect() {
        return component.getRect();
    }

    @Override
    public String getCssValue(String s) {
        return component.getCssValue(s);
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return component.getScreenshotAs(outputType);
    }
}
