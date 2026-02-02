package com.example.module22.controllers;

import com.example.module22.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import javax.management.modelmbean.RequiredModelMBean;
import java.nio.file.Path;
import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: sdkgkwj@3552&*^";
//    }

    @GetMapping(path= "/{employeeId}")
    public EmployeeDTO employeeID(@PathVariable(name = "employeeId") Long id ){  //or public EmployeeDTO employeeID(@PathVariable Long employeeId)
        return new EmployeeDTO(id, true,20,"Akshad","akshad@gmail.com",LocalDate.of(2027,06,1));
    }

//    OR
//    @GetMapping(path= "/employees/{employeeId}")
//    public EmployeeDTO employeeID(@PathVariable Long employeeId){
//        return new EmployeeDTO(employeeId, true,20,"Akshad","akshad@gmail.com",LocalDate.of(2027,06,1));
//    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false)Integer age,
                                  @RequestParam(required = false)String sortby) {
        return ("hi my age is" + age + sortby);
    }

    @PostMapping
    public String createnewEmployee() {
        return "hello from Post";
    }
}


