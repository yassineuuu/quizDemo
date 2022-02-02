package com.quiz.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends User {
    private String clientId;
    private String firstName;
    private String lastName;
    private long phone;


    public Client(String email, String password) {
        super(email, password);
    }
}
