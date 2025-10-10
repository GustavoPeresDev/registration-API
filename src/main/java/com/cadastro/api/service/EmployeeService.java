package com.cadastro.api.service;

import com.cadastro.api.model.EmployeeModel;
import com.cadastro.api.repository.imp.EmployeeRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepositoryImp employeeRepositoryImp;

    public EmployeeService(EmployeeRepositoryImp employeeRepositoryImp) {
        this.employeeRepositoryImp = employeeRepositoryImp;
    }

    public List<EmployeeModel> listemployee() {
        return employeeRepositoryImp.findAll();
    }

    public EmployeeModel searchEmployeeById(Long id) {
        Optional<EmployeeModel> employee = employeeRepositoryImp.findById(id);
        return employee.orElse(null);
    }

    public EmployeeModel createEmployee(EmployeeModel user) {
        return employeeRepositoryImp.save(user);
    }

    public void deleteEmployeeByID(long id) {
        employeeRepositoryImp.deleteById(id);
    }


}
