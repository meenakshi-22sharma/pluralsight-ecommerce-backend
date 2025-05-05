package com.pluralsight.ecommerce.service;

import com.pluralsight.ecommerce.dto.ProductDto;
import com.pluralsight.ecommerce.model.Category;
import com.pluralsight.ecommerce.model.Product;
import com.pluralsight.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(ProductDto productDto, Category category){
        Product product = new Product();
        product.setCategory(category);
        product.setDescription(productDto.getDescription());
        product.setImageUrl(productDto.getImageURL());
        product.setPrice(productDto.getPrice());
        product.setName(productDto.getName());

        productRepository.save(product);
    }

    public List<ProductDto> listProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();

        for(Product product : products) {
            productDtos.add(new ProductDto(product));
        }
        return productDtos;
    }

    public void updateProduct(Integer productID, ProductDto productDto, Category category) {
        Product product = new Product();
        product.setCategory(category);
        product.setDescription(productDto.getDescription());
        product.setImageUrl(productDto.getImageURL());
        product.setPrice(productDto.getPrice());
        product.setName(productDto.getName());

        product.setId(productID);
        productRepository.save(product);
    }
}
