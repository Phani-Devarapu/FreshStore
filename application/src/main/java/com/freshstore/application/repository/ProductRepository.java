package com.freshstore.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshstore.application.model.Product;



public interface ProductRepository extends JpaRepository<Product,Long> {

}
