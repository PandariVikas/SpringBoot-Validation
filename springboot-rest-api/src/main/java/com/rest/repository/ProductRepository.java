package com.rest.repository;

import com.rest.entity.ProductEntity;
import jakarta.transaction.Transactional;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    @Query("select p From ProductEntity p")
    List<ProductEntity> findAllProductQuery();

    @Query("select p from ProductEntity p where p.cost>=2000")
    List<ProductEntity> findAllByCostQuery();

    @Query("select p From ProductEntity p where p.name= :name AND p.cost in :costList")
    List<ProductEntity> findProductByNameAndCost(@Param("name") String name,
                                                 @Param("costList") List<Double> costList);
    @Transactional
    @Modifying
    @Query("update ProductEntity p set p.cost=?1 where p.cost in ?2")
    int updateProductCost(Double cost1, List<Double> costList, Sort sort);


}
