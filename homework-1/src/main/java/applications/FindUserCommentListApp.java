package applications;

import dao.UserDao;
import dto.product.ProductWithCommentDto;
import dto.user.UserWithCommentListDto;

public class FindUserCommentListApp {
    public static void main(String[] args) {
        UserDao service = new UserDao();

        UserWithCommentListDto user = service.findUserWithProductAndCommentListByUserId(1L);
        if (user != null) {
            System.out.println("User ID : " + user.getUserId());
            System.out.println("First Name :" + user.getUserFirstName());
            for (ProductWithCommentDto productWithCommentDto : user.getProductWithCommentList()) {
                System.out.println("\n"
                        + "Product Name : " + productWithCommentDto.getProductName() + " \n"
                        + "Comment Date : " + productWithCommentDto.getCommentDate() + " \n"
                        + "Comment : " + productWithCommentDto.getProductComment());
                System.out.println("--------------------------------------");
            }
        } else {
            System.out.println("Not found");
        }
    }
}
