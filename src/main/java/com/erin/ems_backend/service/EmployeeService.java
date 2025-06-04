package com.erin.ems_backend.service;

import com.erin.ems_backend.dto.EmployeeDto;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

}
