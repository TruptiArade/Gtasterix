package com.sts.book.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
// Class
public class EmployeeEntity {

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

