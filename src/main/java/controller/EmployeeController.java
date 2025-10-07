package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/enterprise")
@Controller
public class EmployeeController {

@PostMapping("/createEmployee")
public String registerEmployee() {
    return "Employee registration";
}

@GetMapping("/listEmployee")
public String listEmployee() {
    return "list Employee";
}

@GetMapping("/searchEmployee/{id}")
public String searchEmployeeById(@PathVariable long id) {
    return "search Employee by id";
}

@PutMapping("/changeEmployee/{id}")
public String ChangeEmployeeByID(){
    return "Change Employee by ID";
}

@DeleteMapping("/deleteEmployee/{id}")
public String deleteEmployeeByID(@PathVariable long id){
    return "Delete Employee by ID";
}

}
