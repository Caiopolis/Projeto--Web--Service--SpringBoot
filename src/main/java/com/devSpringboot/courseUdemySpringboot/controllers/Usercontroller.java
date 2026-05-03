package com.devSpringboot.courseUdemySpringboot.controllers;

import com.devSpringboot.courseUdemySpringboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class Usercontroller {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria","maria@gmail.com","11978766766","1234567");
        return ResponseEntity.ok().body(u);
    }

}
