package com.assgnment.rs.discount.enums;

import com.assgnment.rs.discount.models.Bill;
import com.assgnment.rs.discount.models.UserRule;
import com.assgnment.rs.discount.utility.DateUtility;
import com.assgnment.rs.discount.utility.LoadProperties;

public enum UserType {

    AFFILIATE {
        @Override
        public UserRule getUserRule(Bill bill){
            LoadProperties loadProperties = new LoadProperties();
            int discountValue = loadProperties.getPropertiesForDiscountValue("AffiliateDiscountPer");
            UserRule userRule = new UserRule();
            userRule.setAppliedDiscountPer(discountValue);
            userRule.setForGrocery(bill.getItemCategory().equals(ItemCategory.GROCERIES));
            return userRule;
        }
    }, EMPLOYEE {
        @Override
        public UserRule getUserRule(Bill bill) {
            LoadProperties loadProperties = new LoadProperties();
            int discountValue = loadProperties.getPropertiesForDiscountValue("EmployeeDiscountPer");
            UserRule userRule = new UserRule();
            userRule.setAppliedDiscountPer(discountValue);
            userRule.setForGrocery(bill.getItemCategory().equals(ItemCategory.GROCERIES));
            return userRule;
        }
    }, CUSTOMER {
        @Override
        public UserRule getUserRule(Bill bill) {
            LoadProperties loadProperties = new LoadProperties();
            int discountValue = loadProperties.getPropertiesForDiscountValue("CustomerDiscountMinPer");
            long durationSince = DateUtility.getDateDuration(bill.getUser().getUserSince());
            if(durationSince>=2l)
                discountValue = loadProperties.getPropertiesForDiscountValue("CustomerDiscountMaxPer");
            UserRule userRule = new UserRule();
            userRule.setAppliedDiscountPer(discountValue);
            userRule.setForGrocery(bill.getItemCategory().equals(ItemCategory.GROCERIES));
            return userRule;
        }
    };

    public abstract UserRule getUserRule(Bill bill);
}
