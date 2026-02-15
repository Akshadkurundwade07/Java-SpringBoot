package com.example.module22.annotations;


import jakarta.persistence.TableGenerator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = {EmployeeRoleValidator.class})
public @interface EmployeeRoleValidation {
    String message() default "The role of the employee can be User or Admin";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};



}
