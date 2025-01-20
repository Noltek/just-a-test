package com.noltek.services.service.impl;

import com.noltek.services.model.Product;
import com.noltek.services.repository.ProductRepository;
import com.noltek.services.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
        System.out.println(product.getName());
        return product;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
