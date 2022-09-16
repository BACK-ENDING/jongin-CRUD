package com.example.leveldiary.service;

import com.example.leveldiary.entity.Account;
import com.example.leveldiary.repository.Impl.JdbcAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JdbcService {
    private final JdbcAccountRepository jdbcAccountRepository;

    public List<Account> findAll() {
        return jdbcAccountRepository.findAll();
    }

    public int deleteById(Long id){
        return jdbcAccountRepository.deleteById(id);
    }

}
