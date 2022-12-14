package com.example.leveldiary.controller;

import com.example.leveldiary.entity.Account;
import com.example.leveldiary.service.JdbcService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final JdbcService jdbcService;

    @GetMapping("/read")
    public List<Account> findAll(){
        return jdbcService.findAll();
    }

    @DeleteMapping("/delete")
    public int deleteById(@RequestParam("id") Long id){
        return jdbcService.deleteById(id);
    }

    @PutMapping("/update")
    public int update(@RequestParam("id") Long id, @RequestParam("email") String email){
        return jdbcService.update(id,email);
    }

    @PostMapping("/save")
    public long save(@RequestParam("email") String email){
        return jdbcService.save(email);
    }
}
