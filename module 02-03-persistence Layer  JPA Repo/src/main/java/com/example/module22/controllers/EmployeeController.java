package com.example.module22.controllers;

import com.example.module22.dto.EmployeeDTO;
import com.example.module22.entities.EmployeeEntity;
import com.example.module22.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: sdkgkwj@3552&*^";
//    }
        @GetMapping("/employees/{employeeId}")
        public EmployeeEntity getEmployeeById(@PathVariable Long employeeId) {
            return employeeRepository.findById(employeeId).orElse(null);
        }


//    OR
//    @GetMapping(path= "/employees/{employeeId}")
//    public EmployeeDTO employeeID(@PathVariable Long employeeId){
//        return new EmployeeDTO(employeeId, true,20,"Akshad","akshad@gmail.com",LocalDate.of(2027,06,1));
//    }

        @GetMapping
        public String getAllEmployees(@RequestParam(required = false, name = "inputAge")Integer age,
                                  @RequestParam(required = false)String sortby) {
        return ("hi my age is" + age + sortby);
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee) {
            inputEmployee.setId(100L);
            return inputEmployee;
    }

    @PutMapping String updateEmployeeById() {
            return "Hello from Put";
    }
}


