# Email Client

This is a simple email client application developed as a second-semester Object-Oriented Programming (OOP) assignment. The application allows you to manage recipients, send birthday wishes, and send emails.

## Prerequisites

Before you get started, make sure you have the following prerequisites:

1. Java Development Kit (JDK) installed.
2. A Gmail account for sending emails.
3. **Important**: If 2-Step Verification is enabled on your Gmail account, you will need to create an App Password to use with this application.
4. Configure your Gmail SMTP settings in the SendEmail class:
  - final String username = "your-email@gmail.com";
  - final String password = "your-app-password";

## Enabling 2-Step Verification and Creating an App Password

If 2-Step Verification is ON for your Gmail account, you may encounter an error when trying to send emails through this application. To resolve this, follow these steps:

1. Visit [Google's support page](https://support.google.com/accounts/answer/185833?p=InvalidSecondFactor).
2. Follow the instructions to enable 2-Step Verification on your Gmail account if not already enabled.
3. Once 2-Step Verification is enabled, you will need to create an "App Password" specifically for this application. 
4. Use the generated App Password as your password when configuring the email client (Step 3).

## Usage

1. Compile and run the `Email_Client.java` file to start the email client.
2. Follow the on-screen instructions to add recipients, send birthday wishes, send emails, and more.
