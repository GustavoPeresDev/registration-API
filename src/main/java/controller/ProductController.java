package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/enterprise")
@Controller
public class ProductController {

@PostMapping("/createProduct")
public String registerProduct() {
    return "product registration";
}

@GetMapping("/listProduct")
public String listProduct() {
    return "list Product";
}

@GetMapping("/searchProduct/{id}")
public String searchProductById(@PathVariable long id) {
    return "search Product by id";
}

@PutMapping("/changeProduct/{id}")
public String ChangeProductByID(){
    return "Change Product by ID";
}

@DeleteMapping("/deleteProduct/{id}")
public String deleteProductByID(@PathVariable long id){
    return "Delete Product by ID";
}

}
