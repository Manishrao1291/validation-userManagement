package com.example.validation.configuration;

import com.example.validation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {


    @Bean
    public List<User> getList(){
        User user = new User(1,"Manish", LocalDate.of(1999,12,12),"manish@gmail.com","91-9876543210",LocalDate.now(), LocalTime.now());
        List<User> userList = new ArrayList<>();
        userList.add(user);
        return userList;
    }


}
