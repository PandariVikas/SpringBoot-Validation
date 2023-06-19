package com.cjss.manytomany.repository;

import com.cjss.manytomany.model.BenefitsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitsRepository extends JpaRepository<BenefitsModel, Integer> {
}
