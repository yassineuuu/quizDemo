package com.quiz.demo.models;

import com.quiz.demo.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Uuid;
    private String email;
    private String password;







//    +++++++++++++++++ Constructors ++++++++++++++++++++++++

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


//    +++++++++++++++ Gettters & Setters +++++++++++++++++++++

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return Uuid;
    }

    public void setUuid(String uuid) {
        Uuid = uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
