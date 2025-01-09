package com.sts.book.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Data
public class EmployeeDTO
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String empName;
    private String empAddress;
    private String designation;
    private Double salary;
    private String email;
    private String mobile;

}
