package Geekster.example.Mail_Integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // This annotation marks the class as a Spring-managed component
public class UserService {
    @Autowired // This annotation enables Spring to perform dependency injection
    private EmailService emailService; // Injecting the EmailService bean

    public void welcomeUser(String username) {
        System.out.println("Welcome, " + username + "!");
        emailService.sendEmail("Welcome message to " + username);
    }
}
