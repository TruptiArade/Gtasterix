package com.sts.book.service;

import com.sts.book.dto.EmployeeDTO;
import java.util.List;

public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    List<EmployeeDTO> fetchEmployeeList();
    EmployeeDTO fetchEmployeeById(Long empId);
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO, Long empId);
    EmployeeDTO updatepatchEmployee(EmployeeDTO employeeDTO, Long empId);
    void deleteEmployeeById(Long empId);
}
