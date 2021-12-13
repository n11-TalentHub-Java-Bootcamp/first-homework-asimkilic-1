package applications;

import dto.product_comment.UserAndProductCommentDetailsDto;
import entity.Product;
import entityservice.ProductCommentEntityService;
import entityservice.ProductEntityService;

import java.util.List;
import java.util.Scanner;

public class FindProductCommentApp {

    public static void main(String[] args) {
        findAndPrintAllProduct();
    }

    private static void findAndPrintAllProduct() {
        ProductEntityService productEntityService = new ProductEntityService();
        Long selectedProductId;
        Scanner input = new Scanner(System.in);
        List<Product> productsList = productEntityService.findAll();

        for (Product product : productsList) {
            System.out.println(product.getId() + "  " + product.getProductName());
        }
        System.out.print("Lütfen yorumlarını listelemek istediğiniz ürün numarasını giriniz: ");
        selectedProductId = input.nextLong();
        input.close();

        findAndPrintProductWithComments(selectedProductId);
    }

    private static void findAndPrintProductWithComments(Long selectedProductId) {
        int counter = 1;
        List<UserAndProductCommentDetailsDto> userAndProductCommentDetails;
        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();
        userAndProductCommentDetails = productCommentEntityService.findCommentListByProductId(selectedProductId);

        for (UserAndProductCommentDetailsDto userAndProductCommentDetail : userAndProductCommentDetails) {
            if (userAndProductCommentDetail.getComment() != null) {
                System.out.println("------------------ " + counter + ". Detay --------------------");
                System.out.println("Adı Soyadı: " + userAndProductCommentDetail.getUserFirstName() + " " + userAndProductCommentDetail.getUserLastName());
                System.out.println("Ürün Adı : " + userAndProductCommentDetail.getProductName());
                System.out.println("Ürün Fiyatı : " + userAndProductCommentDetail.getPrice());
                System.out.println("Tarih: " + userAndProductCommentDetail.getCommentDate());
                System.out.println("Yorum : " + userAndProductCommentDetail.getComment());

                counter++;
            } else {
                System.out.println();
                System.out.println("###  Görüntülemek istediğiniz ürüne ait yorum yoktur ###");
            }
        }
    }
}
