package com.assgnment.rs.discount.service;

import com.assgnment.rs.discount.models.UserDto;
import com.assgnment.rs.discount.utility.BillUtility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(value = SpringRunner.class)
public class BillServiceTest {

    @InjectMocks
    private BillService billService = new BillServiceImpl();

    @Mock
    private BillUtility billUtility;

    UserDto userDto = new UserDto();

    @Before
    public void setup() {
        userDto.setNetAmtPayable(945);
        userDto.setUserName("Vishal");
        Mockito.when(billService.getNetPayableAmt(Mockito.any())).thenReturn(userDto);
    }

    @Test
    public void test_bill_service() {
        Assert.assertNotNull(userDto);
        Assert.assertEquals(945, userDto.getNetAmtPayable());
    }

}
