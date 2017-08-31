package com.epam.ta.framework.ui.steps.businesstrip;

import com.epam.ta.framework.ui.business_objects.BusinessTrip;
import com.epam.ta.framework.ui.business_objects.CTCItemCreator;
import com.epam.ta.framework.ui.business_objects.Item;
import com.epam.ta.framework.ui.business_objects.ItemCreator;
import com.epam.ta.framework.ui.pages.businesstrip.BTListPage;
import com.epam.ta.framework.ui.pages.businesstrip.CreateBTPage;
import com.epam.ta.framework.ui.steps.BaseStep;

public class BusinessTripStep extends BaseStep {
    private CreateBTPage createBTPage = new CreateBTPage();
    private BTListPage btListPage = new BTListPage();
//    ItemCreator itemCreator = new CTCItemCreator();
//    Item item = itemCreator.createItem("BT");
    BusinessTrip item = new BusinessTrip();

    public BusinessTripStep() {
    }

    public void createBT(){
        btListPage.newBtClick();
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
        if (createBTPage.countBTid() == 19){
            return true;
        } else return false;
    }

    public boolean isSubmitted(){
        if ((createBTPage.getStatus().toLowerCase().contains("submitted")) || (createBTPage.getStatus().toLowerCase().contains("submited"))){
            return true;
        } else return false;
    }
}
