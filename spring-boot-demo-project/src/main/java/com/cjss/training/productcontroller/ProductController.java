package com.cjss.training.productcontroller;

import com.cjss.training.model.ProductModel;
import com.cjss.training.productservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("add-product")
    public List<ProductModel> addProducts(@RequestBody ProductModel product){
        return service.addProduct(product);
    }
    @GetMapping("/getAllProducts")
    private List<ProductModel> getAll() {
        return service.getAll();
    }
    @GetMapping("/getProduct/{id}")
    private List<ProductModel> getProduct(@PathVariable int id) {
        return service.getById(id);
    }
    @DeleteMapping("/deleteProduct/{id}")
    List<ProductModel> delete(@PathVariable int id) {
        return service.deleteById(id);
    }
}
