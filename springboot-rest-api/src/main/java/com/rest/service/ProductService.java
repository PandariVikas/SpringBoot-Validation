package com.rest.service;

import com.rest.entity.ProductEntity;
import com.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public ProductEntity saveProduct(ProductEntity productEntity){
        return productRepository.save(productEntity);
    }


    public ProductEntity getProductById(Integer id) {
//        ProductEntity productEntity = productRepository .findById(id).get();
//        return productEntity;
           Optional<ProductEntity> productEntityDetails= productRepository.findById(id);
           if(productEntityDetails.isPresent()){
               ProductEntity productEntity = new ProductEntity();
               ProductEntity product=productEntityDetails.get();
               productEntity.setPid(productEntityDetails.get().getPid());
               productEntity.setName(productEntityDetails.get().getName());
               return productEntity;
           }
           return null;
    }
//    public List<ProductEntity> getAllProducts() {
//        List<ProductEntity> productEntity = productRepository.findAll();
//       return productEntity.stream().map(product-> {
//           ProductEntity products = new ProductEntity();
//           products.setPid(product.getPid());
//           products.setName(product.getName());
//           products.setCost(product.getCost());
//           return products;
//       }).collect(Collectors.toList());
//    }
//
//    public void deleteProductById(Integer id) {
//        productRepository.deleteById(id);
//    }

    public List<ProductEntity> getAllProducts(){
        List<ProductEntity> productEntities= productRepository.findAllByCostQuery();
        return  productEntities;
    }

    public List<ProductEntity> getProductByNameAndCost(String name, List<Double> costList) {
        return productRepository.findProductByNameAndCost(name, costList);
    }

    public int updateProductCost(Double cost1, List<Double> costLists) {
       return productRepository.updateProductCost(cost1, costLists, Sort.by("name"));
    }
}