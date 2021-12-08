package dao;

import base.BaseDao;
import dto.product.ProductWithCommentDto;
import dto.user.UserWithCommentListDto;
import entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao extends BaseDao {

    public List<User> findAll() {
        Query query = getCurrentSession().createQuery("select user from User user");
        return query.list();
    }

    public UserWithCommentListDto findUserWithProductAndCommentListByUserId(Long userId) {
        if (findUserCommentCountByUserId(userId) < 1) {
            return null;
        }
        UserWithCommentListDto userWithCommentListDto = new UserWithCommentListDto();
        String productWithCommentSql = " select new " + ProductWithCommentDto.class.getName() + " (p.name, pc.comment, pc.commentDate )" +
                " from Product p left join ProductComment pc on p.id = pc.productId where pc.userId = :userId";
        Query queryUserWithCommentList = getCurrentSession().createQuery(productWithCommentSql);
        queryUserWithCommentList.setParameter("userId", userId);

        userWithCommentListDto.setProductWithCommentList(queryUserWithCommentList.list());
        userWithCommentListDto.setUserId(userId);
        userWithCommentListDto.setUserFirstName(findUserFirstNameByUserId(userId));
        return userWithCommentListDto;
    }

    public Long findUserCommentCountByUserId(Long userId) {
        String sql = "select count(pc.id) from ProductComment pc where pc.userId = :userId";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("userId", userId);
        return (Long) query.getSingleResult();
    }

    public String findUserFirstNameByUserId(Long userId) {
        String sql = "select u.firstName from User u where u.id = :userId";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("userId", userId);
        return (String) query.getSingleResult();
    }

    public String findUserLastNameByUserId(Long userId) {
        String sql = "select u.lastName from User u where u.id = :userId";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("userId", userId);
        return (String) query.getSingleResult();
    }

    public String findUserFullNameByUserId(Long userId) {
        String sql = "select concat_ws(' ', u.FIRST_NAME, u.LAST_NAME) from public.USER u WHERE u.ID = :userId";
        Query query = getCurrentSession().createSQLQuery(sql);
        query.setParameter("userId", userId);
        return (String) query.getSingleResult();
    }

}
