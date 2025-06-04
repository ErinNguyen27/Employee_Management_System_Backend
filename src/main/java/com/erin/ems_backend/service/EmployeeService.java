package com.erin.ems_backend.service;

import com.erin.ems_backend.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeid);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);

    void deleteEmployee(Long employeeId);

}
