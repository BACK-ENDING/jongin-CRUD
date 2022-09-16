package com.example.leveldiary.repository;

import com.example.leveldiary.entity.Account;

import java.util.List;

public interface AccountRepository {

    long save(Account account);

    int update(Account account);

    int deleteById(Long id);

    List<Account> findAll();

}
