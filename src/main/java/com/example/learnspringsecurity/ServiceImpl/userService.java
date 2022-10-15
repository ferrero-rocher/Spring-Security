package com.example.learnspringsecurity.ServiceImpl;

import com.example.learnspringsecurity.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userService {
    List<User> userlist = new ArrayList<>();
    public userService()
    {
        userlist.add(new User("abc","abc","ABC@gmail.com"));
        userlist.add(new User("xyz","xyz","XYZ@gmail.com"));
    }



    public List<User> getAllUsers()
    {
        System.out.println("Entered service implementation");
        return this.userlist;

    }

    public User getOneUser(String username)
    {
        System.out.println("Entered service implementation");
        System.out.println(this.userlist.toString());
        return this.userlist.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User insertUser(User user)
    {
        userlist.add(user);
        return user;
    }

}
