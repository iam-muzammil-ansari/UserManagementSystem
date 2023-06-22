package com.example.usermanagementsystem.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer userId;

    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Username is required")
    private String userName;

    @NotEmpty(message = "Address is required")
    private String address;

    @NotEmpty(message = "Phone number is required")
    @Pattern(regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$", message = "Invalid phone number format")
    private String phoneNumber;
}
