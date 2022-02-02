package com.quiz.demo.services.implimentations;

import com.quiz.demo.Utils.Util;
import com.quiz.demo.models.User;
import com.quiz.demo.repositories.UserRepo;
import com.quiz.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public User addUser(User user) {
        user.setUuid(Util.alphaNumericString(16));
        userRepo.save(user);
        return user;
    }

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
        user.setPassword(newUser.getPassword());

        userRepo.save(user);
        return user;
    }

    @Override
    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }
}
