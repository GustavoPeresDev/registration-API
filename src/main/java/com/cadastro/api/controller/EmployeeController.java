package com.cadastro.api.controller;

import com.cadastro.api.model.EmployeeModel;
import com.cadastro.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("v1/employee")
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


@PostMapping("/createemployee")
public EmployeeModel createEmployee(@RequestBody EmployeeModel employeeModel) {
    return employeeService.createEmployee(employeeModel);
}

@GetMapping("/listemployee")
public List<EmployeeModel> listEmployee(){
    return employeeService.listemployee();
}

@GetMapping("/searchemployee/{id}")
public EmployeeModel searchEmployeeById(@PathVariable Long id) {
    return employeeService.searchEmployeeById(id);
}

@PutMapping("/changeemployee/{id}")
public String ChangeEmployeeByID(){
    return "Change Employee by ID";
}

@DeleteMapping("/deleteemployee/{id}")
public void deleteEmployeeById(@PathVariable Long id) {
    employeeService.deleteEmployeeByID(id);
}

}
