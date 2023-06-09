package com.springboot.service;

import com.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    public void saveProduct(Product product);

    public List<Product> getProducts();
}
