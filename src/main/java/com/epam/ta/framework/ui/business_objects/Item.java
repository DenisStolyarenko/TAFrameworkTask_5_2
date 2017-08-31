package com.epam.ta.framework.ui.business_objects;

import com.epam.ta.framework.utils.DateUtil;

public abstract class Item {
    protected String summary;
    protected String id;
    protected User creator;
    protected User actionPerfomer;
    protected String currency;
    protected String projectName;

    public Item() {
        this.summary = "Item is created by Selenium " + DateUtil.getSdf(DateUtil.getCurrentDate());
        this.actionPerfomer = new User();
        this.currency = "KZT";
        this.projectName = "ENRC-TRD";
    }

    public String getSummary() {
        return summary;
    }

    public String getId() {
        return id;
    }

    public User getCreator() {
        return creator;
    }

    public User getActionPerfomer() {
        return actionPerfomer;
    }

    public String getCurrency() {
        return currency;
    }

    public String getProjectName() {
        return projectName;
    }

}
