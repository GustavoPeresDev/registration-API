package com.cadastro.api.repository.imp;


import com.cadastro.api.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryImp extends JpaRepository <EmployeeModel,Long> {
}
