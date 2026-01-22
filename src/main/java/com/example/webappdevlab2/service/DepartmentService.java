package com.example.webappdevlab2.service;

import com.example.webappdevlab2.domain.Department;
import com.example.webappdevlab2.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository repo;

    public DepartmentService(DepartmentRepository repo){
        this.repo = repo;
    }

    public List<Department> getAllDepartments(){
        return repo.findAll();
    }

    public Department createDepartment(Department department){
        return repo.save(department);
    }

    public Department getDepartmentById(Long id){
        return repo.getReferenceById(id);
    }

    public void deleteDepartment(Long id){
        repo.deleteById(id);
    }
}
