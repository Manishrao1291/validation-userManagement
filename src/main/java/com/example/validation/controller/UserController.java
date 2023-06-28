package com.example.validation.controller;

import com.example.validation.model.User;
import com.example.validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    // to get all of  the users
    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    // add list of users
    @PostMapping("users")
    public String addUsers(@RequestBody @Valid List<User> users){
        return userService.addUsers(users);
    }

    // delete user by id
    @DeleteMapping("users/{id}")
    public String deleteUserById(@PathVariable Integer id){
        return userService.deleteUserById(id);
    }


}
