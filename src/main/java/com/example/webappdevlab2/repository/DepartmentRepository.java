package com.example.webappdevlab2.repository;

import com.example.webappdevlab2.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
