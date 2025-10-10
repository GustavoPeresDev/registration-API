package com.cadastro.api.repository.imp;

import com.cadastro.api.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryImp extends JpaRepository<UserModel,Long> {
}
