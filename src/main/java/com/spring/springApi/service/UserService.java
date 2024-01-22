package com.spring.springApi.service;

import com.spring.springApi.api.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User(1, "Nandini", 26, "nandini@gmail.com");
        User user2 = new User(2, "Yameen", 26, "yameen@gmail.com");
        User user3 = new User(3, "Sahil", 26, "mohdsahil@gmail.com");
        User user4 = new User(3, "Danish", 29, "danish@gmail.com");
        User user5 = new User(4, "Atif", 29, "atif@gmail.com");
        User user6 = new User(5, "Shavez", 28, "shavez@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5, user6));
    }

    public Optional<User> getUser(Integer id){

        Optional optional = Optional.empty();

        for(User user:userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
