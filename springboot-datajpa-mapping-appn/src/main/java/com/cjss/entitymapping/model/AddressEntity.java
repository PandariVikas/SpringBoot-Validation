package com.cjss.entitymapping.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private int addressId;
    @NonNull
    private String cityName;
    @NotBlank(message = "country name should not be empty or blank")
    private String countryName;
    @OneToOne(mappedBy = "address")
    private EmployeeEntity employees;
}
