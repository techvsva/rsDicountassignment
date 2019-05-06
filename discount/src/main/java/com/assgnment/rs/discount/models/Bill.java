package com.assgnment.rs.discount.models;

import com.assgnment.rs.discount.enums.ItemCategory;

public class Bill {

    private User user;
    private ItemCategory itemCategory;
    private int billAmt;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(int billAmt) {
        this.billAmt = billAmt;
    }
}
