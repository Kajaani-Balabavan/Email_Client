package com.Email;

import java.util.Locale;

public class Create {
    public Recipients addRecipient(String recipients){
        String[] s = recipients.split("\\s*:\\s*");
        String[] s1= s[1].split("\\s*,\\s*");
        String[] s2;
        switch(s[0].toLowerCase(Locale.ROOT)){
            case "personal" :{
                s2= s1[3].split("\\s*/\\s*");
                return new PersonalRecipients(s1[0],s1[1],s1[2],new Day(s2[0],s2[1],s2[2]));

            }
            case "official" :{
                return new OfficialRecipients(s1[0],s1[1],s1[2]);
            }
            case "official-friend" :{
                s2= s1[3].split("\\s*/\\s*");
                return new OfficialFriends(s1[0],s1[1],s1[2],new Day(s2[0],s2[1],s2[2]));
            }
            default: return null;
        }
    }
}
