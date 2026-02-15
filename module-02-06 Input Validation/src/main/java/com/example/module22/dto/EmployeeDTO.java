package com.example.module22.dto;

import com.example.module22.annotations.EmployeeRoleValidation;
import com.example.module22.entities.EmployeeEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
        private Long id;
//      @NotNull(message = "Required field in Employee: name")

        @NotEmpty(message = "Name is required!!")
        @Size(min =3, max=10)
        private String name;

        @NotBlank(message = "the email cannot be blank")
        @Email(message= " email should be valid")
        private String email;

        @Positive(message = "the age must be positive")
        @NotNull(message = "the age cannot be blank")
        @Min(message = "age cannot be <18", value =18)
        @Max(message="max age cannot be > 80",value=80)
        private Integer age;

        @NotBlank(message = "the role cannot be blank")
//        @Pattern(regexp = "^(ADMIN|USER)$",message = "the role of employee can be user or admin")
        @EmployeeRoleValidation
        private String role;

        @PastOrPresent(message = "the date cannot be in future")
        private LocalDate dateofJoining;

        @AssertTrue(message = "employee should be active")
        @JsonProperty("isActive")
        private Boolean isActive;

        @Positive(message = "Salary should be positive")
        @NotNull(message ="salary cannot be zero")
        @Digits(integer = 6, fraction = 2,message="the salary can be in the for employee can be xxxxxx.yy")
        private Double salary;
}
