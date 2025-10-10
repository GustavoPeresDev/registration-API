package com.cadastro.api.repository.imp;

import com.cadastro.api.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryImp extends JpaRepository <ProductModel,Long> {
}
