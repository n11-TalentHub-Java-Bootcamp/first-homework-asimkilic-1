package entityservice;

import dao.ProductDao;
import entity.Product;

import java.util.List;

public class ProductEntityService {
    private ProductDao productDao;

    public ProductEntityService() {
        productDao = new ProductDao();
    }

    public List<Product> findAll() {
        // returns all product list
        return productDao.findAll();
    }
}
