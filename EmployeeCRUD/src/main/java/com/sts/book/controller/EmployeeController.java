package com.sts.book.controller;

import com.sts.book.dto.EmployeeDTO;
import com.sts.book.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        return employeeService.saveEmployee(employeeDTO);
    }

    @GetMapping
    public List<EmployeeDTO> fetchEmployeeList()
    {
        return employeeService.fetchEmployeeList();
    }

    @GetMapping("/{id}")
    public EmployeeDTO fetchEmployeeById(@PathVariable("id") Long empId)
    {
        return employeeService.fetchEmployeeById(empId);
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO, @PathVariable("id") Long empId)
    {
        return employeeService.updateEmployee(employeeDTO, empId);
    }

    @PatchMapping("/{id}")
    public EmployeeDTO updatepatchEmployee(@RequestBody EmployeeDTO employeeDTO, @PathVariable("id") Long empId)
    {
        return employeeService.updatepatchEmployee(employeeDTO, empId);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long empId)
    {
        employeeService.deleteEmployeeById(empId);
        return "Deleted Successfully";
    }
}
