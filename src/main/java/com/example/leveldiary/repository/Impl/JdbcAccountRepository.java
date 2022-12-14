package com.example.leveldiary.repository.Impl;

import com.example.leveldiary.entity.Account;
import com.example.leveldiary.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class JdbcAccountRepository implements AccountRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public long save(Account account) {
        return jdbcTemplate.update("insert into accounts(email) values(?)", account.getEmail());
    }

    @Override
    public int update(Account account) {
    		return jdbcTemplate.update("update accounts set email = ? where id = ?",
    				account.getEmail(),
    				account.getId());
    	}

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("delete accounts where id = ?", id);
    }


    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query("select * from accounts",
                        (rs, rowNum) -> new Account(
                                    rs.getLong("id"),
                                    rs.getString("email")
                                )
                        );
    }

}
