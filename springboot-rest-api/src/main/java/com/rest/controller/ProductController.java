package com.rest.controller;

import com.rest.entity.ProductEntity;
import com.rest.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/saveproduct")
    public ProductEntity addProduct(@Valid  @RequestBody ProductEntity productEntity){
        return productService.saveProduct(productEntity);
    }

    @GetMapping("/getProduct/{id}")
    public ProductEntity getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @GetMapping("/getAllProduct")
    public List<ProductEntity> getAll(){
        return productService.getAllProducts();
    }
//    @DeleteMapping("/deleteProduct/{id}")
//    public void deleteProductById(@PathVariable Integer id){
//        productService.deleteProductById(id);
//    }
    @GetMapping("/findByNameAndCost/{name}/{costList}")
    public List<ProductEntity> findProductByNameAndCost(@PathVariable String name, @PathVariable List<Double> costList){
        return productService.getProductByNameAndCost(name,costList);
    }
    @PatchMapping("/updateCost/{cost1}/{costList}")
    public int updateProductCost(@PathVariable Double cost1, @PathVariable List<Double> costList){
        return productService.updateProductCost(cost1, costList);
    }

}