package com.quiz.demo.repositories;

import com.quiz.demo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByEmail(String email);

    List<User> findByEmailLike(String email);
}
