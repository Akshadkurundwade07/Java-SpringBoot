package com.example.module22.dto;

import com.example.module22.entities.EmployeeEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

public class EmployeeDTO {
        private Long id;
        private String name;
        private String email;
        private Integer age;
        private LocalDate dateofJoining;
        private Boolean isActive;

        public EmployeeDTO(Long id, Boolean isActive, Integer age, String name, String email, LocalDate dateofJoining) {
            this.id = id;
            this.isActive = isActive;
            this.age = age;
            this.name = name;
            this.email = email;
            this.dateofJoining = dateofJoining;
        }

    public EmployeeDTO() {
    }

    public LocalDate getDateofJoining() {
            return dateofJoining;
        }

        public void setDateofJoining(LocalDate dateofJoining) {
            this.dateofJoining = dateofJoining;
        }

        public Boolean getActive() {
            return isActive;
        }

        public void setActive(Boolean active) {
            isActive = active;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
}
