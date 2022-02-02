package com.quiz.demo.services;

import com.quiz.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User addUser(User user);

    List<User> findAllUsers();

    List<User> findUserByEmailLike(String email);

    List<User> findUserByRole();

    User updateUser(long id, User user);

    void deleteUser(long id);


}
