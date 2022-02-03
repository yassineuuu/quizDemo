package com.quiz.demo.security;

import com.quiz.demo.models.User;
import com.quiz.demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepo utilisateurRepo;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = utilisateurRepo.findByEmail(email);

        if (user != null)
            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
        else
            throw new UsernameNotFoundException("User not found with email : " + email);
    }
}
