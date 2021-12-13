package dao;

import base.BaseDao;
import dto.product_comment.ProductWithCountOfCommentDto;
import dto.product_comment.UserAndProductCommentDetailsDto;
import entity.ProductComment;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentDao extends BaseDao {

    // It returns all comments' with ID's
    public List<ProductComment> findAll() {
        Query query = getCurrentSession().createQuery("select pc from ProductComment pc");
        return query.list();
    }


    // It returns product's comment list which is given productId
    public List<UserAndProductCommentDetailsDto> findCommentListByProductId(Long productId) {

        String sql = "select new " +
                UserAndProductCommentDetailsDto.class.getName() +
                " (p.name,  c.name,  p.price,  u.firstName, u.lastName, u.email,  u.cellPhone, pc.comment,  pc.commentDate) " +
                "from Product p  " +
                "left join ProductComment pc ON p.id = pc.productId  " +
                "left join User u ON pc.userId = u.id  " +
                "left join Category c ON c.id = p.categoryId " +
                "WHERE p.id = :productId";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("productId", productId);
        return query.list();
    }


    // returns all products with count of comment
    public List<ProductWithCountOfCommentDto> findAllProductListWithCommentCount() {
        String sql = "select new " +
                ProductWithCountOfCommentDto.class.getName() +
                " ( p.id, p.name, p.price, count(pc.id)) " +
                "from Product p " +
                "left join ProductComment pc on p.id = pc.productId " +
                "group by p.id order by p.id";
        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }
}
