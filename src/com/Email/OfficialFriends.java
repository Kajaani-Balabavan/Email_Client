package com.Email;


public class OfficialFriends extends OfficialRecipients implements IBDayWish{
    Day DOB= new Day();

    public OfficialFriends(String name, String email, String designation, Day DOB) {
        super(name, email, designation);
        this.DOB = DOB;
    }

    public Day getDOB() {
        return DOB;
    }

    @Override
    public String BDayWish() {
        return "Dear " + getName() + ",\nWish you a Happy Birthday!\nKajaani";
    }
}
