package com.example.module22.services;

import com.example.module22.dto.EmployeeDTO;
import com.example.module22.entities.EmployeeEntity;
import com.example.module22.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(Long id) {
       EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
       return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees(){
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeEntities
                .stream()
                .map(employeeEntity-> modelMapper.map(employeeEntity, EmployeeDTO.class))
                .collect(Collectors.toList());

    }


    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee) {
        EmployeeEntity toSaveEntity = modelMapper.map(inputEmployee, EmployeeEntity.class);
        EmployeeEntity saverEmployeeEntity =  employeeRepository.save(toSaveEntity);
        return modelMapper.map(saverEmployeeEntity,EmployeeDTO.class);
    }
}
