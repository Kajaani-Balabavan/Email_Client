package com.Email;

// index number : 200279N

//import libraries

import java.util.ArrayList;
import java.util.Scanner;

public class Email_Client {

    public static void main(String[] args) {
        System.out.println("Loading Email Client..................");
        Scanner scanner = new Scanner(System.in);

        ArrayList<IBDayWish> birthdayBabies;  //list to store personal, office-friend recipients
        ArrayList<ComposeEmail> Sent_mails= new ArrayList<>();  // list to store sent mails
        ArrayList<ComposeEmail> readMails; // list to store mail details after deserialization
        ArrayList<ComposeEmail> newMails= new ArrayList<>(); //list to store emails sent in current process

        CreateRecipient recipient= new CreateRecipient(); // create recipients by traversing text file

        // sending birthday wish
        ComposeEmail message=null;
        birthdayBabies= recipient.create();
        BDayWish wish= new BDayWish();
        Sent_mails=wish.sendWish(birthdayBabies);

        boolean error=false;
        while (!error) {
            System.out.println("\nEnter option type: \n"
                    + "1 - Adding a new recipient\n"
                    + "2 - Sending an email\n"
                    + "3 - Printing out all the recipients who have birthdays\n"
                    + "4 - Printing out details of all the emails sent\n"
                    + "5 - Printing out the number of recipient objects in the application\n"
                    + "Enter any other number to exit the email- client");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Enter recipient details.\ninput format :- \nOfficial: nimal,nimal@gmail.com,ceo \nOffice_friend: kamal,kamal@gmail.com,clerk,2000/12/12 \nPersonal: sunil,<nick-name>,sunil@gmail.com,2000/10/10");
                    Update document= new Update();
                    Create doc= new Create();
                    String details = scanner.nextLine().trim();
                    document.updateFile(details);  // add to file
                    System.out.println("Recipient details updated successfully");
                    Recipients client=doc.addRecipient(details);  // create object
                    if(client instanceof IBDayWish){  // check and send birthday wish
                        BDayWish wish1=new BDayWish();
                        ComposeEmail message1= null;
                        message1=wish1.sendWish((IBDayWish) client);
                        newMails.add(message1);
                        Sent_mails.add(message1);
                    }
                    // input format - Official: nimal,nimal@gmail.com,ceo
                    // Use a single input to get all the details of a recipient
                    // code to add a new recipient
                    // store details in clientList.txt file
                    // Hint: use methods for reading and writing files
                    break;
                case 2:
                    System.out.println("Enter mail details.\ninput format - email, subject, content");
                    String[] data1 = scanner.nextLine().split("\\s*,\\s*");
                    ComposeEmail mail = new ComposeEmail(data1[0], data1[1], data1[2]);
                    SendEmail.sendEmail(mail);
                    Sent_mails.add(mail);
                    System.out.println("Your mail is sent successfully");
                    newMails.add(mail);
                    // input format - email, subject, content
                    // code to send an email
                    break;
                case 3:
                    System.out.println("Enter date.\ninput format - yyyy/mm/dd ");
                    String[] data2 = scanner.nextLine().split("\\s*/\\s*");
                    Day bday = new Day(data2[0], data2[1], data2[2]);
                    BDayTwins twin = new BDayTwins();
                    twin.birthday(birthdayBabies, bday);
                    // input format - yyyy/MM/dd (ex: 2018/09/17)
                    // code to print recipients who have birthdays on the given date
                    break;
                case 4:
                    System.out.println("Enter date.\ninput format - yyyy/mm/dd ");
                    String[] data3 = scanner.nextLine().split("\\s*/\\s*");
                    Day today= new Day();
                    Day day = new Day(data3[0], data3[1], data3[2]);
                    readMails=Ser_Deser.deserialize();
                    boolean mail_date=true;
                    for(ComposeEmail data: readMails ){ // for already sent mails
                        Sent_mails.add(data);
                        Day sent_date=data.getDate();
                        if((day.getDate().equals(sent_date.getDate())) && (day.getMonth().equals(sent_date.getMonth())) && (day.getYear().equals(sent_date.getYear()))){
                            System.out.println("Email Address: "+data.getRecipient()+"\nSubject: "+ data.getSubject()+ "\nMessage: \n"+ data.getMessage()+"\n");
                            mail_date=false;
                        }
                    }
                    if((day.getDate().equals(today.getDate())) && (day.getMonth().equals(today.getMonth())) && (day.getYear().equals(today.getYear()))){
                        for (ComposeEmail data: newMails){ // for newly sent mails
                            System.out.println("Email Address: "+data.getRecipient()+"\nSubject: "+ data.getSubject()+ "\nMessage: \n"+ data.getMessage()+"\n");
                            mail_date=false;
                        }
                    }
                    if(mail_date){
                        System.out.println("No Emails were sent on "+ day.getYear()+"/"+ day.getMonth()+"/"+ day.getDate());
                    }
                    // input format - yyyy/MM/dd (ex: 2018/09/17)
                    // code to print the details of all the emails sent on the input date
                    break;
                case 5:
                    System.out.println("Total number of recipients in Email_Client: " + Recipients.getTotal_recipient());
                    // code to print the number of recipient objects in the application
                    break;
                default:
                    error = true;
                    System.out.println("Email Client is closing....");
            }
        }
        // start email client
        // code to create objects for each recipient in clientList.txt
        // use necessary variables, methods and classes
        Ser_Deser.serialize(Sent_mails);
    }
}

// create more classes needed for the implementation (remove the  public access modifier from classes when you submit your code)