package com.ey.productManagement.contrller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ey.productManagement.entity.Product;
import com.ey.productManagement.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts() {
		return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	@PostMapping("/getAllProductsIn")
	public ResponseEntity<List<Product>> getAllProductsIn(@RequestBody Set<Long> productIds) {
		return new ResponseEntity<List<Product>>(productService.getAllProductsIn(productIds), HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllProducts/{id}")
	public ResponseEntity<Product> getProductDetails(@PathVariable("id") Long id) {
		return new ResponseEntity<Product>(productService.getProductDetails(id) , HttpStatus.OK);
	}
	
	@PostMapping("/insertProductDetails")
	public ResponseEntity<List<Product>> insertProductDetails(@RequestBody List<Product> products) {
		return new ResponseEntity<List<Product>>(productService.insertProductDetails(products), HttpStatus.CREATED);
	}
}
