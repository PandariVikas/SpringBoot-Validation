package com.cjss.manytomany.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Employee")
public class EmployeeModel {
    @Id
    private int employeeId;
    private String employeeName;
    private double salary;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_benefitId", referencedColumnName = "employeeId")
    List<BenefitsModel> benefits;
}
