package applications;

import dto.product_comment.UserAndProductCommentDetailsDto;
import entityservice.ProductCommentEntityService;

import java.util.List;

public class FindProductCommentApp {
    public static void main(String[] args) {
        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();
        List<UserAndProductCommentDetailsDto> userAndProductCommentDetails = productCommentEntityService.findCommentListByProductId(2L);

        for (UserAndProductCommentDetailsDto userAndProductCommentDetail : userAndProductCommentDetails) {
            System.out.println(userAndProductCommentDetail);
        }
    }
}
