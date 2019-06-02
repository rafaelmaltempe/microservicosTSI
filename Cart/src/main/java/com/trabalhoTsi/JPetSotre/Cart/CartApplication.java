package com.trabalhoTsi.JPetSotre.Cart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.trabalhoTsi.JPetSotre.Cart.mapper")
public class CartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}

}

