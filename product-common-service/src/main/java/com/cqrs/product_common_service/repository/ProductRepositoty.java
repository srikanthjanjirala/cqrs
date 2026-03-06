package com.cqrs.product_common_service.repository;

import com.cqrs.product_common_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoty extends JpaRepository<Product, Long> {
}
