//package service;
//
//import model.ProductModel;
//import repository.imp.ProductRepositoryImp;
//
//import java.util.List;
//import java.util.Optional;
//
//public class ProductService {
//
//    private ProductRepositoryImp productRepositoryImp;
//
//    public ProductService(ProductRepositoryImp productRepositoryImp) {
//        this.productRepositoryImp = productRepositoryImp;
//    }
//
//    public List<ProductModel> listProduct() {
//        return productRepositoryImp.findAll();
//    }
//
//    public ProductModel searchProductById(Long id) {
//        Optional<ProductModel> product = productRepositoryImp.findById(id);
//        return product.orElse(null);
//    }
//
//    public ProductModel createProduct(ProductModel user) {
//        return productRepositoryImp.save(user);
//    }
//
//    public void deleteProductByID(long id) {
//        productRepositoryImp.deleteById(id);
//    }
//
//}
