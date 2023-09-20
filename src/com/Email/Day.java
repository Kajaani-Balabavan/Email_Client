package com.Email;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Day implements Serializable {
    private String year;
    private String month;
    private String date;

    public Day(String year, String month, String date) { //constructor for input date
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public Day() { //constructor for current date
        Date today= new Date();
        Calendar calendar =  Calendar.getInstance();
        calendar.setTime(today);
        this.year = String.valueOf(calendar.get(Calendar.YEAR));
        this.month = String.format("%02d",calendar.get(Calendar.MONTH)+1); // january is denoted as 0
        this.date = String.format("%02d",calendar.get(Calendar.DAY_OF_MONTH));
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDate() {
        return date;
    }
}
