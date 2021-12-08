package entityservice;

import dao.CategoryDao;
import entity.Category;

import java.util.List;

public class CategoryEntityService {
    private CategoryDao categoryDao;

    public CategoryEntityService() {
        this.categoryDao = new CategoryDao();
    }

    public List<Category> findAll() {
        // returns all category list
        return categoryDao.findAll();
    }
}
