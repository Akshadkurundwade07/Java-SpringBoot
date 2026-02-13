package com.example.module22.repositories;

import com.example.module22.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


//all the CRUD operation we will be using from the JpaRepository so we extended an interface so the we could use it in a class (eg. findById, etc)
//List<EmployeeEntity> findByName(String name);
}
