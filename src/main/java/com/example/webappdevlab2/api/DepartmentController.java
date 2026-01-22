package com.example.webappdevlab2.api;

import com.example.webappdevlab2.domain.Department;
import com.example.webappdevlab2.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService service;

    public DepartmentController(DepartmentService service){
        this.service=service;
    }

    @GetMapping
    public List<Department> getAllDepartments(){
        return service.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartment(Long id){
        return service.getDepartmentById(id);
    }


    @PostMapping
    public Department createDepartment(@RequestBody Department department){
        return service.createDepartment(department);
    }

    @DeleteMapping
    public void deleteDepartment(Long id){
         service.deleteDepartment(id);
    }
}
