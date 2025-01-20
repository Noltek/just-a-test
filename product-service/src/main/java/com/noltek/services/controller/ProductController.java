package com.noltek.services.controller;

import com.noltek.services.model.Product;
import com.noltek.services.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") String id) {
        return productService.getProduct(id);
    }
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    @PostMapping("/{id}/uploadImage")
    public Product uploadImage(@PathVariable("id") String id, @RequestParam("file") MultipartFile file) throws IOException {
        Product product = productService.getProduct(id);
        product.setImage(file.getBytes());
        return productService.addProduct(product);
    }
}
