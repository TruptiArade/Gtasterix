package com.sts.book.repository;

import com.sts.book.entity.EmployeeEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>
{

}
