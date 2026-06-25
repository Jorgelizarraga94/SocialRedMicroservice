package com.socials.Users.controller;

import com.socials.Users.dto.UserDTO;
import com.socials.Users.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/posts/{userId}")
    public UserDTO getUserAndPosts(@PathVariable Long userId){
        UserDTO users = userService.getUserAndPosts(userId);
        return users;
    }
}
