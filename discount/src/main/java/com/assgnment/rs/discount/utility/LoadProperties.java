package com.assgnment.rs.discount.utility;

import java.util.Properties;

public class LoadProperties {

    public int getPropertiesForDiscountValue(String propertyName) {
        Properties properties = new Properties();
        int value = 0;
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));

            value = Integer.parseInt(properties.getProperty(propertyName));

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return value;
    }
}
