package com.example.leveldiary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Account {
    private long id;
    private String email;
    public Account(String email) {
        this.email = email;
    }
}
