package com.example.validation.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    Integer userId;
    String userName;

    @NotNull
    LocalDate dateOfBirth;

    @Email (message = "Given email id is invalid")
    String email;

    @Pattern(regexp = "\\d{2}-\\d{10}")
    String phoneNumber;

    @NotNull
    LocalDate date;

    @NotNull
    LocalTime time;

}
