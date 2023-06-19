package com.cjss.training.productservice;

import com.cjss.training.model.ProductModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private List<ProductModel>  productModels =new ArrayList<>();
    public List<ProductModel> addProduct(ProductModel product) {
        ProductModel products= new ProductModel();
        products.setPid(product.getPid());
        products.setPname(product.getPname());
        productModels.add(products);
        return  productModels;
    }

    public List<ProductModel> getById(int pid) {
        return productModels
                .stream()
                .filter( product -> product.getPid()==(pid))
                .collect(Collectors.toList());
    }

    public List<ProductModel> getAll() {
        return productModels;
    }


    public List<ProductModel> deleteById(int pid) {
        Optional<ProductModel> productModelToBeDeleted = productModels
                .stream()
                .filter(product -> product.getPid()==(pid))
                .findFirst();

        productModelToBeDeleted.ifPresent(productModel -> productModels.remove(productModel));
        return productModels;
    }

}
