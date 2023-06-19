package com.cjss.manytomany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Benefits")
public class BenefitsModel {
    @Id
    private int benefitId;
    private String benefitName;
    private String description;
}
