package com.example.leveldiary.repository;

import com.example.leveldiary.entity.Account;

import java.util.List;

public interface AccountRepository {
    int update(Account account);

    int deleteById(Long id);

    List<Account> findAll();

}
