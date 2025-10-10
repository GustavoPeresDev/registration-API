package com.cadastro.api.controller;

import com.cadastro.api.model.ProductModel;
import com.cadastro.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("v1/product")
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

@PostMapping("/createproduct")
public ProductModel createProduct(@RequestBody ProductModel productModel) {
    return productService.createProduct(productModel);
}

@GetMapping("/listproduct")
public List<ProductModel> listProduct() {
    return productService.listProduct();
}

@GetMapping("/searchproduct/{id}")
public ProductModel searchProductById(@PathVariable Long id) {
    return productService.searchProductById(id);
}

@PutMapping("/changeproduct/{id}")
public String ChangeProductByID(){
    return "Change Product by ID";
}

@DeleteMapping("/deleteproduct/{id}")
public void deleteProductById(@PathVariable Long id){
    productService.deleteProductByID(id);
}

}
