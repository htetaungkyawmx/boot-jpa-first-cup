package com.example.bootjpafirstcup.service;

import com.example.bootjpafirstcup.dao.EmployeeDao;
import com.example.bootjpafirstcup.entity.Employee;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public Employee findEmployeeById(int id){
        return employeeDao.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public Employee saveEmployee(Employee e) {
        return employeeDao.save(e);
    }

    public List<Employee> findAllEmployee(){
        return employeeDao.findAll();
    }
}
