package com.example.usermanagementsystem.configuration;

import com.example.usermanagementsystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    List<User> getInitializedList() {
        List<User> initList = new ArrayList<>();

        return  initList;
    }
}
