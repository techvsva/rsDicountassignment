package com.assgnment.rs.discount.service;

import com.assgnment.rs.discount.models.Bill;
import com.assgnment.rs.discount.models.UserDto;
import com.assgnment.rs.discount.utility.BillUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillUtility billUtility;

    @Override
    public UserDto getNetPayableAmt(Bill bill) {
        return billUtility.netPayableAmt(bill);
    }
}
