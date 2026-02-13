package com.example.module22.controllers;

import com.example.module22.dto.EmployeeDTO;
import com.example.module22.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeservice) {

        this.employeeService = employeeservice;
    }


    @GetMapping(path= "/{employeeId}")
    public EmployeeDTO getemployeeID(@PathVariable(name = "employeeId") Long id ){  //or public EmployeeDTO employeeID(@PathVariable Long employeeId)
        return employeeService.getEmployeeById(id);
    }
//    in order to handle the null values orElse(null) is written or you can replace public EmployeeEntity with Optional<EmployeeEntity>

//    OR
//    @GetMapping(path= "/employees/{employeeId}")
//    public EmployeeDTO employeeID(@PathVariable Long employeeId){
//        return new EmployeeDTO(employeeId, true,20,"Akshad","akshad@gmail.com",LocalDate.of(2027,06,1));
//    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false,name= "inputAge")Integer age,
                                                @RequestParam(required = false)String sortBy) {
        return employeeService.getAllEmployees();
    }


    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee) {
        return employeeService.createNewEmployee(inputEmployee);
    }
}


