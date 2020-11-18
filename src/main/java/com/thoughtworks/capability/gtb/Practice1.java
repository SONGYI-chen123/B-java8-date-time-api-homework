package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        LocalDate laborDayofSameYear = LocalDate.of(date.getYear(), 5, 1);
        if (laborDayofSameYear.isAfter(date)) {
            return date.until(laborDayofSameYear, DAYS);
        } else {
            int nextYear = date.getYear() + 1;
            LocalDate laborDayofNextYear = LocalDate.of(nextYear, 5, 1);
            return date.until(laborDayofNextYear, DAYS);
        }
    }
}
