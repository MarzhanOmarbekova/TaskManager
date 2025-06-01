package controller;

import entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/auth/register")
    public Users register(@RequestBody Users user){
        return userService.register(user);
    }

    @PostMapping("/api/auth/login")
    public String login(@RequestBody Users user) {

        return userService.verify(user);
    }
}
