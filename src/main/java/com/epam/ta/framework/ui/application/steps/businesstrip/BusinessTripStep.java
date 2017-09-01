package com.epam.ta.framework.ui.application.steps.businesstrip;

import com.epam.ta.framework.ui.application.business_objects.BusinessTrip;
import com.epam.ta.framework.ui.application.business_objects.BusinessTripFactory;
import com.epam.ta.framework.ui.application.pages.businesstrip.BTListPage;
import com.epam.ta.framework.ui.application.pages.businesstrip.CreateBTPage;
import com.epam.ta.framework.ui.application.steps.BaseStep;

public class BusinessTripStep extends BaseStep {
    private CreateBTPage createBTPage = new CreateBTPage();
    private BTListPage btListPage = new BTListPage();

    public BusinessTripStep() {
    }

    public void createBT(Integer EstimatedBudget){
        btListPage.newBtClick();
        BusinessTrip item = BusinessTripFactory.createBusinessTripForApproveByDifferentLevel(EstimatedBudget);
        createBTPage.chooseProject(item.getProjectName());
        createBTPage.inputEstimatedBudget(item.getEstimatedBudget());
        createBTPage.inputTripFromLocation(item.getLocationFrom());
        createBTPage.inputDestinationCountry(item.getCountry());
        createBTPage.inputDestinationCity(item.getDestinationCity());
        createBTPage.inputDestinationAddress(item.getDestinationAddress());
        createBTPage.inputTripDescription(item.getDescription());
        createBTPage.inputStartDate(item.getPlannedStartDate());
        createBTPage.inputEndDate(item.getPlannedEndDate());
        createBTPage.inputSummary(item.getSummary());
        createBTPage.saveItem();
    }

    public String openList(String baseUrl){
        btListPage.openBTlist(baseUrl);
        return btListPage.readListName();
    }

    public void editBT(){

    }

    public void cancelBT(){

    }

    public void rejectBT(){

    }

    public boolean checkBTid(){
        return createBTPage.countBTid() == 19;
    }

    public boolean isSubmitted(){
        return (createBTPage.getStatus().toLowerCase().contains("submitted")) || (createBTPage.getStatus().toLowerCase().contains("submited"));
    }
}
