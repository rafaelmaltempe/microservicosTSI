package com.trabalhoTsi.JPetSotre.Account.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.trabalhoTsi.JPetSotre.Account.mapper")
public class AccountService {

    public static void main(String[] args) {
        SpringApplication.run(AccountService.class, args);
    }

}
