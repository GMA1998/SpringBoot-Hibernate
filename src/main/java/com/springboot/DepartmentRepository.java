package com.springboot;


import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

//Annotation
@Repository

//Interface
public interface DepartmentRepository
	extends JpaRepository<Department, Long> {
}
