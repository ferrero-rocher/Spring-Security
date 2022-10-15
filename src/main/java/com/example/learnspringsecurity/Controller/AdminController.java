package com.example.learnspringsecurity.Controller;

import com.example.learnspringsecurity.Models.User;
import com.example.learnspringsecurity.ServiceImpl.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
     userService userService;

    @GetMapping("/users/all")
    public List<User> getAllUsers()
    {

        return this.userService.getAllUsers();
    }

    @GetMapping("/user/{username}")
    public User getOneUser(@PathVariable String username)
    {
        return this.userService.getOneUser(username);
    }


    @PostMapping("/user")
    public User insertUser(@RequestBody User user)
    {
        System.out.println("M here");
        return this.userService.insertUser(user);
    }

}
