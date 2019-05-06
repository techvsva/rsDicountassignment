package com.assgnment.rs.discount.models;

import com.assgnment.rs.discount.enums.UserType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {

    private UserType userType;
    private LocalDateTime userSince;
    private String name;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public LocalDateTime getUserSince() {
        return userSince;
    }

    public void setUserSince(LocalDateTime userSince) {
        this.userSince = userSince;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
