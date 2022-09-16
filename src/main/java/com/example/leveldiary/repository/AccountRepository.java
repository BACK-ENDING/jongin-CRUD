package com.example.leveldiary.repository;

import com.example.leveldiary.entity.Account;

import java.util.List;

public interface AccountRepository {
    List<Account> findAll();
}
