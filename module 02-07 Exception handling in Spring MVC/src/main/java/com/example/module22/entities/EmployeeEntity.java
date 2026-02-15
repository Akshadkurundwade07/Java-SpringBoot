package com.example.module22.entities;

import com.example.module22.dto.EmployeeDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Required field in Employee: name")
    private String name;

    private String email;

    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private Boolean isActive;
    private String role;
    private Double salary;
}
