package com.assgnment.rs.discount.service;

import com.assgnment.rs.discount.models.Bill;
import com.assgnment.rs.discount.models.UserDto;

public interface BillService {

    public UserDto getNetPayableAmt(Bill bill);
}
