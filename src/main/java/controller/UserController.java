package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/enterprise")
@Controller
public class UserController {

@PostMapping("/createUsers")
public String registerUser(){
    return "user registration";
}

@GetMapping("/listUsers")
public String listUsers(){
    return "list users";
}

@GetMapping("/searchUsers/{id}")
public String searchUserById(@PathVariable long id){
    return "search user by id";
}

@PutMapping("/changeUsers/{id}")
public String ChangeUserByID(){
    return "Change user by ID";
}

@DeleteMapping("/deleteUsers/{id}")
public String deleteUserByID(@PathVariable long id){
    return "Delete user by ID";
}


}






