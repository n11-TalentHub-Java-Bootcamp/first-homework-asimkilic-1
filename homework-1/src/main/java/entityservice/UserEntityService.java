package entityservice;

import dao.UserDao;
import dto.user.UserWithCommentListDto;
import entity.User;

import java.util.List;

public class UserEntityService {
    private UserDao userDao;

    public UserEntityService() {
        userDao = new UserDao();
    }

    public List<User> findAll() {
        // returns all users
        return userDao.findAll();
    }

    public UserWithCommentListDto findUserWithProductAndCommentListByUserId(Long userId) {
        // returns User's product comment if exist otherwise returns null
        return userDao.findUserWithProductAndCommentListByUserId(userId);
    }

    public Long findUserCommentCountByUserId(Long userId) {
        // returns user's count of comments
        return userDao.findUserCommentCountByUserId(userId);
    }

    public String findUserFirstNameByUserId(Long userId) {
        // returns user's first name
        return userDao.findUserFirstNameByUserId(userId);
    }

    public String findUserLastNameByUserId(Long userId) {
        // returns user's last name
        return userDao.findUserLastNameByUserId(userId);
    }

    public String findUserFullNameByUserId(Long userId) {
        //returns user's full name
        return userDao.findUserFullNameByUserId(userId);
    }
}
