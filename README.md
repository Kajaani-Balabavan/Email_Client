# Email_Client

Email Client is a Java-based application that allows users to manage recipients, send emails, and send birthday wishes to contacts. It is an application designed as a second-semester Object-Oriented Programming (OOP) assignment. It's intended to help students practice OOP principles while creating a functional email management tool. The application supports different types of recipients, including personal, official, and official friends. Users can send birthday wishes to contacts with birthdays and send custom email messages to recipients.

### Prerequisites

- Java Development Kit (JDK)
- A Java IDE (e.g., Eclipse, IntelliJ IDEA)
- A Gmail account for sending emails (you may need to configure Gmail SMTP settings)

1. Open the project in your Java IDE.

2. Configure your Gmail SMTP settings in the SendEmail class:
  final String username = "your-email@gmail.com";
  final String password = "your-email-password";

3. Run the Email_Client main class to start the application.

4. Use the following options to interact with the Email Client:
  Option 1: Add a new recipient by providing recipient details in the specified format.
  Option 2: Compose and send an email by entering the recipient's email address, subject, and content.
  Option 3: Check recipients who have birthdays on a specific date.
  Option 4: View details of emails sent on a specific date.
  Option 5: Display the total number of recipients in the Email Client.
