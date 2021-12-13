package applications;

import dao.UserDao;
import dto.product.ProductWithCommentDto;
import dto.user.UserWithCommentListDto;
import entity.Product;
import entity.User;
import entityservice.ProductEntityService;
import entityservice.UserEntityService;

import java.util.List;
import java.util.Scanner;

public class FindUserCommentListApp {
    public static void main(String[] args) {
        findAndPrintAllUsers();
    }

    private static void findAndPrintAllUsers() {
        UserEntityService userEntityService = new UserEntityService();
        Long selectedUserId;
        Scanner input = new Scanner(System.in);
        List<User> userList = userEntityService.findAll();

        for (User user : userList) {
            System.out.println(user.getId() + "  " + user.getFirstName() + " " + user.getLastName());
        }
        System.out.print("Lütfen yorumlarını listelemek istediğiniz kullanıcının numarasını giriniz: ");
        selectedUserId = input.nextLong();
        input.close();

        findAndPrintUserWithComments(selectedUserId);
    }

    private static void findAndPrintUserWithComments(Long selectedUserId) {
        UserDao service = new UserDao();
        UserWithCommentListDto user = service.findUserWithProductAndCommentListByUserId(selectedUserId);

        if (user != null) {
            System.out.println("Kullanıcı ID : " + user.getUserId());
            System.out.println("Adı Soyadı :" + user.getUserFirstName());
            for (ProductWithCommentDto productWithCommentDto : user.getProductWithCommentList()) {
                System.out.println(
                        "Ürün Adı : " + productWithCommentDto.getProductName() + " \n"
                                + "Yorum Tarihi : " + productWithCommentDto.getCommentDate() + " \n"
                                + "Yorum : " + productWithCommentDto.getProductComment());
                System.out.println("--------------------------------------");
            }
        } else {
            System.out.println("Kayıt bulunamadı");
        }
    }
}
