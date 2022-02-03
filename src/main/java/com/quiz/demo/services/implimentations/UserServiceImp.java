package com.quiz.demo.services.implimentations;

import com.quiz.demo.Utils.Util;
import com.quiz.demo.models.User;
import com.quiz.demo.repositories.UserRepo;
import com.quiz.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public User addUser(User user) {
        user.setUuid(Util.alphaNumericString(16));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return user;
    }

    @Override
    public User findUserById(long id) {
        return userRepo.findById(id).get();
    }

//    @Override
//    public User findUserByUuid(String Uuid) {
//        return null;
//    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public List<User> findUserByEmailLike(String email) {
        return userRepo.findByEmailLike("%"+email+"%");
    }

    @Override
    public List<User> findUserByRole() {
        return null;
    }

    @Override
    public User updateUser(long id, User newUser) {
        User user = userRepo.findById(id).get();
        user.setEmail(newUser.getEmail());
        user.setPassword(passwordEncoder.encode(newUser.getPassword()));

        userRepo.save(user);
        return user;
    }

    @Override
    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }
}
