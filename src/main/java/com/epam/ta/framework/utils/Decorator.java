package com.epam.ta.framework.utils;

import org.openqa.selenium.*;

public abstract class Decorator implements WebElement{
    protected WebElement component;

    public Decorator(WebElement c){
        component = c;
    }

    @Override
    public void click(){
        component.click();
    }

}
