package com.Email;

import java.util.ArrayList;

public class BDayTwins {
    public void birthday(ArrayList<IBDayWish> recipient, Day givenDay){
        System.out.println("Recipients having birthday on "+ givenDay.getYear()+"/"+ givenDay.getMonth()+"/"+ givenDay.getDate()+":");
        boolean flag=false;
        for(IBDayWish birthdaybaby: recipient){
            Day DOB=birthdaybaby.getDOB();
            if (givenDay.getDate().equals(DOB.getDate()) && givenDay.getMonth().equals(DOB.getMonth())){
                System.out.println(birthdaybaby.getName());
                flag=true;
            }
        }
        if (!flag){
            System.out.println("No recipients have birthday on given day");
        }
    }
}
