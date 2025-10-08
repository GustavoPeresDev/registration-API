package controller;

import model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

@PostMapping("/createusers")
public UserModel createUsers(@RequestBody UserModel userModel) {
    return userService.createUsers(userModel);
}


@GetMapping("/listusers")
public List<UserModel> listUsers(){
    return userService.listUsers();
}

@GetMapping("/searchusers/{id}")
public UserModel searchUsersById(@PathVariable Long id) {
    return userService.searchUserById(id);
}

@PutMapping("/changeusers/{id}")
public String changeUserByID(){
    return "Change user by ID";
}

@DeleteMapping("/deleteusers/{id}")
public void deleteUsersById(@PathVariable Long id){
    userService.deleteUserByID(id);
}


}






