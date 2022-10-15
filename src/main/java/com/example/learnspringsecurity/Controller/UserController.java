package com.example.learnspringsecurity.Controller;

import com.example.learnspringsecurity.Models.User;
import com.example.learnspringsecurity.ServiceImpl.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/login")
    public String login()
    {
        return "This is Login Page";
    }

    @GetMapping("/register")
    public String register()
    {
        return "This is Registration Page";
    }

    @GetMapping("/home")
    public String home()
    {
        return "This is Home Page";
    }


}
