package com.assgnment.rs.discount.controller;

import com.assgnment.rs.discount.enums.ItemCategory;
import com.assgnment.rs.discount.enums.UserType;
import com.assgnment.rs.discount.models.Bill;
import com.assgnment.rs.discount.models.User;
import com.assgnment.rs.discount.service.BillService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(value = SpringRunner.class)
public class BillControllerTest {

    @Mock
    private BillService billService;

    @InjectMocks
    private BillController billController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(billController).build();
    }

    @Test
    public void test_bill() throws Exception {

        Bill bill = buildBill(UserType.AFFILIATE);
        ObjectMapper mapper = new ObjectMapper();
        String request= mapper.writeValueAsString(bill);

        this.mockMvc.perform(
                post("/bill/service/netPayable").contentType(MediaType.APPLICATION_JSON).content(request))
                .andDo(print())
                .andExpect(status().isOk());
    }

    public Bill buildBill(UserType userType) {
        Bill bill = new Bill();
        bill.setBillAmt(990);

        bill.setItemCategory(ItemCategory.GROCERIES);

        User user = new User();
        user.setName("Vishal");
        user.setUserType(userType);
        bill.setUser(user);
        return bill;
    }
}
