package com.epam.ta.framework.ui.business_objects;

public class CTCItemCreator extends ItemCreator {
    @Override
    public Item createItem(String name) {
        if ("BT".equals(name)){
            return new BusinessTrip();
//        } else if ("PR".equals(name)){
//            return new PaymentRequest();
        }
        return null;
    }
}
