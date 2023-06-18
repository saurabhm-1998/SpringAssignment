package Geekster.example.Mail_Integration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component // This annotation marks the class as a Spring-managed component
public class EmailService {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void sendEmail(String message) {
        System.out.println("Sending email to " + email + ": " + message);
        // Set up properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Set up session
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("mishrasaurabhvns123@gmail.com", "gyyuipohbvcdegnn");
            }
        });

        try {
            // Create message
            Message emailMessage = new MimeMessage(session);
            emailMessage.setFrom(new InternetAddress("mishravns.saurabh@gmail.com"));
            emailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            emailMessage.setSubject("Subject of the Email");
            emailMessage.setText(message);

            // Send message
            Transport.send(emailMessage);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    }

    @Override
    public String toString() {
        return "EmailService [email=" + email + "]";
    }
}
