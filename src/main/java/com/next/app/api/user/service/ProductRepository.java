package com.next.app.api.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.next.app.api.user.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}