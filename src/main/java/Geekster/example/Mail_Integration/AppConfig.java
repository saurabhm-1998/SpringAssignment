package Geekster.example.Mail_Integration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // This annotation indicates that this class contains bean definitions
public class AppConfig {
    @Bean // This annotation declares a bean
    public EmailService emailService() {
        return new EmailService();
    }

    @Bean // This annotation declares another bean
    public UserService userService() {
        return new UserService();
    }
}