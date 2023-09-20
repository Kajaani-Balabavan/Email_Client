package com.Email;

import java.util.ArrayList;

public class BDayWish{
    private String email;
    private String message;
    private Day DOB;
    ArrayList<ComposeEmail> wish= new ArrayList<>();
    public ArrayList<ComposeEmail> sendWish(ArrayList<IBDayWish> recipient){ // for recipient in the clientList
        Day today= new Day();
        ComposeEmail mail=null;
        for(IBDayWish birthdaybaby: recipient){
            DOB=birthdaybaby.getDOB();
            if (today.getDate().equals(DOB.getDate()) && today.getMonth().equals(DOB.getMonth())){
                email= birthdaybaby.getEmail();
                message= birthdaybaby.BDayWish();
                mail= new ComposeEmail(email,"HAPPY BIRTHDAY",message);
                SendEmail.sendEmail(mail);
                System.out.println("BirthDay wish is sent successfully");
                wish.add(mail);
            }
        }
        return wish;
    }
    public ComposeEmail sendWish(IBDayWish recipient){ // for newly added recipient
        Day today= new Day();
        ComposeEmail mail=null;
        DOB=recipient.getDOB();
        if (today.getDate().equals(DOB.getDate()) && today.getMonth().equals(DOB.getMonth())){
            email= recipient.getEmail();
            message= recipient.BDayWish();
            mail= new ComposeEmail(email,"HAPPY BIRTHDAY",message);
            SendEmail.sendEmail(mail);
            System.out.println("Your BirthDay wish is sent successfully");
            wish.add(mail);
        }
        return mail;
    }
}

