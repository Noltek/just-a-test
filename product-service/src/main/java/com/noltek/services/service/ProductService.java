package com.noltek.services.service;

import com.noltek.services.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProduct(String id);
    Product addProduct(Product product);
}
