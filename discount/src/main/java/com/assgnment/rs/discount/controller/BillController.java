package com.assgnment.rs.discount.controller;

import com.assgnment.rs.discount.models.Bill;
import com.assgnment.rs.discount.models.UserDto;
import com.assgnment.rs.discount.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bill/service/")
public class BillController {

    @Autowired
    private BillService billService;

    @PostMapping("netPayable")
    public ResponseEntity<UserDto> netPayableAmt(@RequestBody Bill bill) {
        UserDto userDto = billService.getNetPayableAmt(bill);
        return ResponseEntity.ok(userDto);
    }
}
