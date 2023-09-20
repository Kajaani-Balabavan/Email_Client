package com.Email;

import java.io.Serializable;

public class ComposeEmail implements Serializable {
    private String recipient;
    private String subject;
    private String message;
    private Day date;

    public ComposeEmail(String recipient, String subject, String message) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
        this.date = new Day();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public Day getDate() {
        return date;
    }
}
