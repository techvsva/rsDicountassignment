package com.assgnment.rs.discount.utility;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateUtility {

    public static long getDateDuration(LocalDateTime localDateTime) {
        LocalDateTime curDateTime = LocalDateTime.now();
        LocalDateTime fromTemp = LocalDateTime.from(localDateTime);
        long years = fromTemp.until(curDateTime, ChronoUnit.YEARS);
        return years;
    }
}
