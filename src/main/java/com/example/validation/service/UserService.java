package com.example.validation.service;

import com.example.validation.model.User;
import com.example.validation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;


    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    public String addUsers(List<User> users) {
        List<User> userList = userRepo.getAllUsers();
        userList.addAll(users);
        return "Users added successfully";
    }

    public String deleteUserById(Integer id) {
        List<User> userList = userRepo.getAllUsers();
        for(User user:userList){
            if(user.getUserId().equals(id)){
                userList.remove(user);
                return "User removed successfully";
            }
        }
        return "Unable to update user check terminal";
    }
}
