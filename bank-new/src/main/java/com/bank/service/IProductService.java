package com.bank.service;

import java.util.List;
import java.util.Optional;

import com.bank.entity.ProductEntity;

public interface IProductService {
		ProductEntity createProduct(ProductEntity product);
	    Optional<ProductEntity> getProductById(Long id);
	    List<ProductEntity> getAllProducts();
	    ProductEntity updateProduct(Long id, ProductEntity updatedProduct);
	    void deleteProduct(Long id);
}
