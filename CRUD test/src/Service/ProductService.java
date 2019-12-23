package Service;

import Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> showAllProduct();

    Product findById(int id);

    void update(int id, Product product);

    void save(Product product);

    void delete(int id);
}
