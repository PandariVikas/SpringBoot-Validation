package com.rest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Getter
@Setter
@Entity
@Table(name="user_tab1")
public class User {
    @Id
    @SequenceGenerator(name="mysequence", initialValue = 1000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequence")
//    @GeneratedValue(generator = "uuid")
    private int id;
    private String name;

    private String email;

    private String mobileNo;

    private int age;

    private String gender;

    private String location;


}
