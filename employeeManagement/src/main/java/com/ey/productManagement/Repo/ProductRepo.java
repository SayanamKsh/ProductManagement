package com.ey.productManagement.Repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ey.productManagement.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

	List<Product> findByIdIn(Set<Long> productIds);




}
