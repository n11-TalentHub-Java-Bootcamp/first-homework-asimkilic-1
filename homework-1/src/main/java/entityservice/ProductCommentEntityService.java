package entityservice;

import dao.ProductCommentDao;
import dto.product_comment.ProductWithCountOfCommentDto;
import dto.product_comment.UserAndProductCommentDetailsDto;
import org.hibernate.Session;

import java.util.List;

public class ProductCommentEntityService {


    private ProductCommentDao productCommentDao;

    public ProductCommentEntityService() {
        productCommentDao = new ProductCommentDao();
    }

    public List<UserAndProductCommentDetailsDto> findCommentListByProductId(Long productId) {
        // returns product's comment list
        return productCommentDao.findCommentListByProductId(productId);
    }

    public List<ProductWithCountOfCommentDto> findAllProductListWithCommentCount() {
        // returns all products with count of comment
        return productCommentDao.findAllProductListWithCommentCount();
    }
}
