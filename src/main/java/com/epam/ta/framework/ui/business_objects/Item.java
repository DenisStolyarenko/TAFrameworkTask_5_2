package com.epam.ta.framework.ui.business_objects;

public abstract class Item {
    public abstract String getProjectName();

    public abstract Integer getEstimatedBudget();

    public abstract String getLocationFrom();

    public abstract String getCountry();

    public abstract String getDestinationCity();

    public abstract String getDestinationAddress();

    public abstract String getDescription();

    public abstract String getPlannedStartDate();

    public abstract String getPlannedEndDate();

    public abstract String getSummary();

//    protected String summary = "Item is created by Selenium " + DateUtil.getSdf(DateUtil.getCurrentDate());
//    protected String id;
//    protected User creator;
//    protected User actionPerfomer = new User();
////    protected String currency ="KZT";
//    protected String projectName = "ENRC-TRD";
////
//    public String getSummary() {
//        return summary;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public User getCreator() {
//        return creator;
//    }
//
//    public User getActionPerfomer() {
//        return actionPerfomer;
//    }
//
////    public String getCurrency() {
////        return currency;
////    }
//
//    public String getProjectName() {
//        return projectName;
//    }


    //    public Item() {
//        this.summary = "Item is created by Selenium " + DateUtil.getSdf(DateUtil.getCurrentDate());
//        this.actionPerfomer = new User();
//        this.currency = "KZT";
//        this.projectName = "ENRC-TRD";
//    }


}
