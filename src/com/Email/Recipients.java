package com.Email;

public abstract class Recipients {
    private String name;
    private String email;
    private static int total_recipient=0;

    public Recipients(String name, String email) {
        this.name = name;
        this.email = email;
        total_recipient++;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static int getTotal_recipient() {
        return total_recipient;
    }
}
