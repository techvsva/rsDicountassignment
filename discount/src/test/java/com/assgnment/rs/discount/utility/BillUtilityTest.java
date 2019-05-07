package com.assgnment.rs.discount.utility;

import com.assgnment.rs.discount.controller.BillControllerTest;
import com.assgnment.rs.discount.enums.UserType;
import com.assgnment.rs.discount.models.Bill;
import com.assgnment.rs.discount.models.UserDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(value = SpringRunner.class)
public class BillUtilityTest {

    @InjectMocks
    private BillUtility billUtility = new BillUtility();

    @Test
    public void test_bill_utility_for_user_AFFILIATE() {
        Bill bill = new BillControllerTest().buildBill(UserType.AFFILIATE);
        UserDto userDto = billUtility.netPayableAmt(bill);
        Assert.assertEquals(945, userDto.getNetAmtPayable());
    }

    @Test
    public void test_bill_utility_for_user_CUSTOMER() {
        Bill bill = new BillControllerTest().buildBill(UserType.CUSTOMER);
        UserDto userDto = billUtility.netPayableAmt(bill);
        Assert.assertNotNull(userDto.getNetAmtPayable());
    }

    @Test
    public void test_bill_utility_for_user_EMPLOYEE() {
        Bill bill = new BillControllerTest().buildBill(UserType.EMPLOYEE);
        UserDto userDto = billUtility.netPayableAmt(bill);
        Assert.assertNotNull(userDto.getNetAmtPayable());
    }

    @Test
    public void test_bill_utility_will_no_bill() {
        UserDto userDto = billUtility.netPayableAmt(null);
        Assert.assertNotNull(userDto.getNetAmtPayable());
    }
}
