package com.practice.java;

import java.util.HashMap;

public class dayOfTheYear {
    public static void main(String args[]){
        //String date = "2019-12-31";
        String date = "1900-05-02";
        System.out.println(dates(date));
    }
    public static int dates(String date){
        String[] yearToDate = date.split("-");
        int year = Integer.parseInt(yearToDate[0]);
        int month = Integer.parseInt(yearToDate[1]);
        int day = Integer.parseInt(yearToDate[2]);
        int numberOfDays =0;
        boolean is_leap_year= false;



        System.out.println("year   :"+year+"  month   :"+month+"    day    :"+day);
        if (year % 4 == 0) {
            is_leap_year = true;

            // To identify whether it is a
            // century year or not
            if (year % 100 == 0) {
                // Checking if year is divisible by 400
                // therefore century leap year
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }


        System.out.println("hey year" +year+ "isleap"+ is_leap_year);


        HashMap<Integer,Integer>hm = new HashMap<>();
        if(is_leap_year ==true){
            hm.put(2,29);
        }
        else{
            hm.put(2,28);
        }
        hm.put(1,31);
        hm.put(3,31);
        hm.put(4,30);
        hm.put(5,31);
        hm.put(6,30);
        hm.put(7,31);
        hm.put(8,31);
        hm.put(9,30);
        hm.put(10,31);
        hm.put(11,30);
        hm.put(12,31);


        System.out.println(hm.get(2));
        if(month == 1){
            numberOfDays = day;
            System.out.println(numberOfDays);
            return numberOfDays;
        }
        else if(month>1){
            int i  = month-1;
            while(i>=1){
                numberOfDays += hm.get(i);
                i--;
            }
            numberOfDays= numberOfDays+day;
        }
        System.out.println(numberOfDays);
        return numberOfDays;
    }


}
