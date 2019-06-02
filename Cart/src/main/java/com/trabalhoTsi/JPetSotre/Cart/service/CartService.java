package com.trabalhoTsi.JPetSotre.Cart.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.trabalhoTsi.JPetSotre.Account.mapper")
public class CartService {

    public static void main(String[] args) {
        SpringApplication.run(CartService.class, args);
    }

}