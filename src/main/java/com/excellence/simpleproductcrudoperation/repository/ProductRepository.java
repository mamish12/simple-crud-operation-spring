package com.excellence.simpleproductcrudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.simpleproductcrudoperation.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
