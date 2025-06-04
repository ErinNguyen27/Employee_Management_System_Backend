package com.erin.ems_backend.service.impl;

import com.erin.ems_backend.dto.EmployeeDto;
import com.erin.ems_backend.entity.Employee;
import com.erin.ems_backend.exception.ResourceNotFoundException;
import com.erin.ems_backend.mapper.EmployeeMapper;
import com.erin.ems_backend.repository.EmployeeRepository;
import com.erin.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Employee savedEmployee = employeeRepository.save(employee);


        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee is not exist with given Id: " + employeeId));

        return EmployeeMapper.mapToEmployeeDto(employee);
    }

}
