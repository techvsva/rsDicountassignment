package com.assgnment.rs.discount.utility;

import com.assgnment.rs.discount.models.Bill;
import com.assgnment.rs.discount.models.UserDto;
import com.assgnment.rs.discount.models.UserRule;
import org.springframework.stereotype.Component;

@Component
public class BillUtility {

    public UserDto netPayableAmt(Bill bill) {
        UserDto userDto = new UserDto();
        int netPayableAmt = 0;
        int multipleOfHundreds = 0;
        if(bill!=null && bill.getUser() != null && bill.getUser().getUserType()!=null) {
            UserRule userRule = bill.getUser().getUserType().getUserRule(bill);
            int billAmt = bill.getBillAmt();
            int appliedDiscountPer = userRule.getAppliedDiscountPer();
            if (userRule.isCalculatePer()) {
                int discountValue = getDiscountPer(billAmt, appliedDiscountPer);
                multipleOfHundreds = getValueByMultipleOf100(discountValue);
                discountValue = discountValue - getValueByMultipleOf100(discountValue);
                netPayableAmt = multipleOfHundreds + getDiscountPer(discountValue, 5);
            } else {
                multipleOfHundreds = getValueByMultipleOf100(billAmt);
                netPayableAmt = multipleOfHundreds + getDiscountPer(billAmt - multipleOfHundreds, 5);
            }
            userDto.setNetAmtPayable(netPayableAmt);
            userDto.setUserName(bill.getUser().getName());
        }
        return userDto;
    }

    public static int getDiscountPer(int billAmt, int appliedDiscountPer) {
        int value = getPercentage(billAmt,appliedDiscountPer );
        int discount = billAmt - value;
        return discount;
    }

    public static int getPercentage(int billAmt, int perValue) {
        int discount = (billAmt*perValue)/100;
        return discount;
    }

    private static int getValueByMultipleOf100(int value) {
        int modulus = value%100;
        if(modulus>=100) {
            getValueByMultipleOf100(modulus);
        }
        return modulus;
    }
}

