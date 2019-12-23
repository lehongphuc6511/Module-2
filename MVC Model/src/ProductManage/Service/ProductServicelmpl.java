package ProductManage.Service;

import ProductManage.Model.Product;

import java.util.List;

public interface ProductServicelmpl {
    List<Product> findAll();
    void save(Product product);
    void remove(int id);
    void update(int id, Product product);
    Product findById(int id);
}
