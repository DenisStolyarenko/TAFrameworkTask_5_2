package com.epam.ta.framework.ui.business_objects;

import com.epam.ta.framework.utils.DateUtil;

import java.util.Date;

public class BusinessTrip extends Item {
    private Integer estimatedBudget;
    private Date plannedStartDate;
    private Date plannedEndDate;
    private String locationFrom;
    private String country;
    private String destinationCity;
    private String destinationAddress;
    private String description;

    public BusinessTrip() {
        super();
        this.estimatedBudget = 200000;
        this.plannedStartDate = DateUtil.getCurrentDate();
        this.plannedEndDate = DateUtil.getNextDate();
        this.locationFrom = "Karaganda";
        this.country = "Belarus";
        this.destinationCity = "Minsk";
        this.destinationAddress = "Minsk, Lenin street";
        this.description = "Travel to " + destinationCity + " " + DateUtil.getCurrentDate();;
    }

    public Integer getEstimatedBudget() {
        return estimatedBudget;
    }

    public void setEstimatedBudget(Integer estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public String getPlannedStartDate() {
        return DateUtil.getInputFormat(plannedStartDate);
    }

    public String getPlannedEndDate() {
        return DateUtil.getInputFormat(plannedEndDate);
    }

    public String getLocationFrom() {
        return locationFrom;
    }

    public void setLocationFrom(String locationFrom) {
        this.locationFrom = locationFrom;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
