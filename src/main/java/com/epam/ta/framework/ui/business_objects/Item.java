package com.epam.ta.framework.ui.business_objects;

import com.epam.ta.framework.utils.DateUtil;

public class Item {//todo Будут классы, которые унаследуются от данного класса
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

    public User getActionPerfomer() {
        return actionPerfomer;
    }

    public void setActionPerfomer(User actionPerfomer) {
        this.actionPerfomer = actionPerfomer;
    }

    public String getSummary() {
        return summary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
