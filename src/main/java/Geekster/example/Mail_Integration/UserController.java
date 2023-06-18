package Geekster.example.Mail_Integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getUser() {
        // Invoke UserService methods
        userService.welcomeUser("John");
        return userService.toString();
    }
}
