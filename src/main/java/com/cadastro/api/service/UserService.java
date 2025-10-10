package com.cadastro.api.service;

import com.cadastro.api.model.UserModel;
import com.cadastro.api.repository.imp.UserRepositoryImp;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepositoryImp userRepositoryImp;

    public List<UserModel> listUsers() {
        return userRepositoryImp.findAll();
    }

    public UserModel searchUserById(Long id) {
        Optional<UserModel> user = userRepositoryImp.findById(id);
        return user.orElse(null);
    }

    public UserModel changeUser(long id,UserModel userModel) {
        if(userRepositoryImp.existsById(id)){
            userModel.setId(id);
            return userRepositoryImp.save(userModel);
        }
        return null;
    }

    public UserModel createUsers(UserModel user) {
        return userRepositoryImp.save(user);
    }

    public void deleteUserByID(long id) {
        userRepositoryImp.deleteById(id);
    }

}
