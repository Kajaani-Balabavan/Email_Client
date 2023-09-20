package com.Email;

public class PersonalRecipients extends Recipients implements IBDayWish{
    private String nickName;
    Day DOB = new Day();

    public PersonalRecipients(String name, String nickName, String email,  Day DOB) {
        super(name, email);
        this.nickName = nickName;
        this.DOB = DOB;
    }

    public String getNickName() {
        return nickName;
    }

    public Day getDOB() {
        return DOB;
    }

    @Override
    public String BDayWish() {
        return "Dear " + getNickName() + ",\nHugs and love on your birthday!\nKajaani";
    }

}
