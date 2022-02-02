package com.quiz.demo.controllers;

import com.quiz.demo.Utils.Util;
import com.quiz.demo.models.User;
import com.quiz.demo.repositories.UserRepo;
import com.quiz.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        userService.addUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);

    }

    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }


    @GetMapping("/userEmail")
    public ResponseEntity<List<User>> getUsersByEmail(@RequestParam String email){
        List<User> users = userService.findUserByEmailLike(email);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }


    @PutMapping("/updateUser")
    public ResponseEntity<User> getUsersByEmail(@RequestParam long id, @RequestBody User newUser){
        User user = userService.updateUser(id, newUser);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }



    @DeleteMapping("/deleteUser")
    public ResponseEntity<Void> deleteUserById(@RequestParam long id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
