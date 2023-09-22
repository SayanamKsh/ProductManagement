package com.ey.productManagement.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.productManagement.Repo.ProductRepo;
import com.ey.productManagement.entity.Product;


@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	public Product getProductDetails(Long id) {
		return productRepo.findById(id).get();
	}

	public List<Product> insertProductDetails(List<Product> products) {
		products.forEach(product->product.setDiscountedPrice((long)Math.round(product.getActualPrice()-((product.getActualPrice()*product.getDiscountPercent())/100))));
		return productRepo.saveAll(products);
	}

	public List<Product> getAllProductsIn(Set<Long> productIds) {
		return productRepo.findByIdIn(productIds);
	}

}

