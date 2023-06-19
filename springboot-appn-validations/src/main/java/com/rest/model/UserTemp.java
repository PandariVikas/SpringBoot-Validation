package com.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Getter
@Setter
public class UserTemp {

    @NotEmpty(message = "name should not be empty or null")
    @Size(min=3)
    private String name;
    @Email(message = "email should be a proper format")
    private String email;
   @NotNull
   @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered")
    private String mobileNo;
    @Min(value = 18, message = "age must be greater than 18")
    @Max(value = 70 , message = "age must be less than 70")
    private int age;
    private String gender;
    @NotBlank(message = "give proper location")
    private String location;
}
