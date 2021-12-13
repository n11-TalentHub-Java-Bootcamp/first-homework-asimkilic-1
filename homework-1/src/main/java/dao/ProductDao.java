package dao;

import base.BaseDao;
import entity.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductDao extends BaseDao {

    public List<Product> findAll() {
        // It finds and returns all products with all columns
        Query query = getCurrentSession().createQuery("select product from Product product");
        return query.list();
    }
}
