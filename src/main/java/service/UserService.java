package service;

import model.UserModel;
import repository.imp.UserRepositoryImp;

import java.util.List;
import java.util.Optional;

public class UserService {

    private UserRepositoryImp userRepositoryImp;

    public List<UserModel> listUsers() {
        return userRepositoryImp.findAll();
    }

    public UserModel searchUserById(Long id) {
        Optional<UserModel> user = userRepositoryImp.findById(id);
        return user.orElse(null);
    }

    public UserModel createUsers(UserModel user) {
        return userRepositoryImp.save(user);
    }

    public void deleteUserByID(long id) {
        userRepositoryImp.deleteById(id);
    }

}
