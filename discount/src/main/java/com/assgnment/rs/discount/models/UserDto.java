package com.assgnment.rs.discount.models;

public class UserDto {

    private String userName;
    private int netAmtPayable;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNetAmtPayable() {
        return netAmtPayable;
    }

    public void setNetAmtPayable(int netAmtPayable) {
        this.netAmtPayable = netAmtPayable;
    }

}
