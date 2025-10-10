package com.cadastro.api.controller;

import com.cadastro.api.model.UserModel;
import com.cadastro.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RequestMapping("v1/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

@PostMapping("v1/createuser")
public UserModel createUsers(@RequestBody UserModel userModel) {
    return userService.createUsers(userModel);
}


@GetMapping("/listusers")
public List<UserModel> listUsers(){
    return userService.listUsers();
}

@GetMapping("/searchuser/{id}")
public UserModel searchUsersById(@PathVariable Long id) {
    return userService.searchUserById(id);
}

@PutMapping("/changeuser/{id}")
public UserModel changeUsersById(@PathVariable Long id, @RequestBody UserModel userModel) {
    return userService.changeUser(id, userModel);
}

@DeleteMapping("/deleteuser/{id}")
public void deleteUsersById(@PathVariable Long id){
    userService.deleteUserByID(id);
}


}






